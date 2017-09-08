package core;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;

import core.network.Net;
import pojo.Airport;
import pojo.arrays.Airports;

public class FSAirports {
	private Airports airports;
	private Gson gson=new Gson();
	
	public FSAirports(){
		super();
		try {
			initAirports();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void initAirports() throws Exception {
		// TODO Auto-generated method stub
		StringBuilder endpoint = new StringBuilder("https://api.flightstats.com/flex/airports/rest/v1/json/active");
		String uri = endpoint.append(Credentials.getAuthentication()).toString();
		String response = Net.get(uri);
		airports = gson.fromJson(response,Airports.class);
	}
	
	public String getJson() {
		return gson.toJson(airports);
	}
	
	public ArrayList<Airport> getAirportsByCountryCode(String country_code){
		ArrayList<Airport> array = new ArrayList<Airport>();
		Iterator<Airport> i = airports.getAirports().iterator();
		while(i.hasNext()) {
			Airport airport = i.next();
			if(airport.getCountryCode().equals(country_code))
				array.add(airport);
		}
		return array;
	}
	
	public ArrayList<Airport> getAirportsByCity(String city){
		ArrayList<Airport> array = new ArrayList<Airport>();
		Iterator<Airport> i = airports.getAirports().iterator();
		while(i.hasNext()) {
			Airport airport = i.next();
			if(airport.getCity()!=null)
				if(airport.getCity().equals(city))
					array.add(airport);
		}
		return array;
	}
	
	public ArrayList<Airport> getAirportsByCityCode(String city_code){
		ArrayList<Airport> array = new ArrayList<Airport>();
		Iterator<Airport> i = airports.getAirports().iterator();
		while(i.hasNext()) {
			Airport a = i.next();
			if(a.getCityCode()!=null)
				if(a.getCityCode().equals(city_code))
					array.add(a);
		}
		return array;
	}
	
	
	public ArrayList<Airport> getAirportsByRegion(String region){
		ArrayList<Airport> array = new ArrayList<Airport>();
		Iterator<Airport> i = airports.getAirports().iterator();
		while(i.hasNext()) {
			Airport airport = i.next();
			if(airport.getRegionName()!=null)
				if(airport.getRegionName().equals(region))
					array.add(airport);
		}
		return array;
	}
	
	public int size() {
		return airports.getAirports().size();
	}
	
}

package core;


import java.util.ArrayList;
import java.util.Iterator;
import com.google.gson.Gson;
import core.network.Net;
import pojo.Airline;
import pojo.arrays.Airlines;

public class FSAirlines {

	private Airlines airlines;
	private Gson gson;
	
	public FSAirlines() {
		super();
		gson = new Gson();
		try {
			initAirlines();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private void initAirlines() throws Exception{
		String endpoint = "https://api.flightstats.com/flex/airlines/rest/v1/json/active";
		String uri = endpoint+Credentials.getAuthentication();
		String response = Net.get(uri);
		airlines = gson.fromJson(response,Airlines.class);
	}
	
	public Airlines getAll() throws Exception{
		return airlines;
	}
	
	public String getJson() {
		return gson.toJson(airlines);
	}
	
	public Airline getAirlineByName(String name) {
		 boolean found = false;
		 Airline a=null;
		 Iterator<Airline> i = airlines.getAirlines().iterator();
		 while(i.hasNext() || found) {
			 a = i.next();
			 if(a.getName().trim().equals(name.trim())) {
				 found=true;
			 }
		 }
		return a;
	}
	
	public Airlines getAirlineByIata(String iata) {
		Airlines airlines= new Airlines();
		ArrayList<Airline> array = new ArrayList<Airline>();
		
		Iterator<Airline> iterator = airlines.getAirlines().iterator();
		while(iterator.hasNext()) {
			Airline airline = iterator.next();
			if(airline.getIata().trim().toLowerCase().equals(iata.toLowerCase().trim())) 
				array.add(airline);
		}
		airlines.setAirlines(array);
		return airlines;
	}
	
}

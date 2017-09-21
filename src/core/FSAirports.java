package core;

import java.util.ArrayList;
import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import core.network.Net;
import pojo.Airport;
import pojo.arrays.Airports;


public class FSAirports {
	private Airports airports;
	private boolean filledAirports=false;
	private Gson gson= new Gson();
	private boolean debug=false;
        
        private String methodVersion=MethodVersion.METHOD_VERSION_NEW;
        
        
	public FSAirports(){
		super();

	}

	public Airports getAllAirports() {
		// TODO Auto-generated method stub
                
		try {
                    StringBuilder endpoint = new StringBuilder("https://api.flightstats.com/flex/airports/rest/v1/json/active");
                    String uri = endpoint.append(Credentials.getAuthentication()).toString();
                    String response = Net.get(uri,this.isDebug(),this.getMethodVersion());
                    airports = gson.fromJson(response,Airports.class);
                    filledAirports=true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
                
                return airports;
                
	}
	
	public String getJson() {
            
                if(!filledAirports){
                    this.getAllAirports();
                }
		return gson.toJson(airports);
	}
	
	public Airport getAirportByFS(String fs){
                Airport airport=null;
                
		try {
                    StringBuilder endpoint = new StringBuilder("https://api.flightstats.com/flex/airports/rest/v1/json/fs/"+fs);
                    String uri = endpoint.append(Credentials.getAuthentication()).toString();
                    String response = Net.get(uri,this.isDebug(),this.getMethodVersion());
                    
                    response=response.replace("{\"airport\":{","{");
                    response=response.substring(0, response.length() - 1);
                    
                    airport = gson.fromJson(response,Airport.class);
                    
		} catch (Exception e) {
			e.printStackTrace();
		}
                
                return airport;
	}
	
	
	public ArrayList<Airport> getAirportsByCountryCode(String country_code){
            
                if(!filledAirports){
                    this.getAllAirports();
                }
            
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
            
                if(!filledAirports){
                    this.getAllAirports();
                }
            
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
                if(!filledAirports){
                    this.getAllAirports();
                }
                
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
                if(!filledAirports){
                    this.getAllAirports();
                }
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
	
        
            public boolean isDebug() {
                return debug;
            }

            public void setDebug(boolean debug) {
                this.debug = debug;
            }


        public String getMethodVersion() {
            return methodVersion;
        }

        public void setMethodVersion(String methodVersion) {
            this.methodVersion = methodVersion;
        }

        
}

package core;


import com.google.gson.Gson;

import core.network.Net;
import pojo.arrays.Airlines;

public class FSAirlines {

	private Gson gson;
	Airlines airlines;
	
	public FSAirlines() {
		airlines = new Airlines();
		gson = new Gson();
		
	}
	
	public Airlines getAirlines() throws Exception{
		String endpoint = "https://api.flightstats.com/flex/airlines/rest/v1/json/active";
		String uri = addCredentials(endpoint);
		Airlines airlines= new Airlines();
		String response = Net.get(endpoint);
		airlines = gson.fromJson(response,Airlines.class);
		return airlines;
	}
	
}

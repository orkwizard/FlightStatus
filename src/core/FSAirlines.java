package core;

import org.apache.http.client.methods.HttpGet;

import com.google.gson.Gson;

import pojo.arrays.Airlines;

public class FSAirlines {

	private Gson gson;
	private HttpGet get;
	Airlines airlines;
	
	public FSAirlines() {
		airlines = new Airlines();
		gson = new Gson();
		
	}
	
	
}

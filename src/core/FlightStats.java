package core;

import java.io.IOException;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import pojo.FlightStatus;
import pojo.FlightStatusTrack;
import pojo.arrays.Airlines;
import pojo.arrays.Airports;
import pojo.arrays.FIDS;

public class FlightStats {

	private static String appId = "95f48407";
	private static String appKey = "819b4d571c001301b03b8ee6855b1780";
	private Gson gson;
	private HttpGet get;
	
	
	public FlightStats() {
		gson = new Gson();
	}
	private String get(String endpoint) throws Exception {
		String uri = endpoint;
		String responseBody;
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet(uri);
			System.out.println("Executing request :--->" + httpget.getRequestLine());
			
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				
				@Override
				public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
					// TODO Auto-generated method stub
					int status = response.getStatusLine().getStatusCode();
					if(status >=200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					}else
					{
						throw new ClientProtocolException("Unexpected response status " + status);
					}
				}
			};
		
			responseBody = httpclient.execute(httpget,responseHandler);
			//System.out.println("----------------------------------------");
	        //System.out.println(responseBody);
		}finally {
			httpclient.close();
		}
		return responseBody;
	}
	private String addCredentials(String endpoint) {
		return endpoint+"?appId="+appId+"&appKey="+appKey;
	}
	
	//Aeropuertos
	public Airports getAirports() throws Exception {
		String endpoint = "https://api.flightstats.com/flex/airports/rest/v1/json/active";
		String uri = addCredentials(endpoint);
		Airports airports= new Airports();
		String response = get(uri);
		//System.out.println("Data :---" + response);
		airports = gson.fromJson(response,Airports.class);
		return airports;
	}
	public Airports getAirportsByCountryCode(String countrycode) throws Exception {
		Airports airports = new Airports();
		String endpoint = "https://api.flightstats.com/flex/airports/rest/v1/json/countryCode/"+countrycode;
		String uri = addCredentials(endpoint);
		String response = get(uri);
		airports = gson.fromJson(response,Airports.class);
		//System.out.println("Data :--->>>" + response);
		return airports;
	}
	public Airports getAirportsByCityCode(String citycode) throws Exception{
		String endpoint = "https://api.flightstats.com/flex/airports/rest/v1/json/cityCode/"+citycode;
		String uri = addCredentials(endpoint);
		Airports airports = new Airports();
		String response = get(uri);
		System.out.println("Data:->>>>>" + response);
		airports = gson.fromJson(response,Airports.class);		
		return airports;
	}
	
	//Aerolineas

	public Airlines getAirlines() throws Exception{
		String endpoint = "https://api.flightstats.com/flex/airlines/rest/v1/json/active";
		String uri = addCredentials(endpoint);
		Airlines airlines= new Airlines();
		String response = get(uri);
		airlines = gson.fromJson(response,Airlines.class);
		return airlines;
	}
	
	public FIDS getFIDS(FidsParameters params) {
		FIDS fids;
		
		
		
		return fids;
	}
	
	
	
	
	
	//Estatus
	public FlightStatusTrack getFlightStatusArrivals(String airport,int year,int month,int day,int hourOfDay,boolean utc, int numHours,String carrier,String codeType,int maxFlights,String extendedOptions) throws Exception {
		StringBuilder endpoint = new StringBuilder();
		//"https://api.flightstats.com/flex/flightstatus/rest/v2/json/airport/status/CUN/arr/2017/9/6/11?appId=95f48407&appKey=819b4d571c001301b03b8ee6855b1780&utc=false&numHours=1&maxFlights=5"
		endpoint.append("https://api.flightstats.com/flex/flightstatus/rest/v2/json/airport/status/");
		endpoint.append(airport+"/arr/");
		endpoint.append(year+"/");
		endpoint.append(month+"/");
		endpoint.append(day+"/");
		endpoint.append(hourOfDay+"/");
		endpoint.append("?appId="+appId+"&appKey="+appKey);
		endpoint.append("&utc="+utc);
		endpoint.append("&numHours="+ numHours);
		if(maxFlights>0)
			endpoint.append("&maxFlights=" + maxFlights);
		System.out.println(endpoint.toString());
		String response = get (endpoint.toString());
	
		FlightStatusTrack flightstatus = gson.fromJson(response,FlightStatusTrack.class);
		
		return flightstatus;
	}
	
	
	
	
	
	public final static void main(String[] args) {
		
		FlightStats fs = new FlightStats();
		try {
			//fs.getAirlines();
			//fs.getAirports();
			//fs.getAirportsByCityCode("CUN");
			
			Airlines airlines = fs.getAirlines();
			//Airports airports =  fs.getAirportsByCountryCode("MX");
			//FlightStatusTrack fst = fs.getFlightStatusArrivals("CUN",2017, 9,6, 11,false,1,"","",5,"");
			
			System.out.println(airlines.toString());
			//System.out.println(airports.toString());
			//System.err.println(fst.toString());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}

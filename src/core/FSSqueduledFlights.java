package core;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import core.network.Net;
import pojo.ExampleSquedule;
import core.utils.FSScheduleParams;



/**
 * @author Humberto
 * 
 * Obtiene los vuelos agendados
 * 
 * 
 */
public class FSSqueduledFlights {

	private ExampleSquedule exampleSquedule;
	private Gson gson;
	
	
	public FSSqueduledFlights() {
		super();
		gson = new Gson();
		
	}
	
	
	public String getJson() {
		return gson.toJson(exampleSquedule);
	}
	
	public ExampleSquedule getArrivingSchedule(FSScheduleParams params) throws Exception{
            
            return this.getSchedule( params,  "arriving");
        
	}
	
	public ExampleSquedule getDepartingSchedule(FSScheduleParams params) throws Exception{
            
		return this.getSchedule( params,  "departing");
                
                
	}
	public ExampleSquedule getSchedule(FSScheduleParams params, String type) throws Exception{
            
		StringBuilder endpoint = new StringBuilder("https://api.flightstats.com/flex/schedules/rest/v1/json/flight/");
                
               
		endpoint.append(params.getCarrier()+"/");
		endpoint.append(params.getFlightnumber()+"/");
		endpoint.append(type+"/");
		endpoint.append(params.getYear()+"/");
		endpoint.append(params.getMonth()+"/");
		endpoint.append(params.getDay()+"/");
		endpoint.append(Credentials.getAuthentication());
		for(String key:params.getParams().keySet()) {
			endpoint.append("&").append(key).append("=").append(params.getParamObject(key));
		}
		String response = Net.get(endpoint.toString());
                
		exampleSquedule = gson.fromJson(response,ExampleSquedule.class);
                
		return exampleSquedule;
                
	}
        
        
        
        
        
	
        

	public int size() {
		// TODO Auto-generated method stub
		return exampleSquedule.getScheduledFlights().size();
	}
	
}

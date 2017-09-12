package core;


import com.google.gson.Gson;
import core.network.Net;
import pojo.ExampleSquedule;
import core.utils.FSScheduleParams;
import java.util.Iterator;
import java.util.List;
import pojo.ScheduledFlight;


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
	private boolean debug=false;


	
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
		String response = Net.get(endpoint.toString(), this.isDebug());
                
		exampleSquedule = gson.fromJson(response,ExampleSquedule.class);
                
                List<ScheduledFlight> scheduledFlightsFix = exampleSquedule.getScheduledFlights();
                
                
                    
                        for (Iterator<ScheduledFlight> iter = scheduledFlightsFix.listIterator(); iter.hasNext(); ) {
                            ScheduledFlight a = iter.next();

                            if ((params.getArrivingAt()!=null && !a.getArrivalAirportFsCode().equals(params.getArrivingAt()))
                                ||(params.getDepartingAt()!=null && !a.getDepartureAirportFsCode().equals(params.getDepartingAt()))
                            ) {
                                iter.remove();
                            }
                            

                        }
                
                
		return exampleSquedule;
                
	}
        
        
            public boolean isDebug() {
                return debug;
            }

            public void setDebug(boolean debug) {
                this.debug = debug;
            }

        
        
	
        

	public int size() {
		// TODO Auto-generated method stub
		return exampleSquedule.getScheduledFlights().size();
	}
	
}

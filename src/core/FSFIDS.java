package core;

import com.google.gson.Gson;

import core.network.Net;
import core.utils.FIDSParams;
import pojo.arrays.FIDS;

import core.MethodVersion;

public class FSFIDS {

	private String airport;
	private FIDSParams parameters;
	private FIDS fids;
	private Gson gson;
	private boolean debug=false;
        
        private String methodVersion=MethodVersion.METHOD_VERSION_NEW;
        
        
	public FSFIDS(String a) {
		super();
		airport = a;
		parameters = new  FIDSParams();
		gson = new Gson();
	}

	
	public FIDS getFlightStatusArrivals() throws Exception {
		StringBuilder endpoint = new StringBuilder("https://api.flightstats.com/flex/fids/rest/v1/json/");
		endpoint.append(airport)
		.append("/arrivals")
		.append(Credentials.getAuthentication());   // ?appId=").append(appId).append("&appKey=").append(appKey);
		for(String key:parameters.getParams().keySet()) {
			endpoint.append("&").append(key).append("=").append(parameters.getParamObject(key));
		}
		String response = Net.get(endpoint.toString(),this.isDebug());
		fids = gson.fromJson(response,FIDS.class);
		return fids;
		
	}
	
	public void updateAirport(String a) {
		airport = a;
	}
	
	public void setCodeType(String codetype) {
		parameters.addParam("codeType", codetype);
	}
	
	public void setRequestedFields(String fields) {
		parameters.addParam("requestedFields",fields);
	}
	
	public void setSortFields(String value) {
		parameters.addParam("sortFields", value);
	}
	public void setExcludeAirlines(String value) {
		parameters.addParam("excludeAirlines", value);
	}
	public void setIncludeAirlines(String value) {
		parameters.addParam("includeAirlines", value);
	}
	
	public void setIncludeCodeshares(String value) {
		parameters.addParam("includeCodeshares", value);
	}
	
	public void setTerminal(String value) {
		parameters.addParam("terminal", value);
	}
	
	public void setTimeFormat(String value) {
		parameters.addParam("timeFormat", value);
	}
	
	public void setTimeWindowBegin(String value) {
		parameters.addParam("timeWindowBegin", value);
	}
	
	public void setTimeWindowEnd(String value) {
		parameters.addParam("timeWindowEnd", value);
	}

	public void setMaxFlights(String value) {
		parameters.addParam("maxFlights", value);
	}
	
	public void setLastMinutes(String value) {
		parameters.addParam("maxFlights", value);
	}
	
	public void setBoardingMinutes(String value) {
		parameters.addParam("boardingMinutes	", value);
	}
	
	public void setUseRunwayTimes(String value) {
		parameters.addParam("useRunwayTimes", value);
	}
	
	public void setExcludeCargoOnlyFlights(String value) {
		parameters.addParam("excludeCargoOnlyFlights", value);
	}
	
	public void setExtendedOptions(String value) {
		parameters.addParam("extendedOptions", value);
	}
	
	public void removeParameters() {
		parameters.getParams().clear();
	}
	
	public boolean updateParameter(String key,String value) {
		boolean valid = parameters.deleteParam(key);
		if(valid)
			parameters.addParam(key, value);
		return valid;
	}
	
	
	public int size() {
		return fids.getFidsData().size();
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

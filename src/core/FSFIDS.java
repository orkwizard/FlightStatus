package core;

import core.utils.FIDSParams;
import pojo.arrays.FIDS;

public class FSFIDS {

	private String airport;
	private FIDSParams parameters;
	private FIDS fids;
	
	public FSFIDS(String a,FIDSParams p) {
		super();
		airport = a;
		parameters = p;
	}
	
	
	private FIDS getFIDS() {
		
		
		return null;
	}
	
	private void initFIDS() {
		// TODO Auto-generated method stub
		
		
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
	
	
	public int size() {
		return fids.getFidsData().size();
	}
	
}

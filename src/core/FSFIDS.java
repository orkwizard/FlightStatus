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
	
	
	
	
	

	public int size() {
		return fids.getFidsData().size();
	}
	
}

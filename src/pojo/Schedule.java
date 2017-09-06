package pojo;

import java.util.ArrayList;

import pojo.arrays.Downlines;
import pojo.arrays.Uplines;

public class Schedule {

	private String flightType;
	private String serviceClasses;
	private String restrictions;
	private ArrayList<Upline> uplines;
	private ArrayList<Downline> downlines;
	
	
	
	public Schedule() {
		super();
	}



	public String getFlightType() {
		return flightType;
	}



	public void setFlightType(String flightType) {
		this.flightType = flightType;
	}



	public String getServiceClasses() {
		return serviceClasses;
	}



	public void setServiceClasses(String serviceClasses) {
		this.serviceClasses = serviceClasses;
	}



	public String getRestrictions() {
		return restrictions;
	}



	public void setRestrictions(String restrictions) {
		this.restrictions = restrictions;
	}



	public ArrayList<Upline> getUplines() {
		return uplines;
	}



	public void setUplines(ArrayList<Upline> uplines) {
		this.uplines = uplines;
	}



	public ArrayList<Downline> getDownlines() {
		return downlines;
	}



	public void setDownlines(ArrayList<Downline> downlines) {
		this.downlines = downlines;
	}



	@Override
	public String toString() {
		return "Schedule [flightType=" + flightType + ", serviceClasses=" + serviceClasses + ", restrictions="
				+ restrictions + ", uplines=" + uplines + ", downlines=" + downlines + "]";
	}
	
	
	
}

package pojo;

import pojo.arrays.Downlines;
import pojo.arrays.Uplines;

public class Schedule {

	private String flightType;
	private String serviceClasses;
	private String restrictions;
	private Uplines uplines;
	private Downlines downlines;
	
	
	
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
	public Uplines getUplines() {
		return uplines;
	}
	public void setUplines(Uplines uplines) {
		this.uplines = uplines;
	}
	public Downlines getDownlines() {
		return downlines;
	}
	public void setDownlines(Downlines downlines) {
		this.downlines = downlines;
	}
	@Override
	public String toString() {
		return "Schedule [flightType=" + flightType + ", serviceClasses=" + serviceClasses + ", restrictions="
				+ restrictions + ", uplines=" + uplines.toString() + ", downlines=" + downlines.toString() + "]";
	}
	
	
	
	
}

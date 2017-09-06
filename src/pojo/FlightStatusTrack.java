package pojo;

import java.io.Serializable;
import java.util.ArrayList;

import pojo.arrays.FlightStatuses;

public class FlightStatusTrack implements Serializable {

	private Request request;
	private Apendix appendix;
	private ArrayList<FlightStatus> flightStatuses;
	
	
	public FlightStatusTrack() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Request getRequest() {
		return request;
	}


	public void setRequest(Request request) {
		this.request = request;
	}


	public Apendix getAppendix() {
		return appendix;
	}


	public void setAppendix(Apendix appendix) {
		this.appendix = appendix;
	}


	public ArrayList<FlightStatus> getFlightStatuses() {
		return flightStatuses;
	}


	public void setFlightStatuses(ArrayList<FlightStatus> flightStatuses) {
		this.flightStatuses = flightStatuses;
	}


	@Override
	public String toString() {
		return "FlightStatusTrack [request=" + request + ", appendix=" + appendix + ", flightStatuses=" + flightStatuses
				+ "]";
	}
	
	
	
	
	
	
	
}

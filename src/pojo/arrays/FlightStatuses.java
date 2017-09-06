package pojo.arrays;

import java.io.Serializable;
import java.util.ArrayList;

import pojo.FlightStatus;

public class FlightStatuses implements Serializable{

	private ArrayList<FlightStatus> flightStatuses;

	public FlightStatuses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<FlightStatus> getFlightStatuses() {
		return flightStatuses;
	}

	public void setFlightStatuses(ArrayList<FlightStatus> flightStatuses) {
		this.flightStatuses = flightStatuses;
	}
	
	
}

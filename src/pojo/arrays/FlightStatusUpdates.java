package pojo.arrays;

import java.util.ArrayList;

import pojo.FlightStatusUpdate;

public class FlightStatusUpdates {

	private ArrayList<FlightStatusUpdate> flightStatusUpdate;

	
	public FlightStatusUpdates() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArrayList<FlightStatusUpdate> getFlightStatusUpdate() {
		return flightStatusUpdate;
	}

	public void setFlightStatusUpdate(ArrayList<FlightStatusUpdate> flightStatusUpdate) {
		this.flightStatusUpdate = flightStatusUpdate;
	}

	@Override
	public String toString() {
		return "FlightStatusUpdates [flightStatusUpdate=" + flightStatusUpdate + "]";
	}
	
	
	
}

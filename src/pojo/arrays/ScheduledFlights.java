package pojo.arrays;

import java.io.Serializable;
import java.util.ArrayList;

import pojo.ScheduledFlight;

public class ScheduledFlights implements Serializable{
	
	ArrayList<ScheduledFlight> scheduledFlights;

	
	
	public ScheduledFlights() {
		super();
	}

	public ArrayList<ScheduledFlight> getScheduledFlights() {
		return scheduledFlights;
	}

	public void setScheduledFlights(ArrayList<ScheduledFlight> scheduledFlights) {
		this.scheduledFlights = scheduledFlights;
	}

	@Override
	public String toString() {
		return "ScheduledFlights [scheduledFlights=" + scheduledFlights.toString() + "]";
	}
	
	

}

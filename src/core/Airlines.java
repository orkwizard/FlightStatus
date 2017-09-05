package core;

import java.io.Serializable;
import java.util.ArrayList;

import pojo.Airline;

public class Airlines implements Serializable{
	
	ArrayList<Airline> airlines;

	
	
	public Airlines() {
		super();
	}

	public ArrayList<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}

	@Override
	public String toString() {
		return "Airlines [airlines=" + airlines.toString() + "]";
	}
	
	

}

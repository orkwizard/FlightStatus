package pojo;

import java.util.ArrayList;

import pojo.arrays.Airlines;
import pojo.arrays.Airports;
import pojo.arrays.Equipments;

public class Appendix {

	private 	ArrayList<Airline> airlines;
	private 	ArrayList<Airport> airports;
	private ArrayList<Equipment> equipments;
	
	
	public Appendix() {
		super();
	}
	
	public ArrayList<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(ArrayList<Airline> airlines) {
		this.airlines = airlines;
	}

	public ArrayList<Airport> getAirports() {
		return airports;
	}

	public void setAirports(ArrayList<Airport> airports) {
		this.airports = airports;
	}

	
	
	
	public ArrayList<Equipment> getEquipments() {
		return equipments;
	}

	public void setEquipments(ArrayList<Equipment> equipments) {
		this.equipments = equipments;
	}

	@Override
	public String toString() {
		return "Apendix [airlines=" + airlines + ", airports=" + airports + ", equipments=" + equipments + "]";
	}
	
	
	
}

package pojo.arrays;

import java.io.Serializable;
import java.util.ArrayList;

import pojo.Airport;

public class Airports implements Serializable{

		private ArrayList<Airport> airports;
		
		

		public Airports() {
			super();
		}

		public ArrayList<Airport> getAirports() {
			return airports;
		}

		public void setAirports(ArrayList<Airport> airports) {
			this.airports = airports;
		}

		@Override
		public String toString() {
			return "Airports [airports=" + airports.toString() + "]";
		}
		
		
		
}

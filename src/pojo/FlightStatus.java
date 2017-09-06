package pojo;

import java.io.Serializable;

import pojo.arrays.CodeShares;
import pojo.arrays.FlightStatusUpdates;
import pojo.arrays.IrregularOperations;

public class FlightStatus implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String flightId;
	private Airline carrier;
	private String carrierFsCode;
	private String flightNumber;
	private Airport departureAirport;
	private String departureAirportFsCode;
	private Airport arrivalAirport;
	private String arrivalAirportFsCode;
	private Airport divertedAirport;
	private String divertedAirportFsCode;
	private Times departureDate;
	private Times arrivalDate;
	private String status;
	private Schedule schedule;
	private OperationalTimes operationalTimes;
	private CodeShares codeshares;
	private Delay delays;
	private FlightDuration flightDurations;
	private AirportResource airportResources;
	private FlightEquipment flightEquipment;
	private FlightStatusUpdates flightStatusUpdates;
	private IrregularOperations irregularOperations;
	private Airline operatingCarrier;
	private String operatingCarrierFsCode;
	private Airline primaryCarrier;
	private String primaryCarrierFsCode;
	private ConfirmedIncident confirmedIncident;
	
	
	
	
	
	
	
	
	
	
	

}

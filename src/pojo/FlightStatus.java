package pojo;

import java.io.Serializable;
import java.util.ArrayList;

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
	private FlightStatusSchedule schedule;
	private OperationalTimes operationalTimes;
	private ArrayList<CodeShare> codeshares;
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
	
	public FlightStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public Airline getCarrier() {
		return carrier;
	}

	public void setCarrier(Airline carrier) {
		this.carrier = carrier;
	}

	public String getCarrierFsCode() {
		return carrierFsCode;
	}

	public void setCarrierFsCode(String carrierFsCode) {
		this.carrierFsCode = carrierFsCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Airport getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getDepartureAirportFsCode() {
		return departureAirportFsCode;
	}

	public void setDepartureAirportFsCode(String departureAirportFsCode) {
		this.departureAirportFsCode = departureAirportFsCode;
	}

	public Airport getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public String getArrivalAirportFsCode() {
		return arrivalAirportFsCode;
	}

	public void setArrivalAirportFsCode(String arrivalAirportFsCode) {
		this.arrivalAirportFsCode = arrivalAirportFsCode;
	}

	public Airport getDivertedAirport() {
		return divertedAirport;
	}

	public void setDivertedAirport(Airport divertedAirport) {
		this.divertedAirport = divertedAirport;
	}

	public String getDivertedAirportFsCode() {
		return divertedAirportFsCode;
	}

	public void setDivertedAirportFsCode(String divertedAirportFsCode) {
		this.divertedAirportFsCode = divertedAirportFsCode;
	}

	public Times getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Times departureDate) {
		this.departureDate = departureDate;
	}

	public Times getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Times arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public FlightStatusSchedule getSchedule() {
		return schedule;
	}

	public void setSchedule(FlightStatusSchedule schedule) {
		this.schedule = schedule;
	}

	public OperationalTimes getOperationalTimes() {
		return operationalTimes;
	}

	public void setOperationalTimes(OperationalTimes operationalTimes) {
		this.operationalTimes = operationalTimes;
	}

	

	public ArrayList<CodeShare> getCodeshares() {
		return codeshares;
	}

	public void setCodeshares(ArrayList<CodeShare> codeshares) {
		this.codeshares = codeshares;
	}

	public Delay getDelays() {
		return delays;
	}

	public void setDelays(Delay delays) {
		this.delays = delays;
	}

	public FlightDuration getFlightDurations() {
		return flightDurations;
	}

	public void setFlightDurations(FlightDuration flightDurations) {
		this.flightDurations = flightDurations;
	}

	public AirportResource getAirportResources() {
		return airportResources;
	}

	public void setAirportResources(AirportResource airportResources) {
		this.airportResources = airportResources;
	}

	public FlightEquipment getFlightEquipment() {
		return flightEquipment;
	}

	public void setFlightEquipment(FlightEquipment flightEquipment) {
		this.flightEquipment = flightEquipment;
	}

	public FlightStatusUpdates getFlightStatusUpdates() {
		return flightStatusUpdates;
	}

	public void setFlightStatusUpdates(FlightStatusUpdates flightStatusUpdates) {
		this.flightStatusUpdates = flightStatusUpdates;
	}

	public IrregularOperations getIrregularOperations() {
		return irregularOperations;
	}

	public void setIrregularOperations(IrregularOperations irregularOperations) {
		this.irregularOperations = irregularOperations;
	}

	public Airline getOperatingCarrier() {
		return operatingCarrier;
	}

	public void setOperatingCarrier(Airline operatingCarrier) {
		this.operatingCarrier = operatingCarrier;
	}

	public String getOperatingCarrierFsCode() {
		return operatingCarrierFsCode;
	}

	public void setOperatingCarrierFsCode(String operatingCarrierFsCode) {
		this.operatingCarrierFsCode = operatingCarrierFsCode;
	}

	public Airline getPrimaryCarrier() {
		return primaryCarrier;
	}

	public void setPrimaryCarrier(Airline primaryCarrier) {
		this.primaryCarrier = primaryCarrier;
	}

	public String getPrimaryCarrierFsCode() {
		return primaryCarrierFsCode;
	}

	public void setPrimaryCarrierFsCode(String primaryCarrierFsCode) {
		this.primaryCarrierFsCode = primaryCarrierFsCode;
	}

	public ConfirmedIncident getConfirmedIncident() {
		return confirmedIncident;
	}

	public void setConfirmedIncident(ConfirmedIncident confirmedIncident) {
		this.confirmedIncident = confirmedIncident;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "FlightStatus [flightId=" + flightId + ", carrier=" + carrier + ", carrierFsCode=" + carrierFsCode
				+ ", flightNumber=" + flightNumber + ", departureAirport=" + departureAirport
				+ ", departureAirportFsCode=" + departureAirportFsCode + ", arrivalAirport=" + arrivalAirport
				+ ", arrivalAirportFsCode=" + arrivalAirportFsCode + ", divertedAirport=" + divertedAirport
				+ ", divertedAirportFsCode=" + divertedAirportFsCode + ", departureDate=" + departureDate
				+ ", arrivalDate=" + arrivalDate + ", status=" + status + ", schedule=" + schedule
				+ ", operationalTimes=" + operationalTimes + ", codeshares=" + codeshares + ", delays=" + delays
				+ ", flightDurations=" + flightDurations + ", airportResources=" + airportResources
				+ ", flightEquipment=" + flightEquipment + ", flightStatusUpdates=" + flightStatusUpdates
				+ ", irregularOperations=" + irregularOperations + ", operatingCarrier=" + operatingCarrier
				+ ", operatingCarrierFsCode=" + operatingCarrierFsCode + ", primaryCarrier=" + primaryCarrier
				+ ", primaryCarrierFsCode=" + primaryCarrierFsCode + ", confirmedIncident=" + confirmedIncident + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}

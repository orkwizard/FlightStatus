package pojo;

public class Downline {

	private Airport arrivalAirport;
	private String fsCode;
	private String flightId;
	
	
	public Downline() {
		super();
	}
	public Airport getArrivalAirport() {
		return arrivalAirport;
	}
	public void setArrivalAirport(Airport arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}
	public String getFsCode() {
		return fsCode;
	}
	public void setFsCode(String fsCode) {
		this.fsCode = fsCode;
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	@Override
	public String toString() {
		return "Downline [arrivalAirport=" + arrivalAirport + ", fsCode=" + fsCode + ", flightId=" + flightId + "]";
	}
	
	
	
}

package pojo;

public class Upline {
	private Airport departureAirport;
	private String fsCode;
	private String flightId;
	
	
	
	public Upline() {
		super();
	}
	public Airport getDepartureAirport() {
		return departureAirport;
	}
	public void setDepartureAirport(Airport departureAirport) {
		this.departureAirport = departureAirport;
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
		return "Upline [departureAirport=" + departureAirport + ", fsCode=" + fsCode + ", flightId=" + flightId + "]";
	}
	
	
	
}

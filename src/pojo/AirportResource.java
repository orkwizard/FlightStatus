package pojo;

public class AirportResource {

	private String departureTerminal;
	private String departureGate;
	private String arrivalTerminal;
	private String arrivalGate;
	private String baggage;
	
	public AirportResource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public String getDepartureGate() {
		return departureGate;
	}
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}
	
	
	
	
	public String getDepartureTerminal() {
		return departureTerminal;
	}


	public void setDepartureTerminal(String departureTerminal) {
		this.departureTerminal = departureTerminal;
	}


	public String getArrivalTerminal() {
		return arrivalTerminal;
	}


	public void setArrivalTerminal(String arrivalTerminal) {
		this.arrivalTerminal = arrivalTerminal;
	}


	public String getArrivalGate() {
		return arrivalGate;
	}
	public void setArrivalGate(String arrivalGate) {
		this.arrivalGate = arrivalGate;
	}
	public String getBaggage() {
		return baggage;
	}
	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}
	@Override
	public String toString() {
		return "AirportResource [departureTerminal=" + departureTerminal + ", departureGate=" + departureGate
				+ ", arrivalTerminal=" + arrivalTerminal + ", arrivalGate=" + arrivalGate + ", baggage=" + baggage
				+ "]";
	}
	
	
}

package pojo;

public class AirportResource {

	private int departureTerminal;
	private String departureGate;
	private int arrivalTerminal;
	private String arrivalGate;
	private String baggage;
	
	public AirportResource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public int getDepartureTerminal() {
		return departureTerminal;
	}
	public void setDepartureTerminal(int departureTerminal) {
		this.departureTerminal = departureTerminal;
	}
	public String getDepartureGate() {
		return departureGate;
	}
	public void setDepartureGate(String departureGate) {
		this.departureGate = departureGate;
	}
	public int getArrivalTerminal() {
		return arrivalTerminal;
	}
	public void setArrivalTerminal(int arrivalTerminal) {
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

package pojo;

public class Delay {

	private int departureGateDelayMinutes;
	private int departureRunwayDelayMinutes;
	private int arrivalGateDelayMinutes;
	private int arrivalRunwayDelayMinutes;
	public Delay() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDepartureGateDelayMinutes() {
		return departureGateDelayMinutes;
	}
	public void setDepartureGateDelayMinutes(int departureGateDelayMinutes) {
		this.departureGateDelayMinutes = departureGateDelayMinutes;
	}
	public int getDepartureRunwayDelayMinutes() {
		return departureRunwayDelayMinutes;
	}
	public void setDepartureRunwayDelayMinutes(int departureRunwayDelayMinutes) {
		this.departureRunwayDelayMinutes = departureRunwayDelayMinutes;
	}
	public int getArrivalGateDelayMinutes() {
		return arrivalGateDelayMinutes;
	}
	public void setArrivalGateDelayMinutes(int arrivalGateDelayMinutes) {
		this.arrivalGateDelayMinutes = arrivalGateDelayMinutes;
	}
	public int getArrivalRunwayDelayMinutes() {
		return arrivalRunwayDelayMinutes;
	}
	public void setArrivalRunwayDelayMinutes(int arrivalRunwayDelayMinutes) {
		this.arrivalRunwayDelayMinutes = arrivalRunwayDelayMinutes;
	}
	@Override
	public String toString() {
		return "Delay [departureGateDelayMinutes=" + departureGateDelayMinutes + ", departureRunwayDelayMinutes="
				+ departureRunwayDelayMinutes + ", arrivalGateDelayMinutes=" + arrivalGateDelayMinutes
				+ ", arrivalRunwayDelayMinutes=" + arrivalRunwayDelayMinutes + "]";
	}
	
	
	
	
}

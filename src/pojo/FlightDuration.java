package pojo;

public class FlightDuration {

	private int scheduledBlockMinutes;
	private int blockMinutes;
	private int scheduledAirMinutes;
	private int airMinutes;
	private int scheduledTaxiOutMinutes;
	private int taxiOutMinutes;
	private int scheduledTaxiInMinutes;
	private int taxiInMinutes;
	public FlightDuration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getScheduledBlockMinutes() {
		return scheduledBlockMinutes;
	}
	public void setScheduledBlockMinutes(int scheduledBlockMinutes) {
		this.scheduledBlockMinutes = scheduledBlockMinutes;
	}
	public int getBlockMinutes() {
		return blockMinutes;
	}
	public void setBlockMinutes(int blockMinutes) {
		this.blockMinutes = blockMinutes;
	}
	public int getScheduledAirMinutes() {
		return scheduledAirMinutes;
	}
	public void setScheduledAirMinutes(int scheduledAirMinutes) {
		this.scheduledAirMinutes = scheduledAirMinutes;
	}
	public int getAirMinutes() {
		return airMinutes;
	}
	public void setAirMinutes(int airMinutes) {
		this.airMinutes = airMinutes;
	}
	public int getScheduledTaxiOutMinutes() {
		return scheduledTaxiOutMinutes;
	}
	public void setScheduledTaxiOutMinutes(int scheduledTaxiOutMinutes) {
		this.scheduledTaxiOutMinutes = scheduledTaxiOutMinutes;
	}
	public int getTaxiOutMinutes() {
		return taxiOutMinutes;
	}
	public void setTaxiOutMinutes(int taxiOutMinutes) {
		this.taxiOutMinutes = taxiOutMinutes;
	}
	public int getScheduledTaxiInMinutes() {
		return scheduledTaxiInMinutes;
	}
	public void setScheduledTaxiInMinutes(int scheduledTaxiInMinutes) {
		this.scheduledTaxiInMinutes = scheduledTaxiInMinutes;
	}
	public int getTaxiInMinutes() {
		return taxiInMinutes;
	}
	public void setTaxiInMinutes(int taxiInMinutes) {
		this.taxiInMinutes = taxiInMinutes;
	}
	@Override
	public String toString() {
		return "FlightDuration [scheduledBlockMinutes=" + scheduledBlockMinutes + ", blockMinutes=" + blockMinutes
				+ ", scheduledAirMinutes=" + scheduledAirMinutes + ", airMinutes=" + airMinutes
				+ ", scheduledTaxiOutMinutes=" + scheduledTaxiOutMinutes + ", taxiOutMinutes=" + taxiOutMinutes
				+ ", scheduledTaxiInMinutes=" + scheduledTaxiInMinutes + ", taxiInMinutes=" + taxiInMinutes + "]";
	}
	
	
}

package pojo;

public class FlightEquipment {
	
	private Equipment scheduledEquipment;
	private String scheduledEquipmentIataCode;
	private Equipment actualEquipment;
	private String actualEquipmentIataCode;
	private String tailNumber;
	
	public FlightEquipment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Equipment getScheduledEquipment() {
		return scheduledEquipment;
	}
	public void setScheduledEquipment(Equipment scheduledEquipment) {
		this.scheduledEquipment = scheduledEquipment;
	}
	public String getScheduledEquipmentIataCode() {
		return scheduledEquipmentIataCode;
	}
	public void setScheduledEquipmentIataCode(String scheduledEquipmentIataCode) {
		this.scheduledEquipmentIataCode = scheduledEquipmentIataCode;
	}
	public Equipment getActualEquipment() {
		return actualEquipment;
	}
	public void setActualEquipment(Equipment actualEquipment) {
		this.actualEquipment = actualEquipment;
	}
	public String getActualEquipmentIataCode() {
		return actualEquipmentIataCode;
	}
	public void setActualEquipmentIataCode(String actualEquipmentIataCode) {
		this.actualEquipmentIataCode = actualEquipmentIataCode;
	}
	public String getTailNumber() {
		return tailNumber;
	}
	public void setTailNumber(String tailNumber) {
		this.tailNumber = tailNumber;
	}
	@Override
	public String toString() {
		return "FlightEquipment [scheduledEquipment=" + scheduledEquipment + ", scheduledEquipmentIataCode="
				+ scheduledEquipmentIataCode + ", actualEquipment=" + actualEquipment + ", actualEquipmentIataCode="
				+ actualEquipmentIataCode + ", tailNumber=" + tailNumber + "]";
	}
	
	

}

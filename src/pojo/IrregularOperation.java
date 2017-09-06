package pojo;

public class IrregularOperation {

	private String type;
	private String newArrivalAirportFsCode;
	private String relatedFlightId;
	private String dateUtc;
	private String message;
	
	public IrregularOperation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNewArrivalAirportFsCode() {
		return newArrivalAirportFsCode;
	}

	public void setNewArrivalAirportFsCode(String newArrivalAirportFsCode) {
		this.newArrivalAirportFsCode = newArrivalAirportFsCode;
	}

	public String getRelatedFlightId() {
		return relatedFlightId;
	}

	public void setRelatedFlightId(String relatedFlightId) {
		this.relatedFlightId = relatedFlightId;
	}

	public String getDateUtc() {
		return dateUtc;
	}

	public void setDateUtc(String dateUtc) {
		this.dateUtc = dateUtc;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "IrregularOperation [type=" + type + ", newArrivalAirportFsCode=" + newArrivalAirportFsCode
				+ ", relatedFlightId=" + relatedFlightId + ", dateUtc=" + dateUtc + ", message=" + message + "]";
	}
	
	
}

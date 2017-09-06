package pojo;

public class CodeShare {

	private Airline carrier;
	private String fsCode;
	private String flightNumber;
	private String relationship;
	
	public CodeShare() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Airline getCarrier() {
		return carrier;
	}

	public void setCarrier(Airline carrier) {
		this.carrier = carrier;
	}

	public String getFsCode() {
		return fsCode;
	}

	public void setFsCode(String fsCode) {
		this.fsCode = fsCode;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	@Override
	public String toString() {
		return "CodeShare [carrier=" + carrier + ", fsCode=" + fsCode + ", flightNumber=" + flightNumber
				+ ", relationship=" + relationship + "]";
	}
	
	
	
}

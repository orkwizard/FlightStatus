package request;

public class RQIN {
	
	private String requested;
	private String interpred;
	
	
	public RQIN() {
		super();
	}
	
	public String getRequested() {
		return requested;
	}
	public void setRequested(String requested) {
		this.requested = requested;
	}
	public String getInterpred() {
		return interpred;
	}
	public void setInterpred(String interpred) {
		this.interpred = interpred;
	}
	@Override
	public String toString() {
		return "RQIN [requested=" + requested + ", interpred=" + interpred + "]";
	}
	
	

}

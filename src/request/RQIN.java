package request;

public class RQIN {
	
	private String requested;
	private String interpreted;
	
	
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
		return interpreted;
	}
	public void setInterpred(String interpred) {
		this.interpreted = interpred;
	}
	@Override
	public String toString() {
		return "RQIN [requested=" + requested + ", interpred=" + interpreted + "]";
	}
	
	

}

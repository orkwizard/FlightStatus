package request;

public class RQ {

	private String requestedCode;
	private String fsCode;
	
	
	public RQ() {
		super();
	}
	public String getRequestedCode() {
		return requestedCode;
	}
	public void setRequestedCode(String requestedCode) {
		this.requestedCode = requestedCode;
	}
	public String getFsCode() {
		return fsCode;
	}
	public void setFsCode(String fsCode) {
		this.fsCode = fsCode;
	}
	@Override
	public String toString() {
		return "RQ [requestedCode=" + requestedCode + ", fsCode=" + fsCode + "]";
	}
	
	
	
}

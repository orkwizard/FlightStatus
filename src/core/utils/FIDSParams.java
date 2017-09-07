package core.utils;

public class FIDSParams extends Parameters{
	
	private String airport;
	
	public void setAirport(String a) {
		airport = a;
	}

	public String getAirport() {
		return airport;
	}
	
	@Override
	public String toString() {
		return "FIDSParams []" + this.getParams().keySet() ;
	}
	
	
}

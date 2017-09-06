package pojo;

public class Times {

	private String dateLocal;
	private String dateUtc;
	
	public Times() {
		super();
	}

	public String getDateLocal() {
		return dateLocal;
	}

	public void setDateLocal(String dateLocal) {
		this.dateLocal = dateLocal;
	}

	public String getDateUtc() {
		return dateUtc;
	}

	public void setDateUtc(String dateUtc) {
		this.dateUtc = dateUtc;
	}

	@Override
	public String toString() {
		return "Dates [dateLocal=" + dateLocal + ", dateUtc=" + dateUtc + "]";
	}
	
	
	
}

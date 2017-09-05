package pojo;

public class Equipment {

	private String iata;
	private String name;
	private boolean turboProp;
	private boolean jet;
	private boolean widebody;
	private boolean regional;
	
	public Equipment() {
		super();
	}

	public String getIata() {
		return iata;
	}

	public void setIata(String iata) {
		this.iata = iata;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isTurboProp() {
		return turboProp;
	}

	public void setTurboProp(boolean turboProp) {
		this.turboProp = turboProp;
	}

	public boolean isJet() {
		return jet;
	}

	public void setJet(boolean jet) {
		this.jet = jet;
	}

	public boolean isWidebody() {
		return widebody;
	}

	public void setWidebody(boolean widebody) {
		this.widebody = widebody;
	}

	public boolean isRegional() {
		return regional;
	}

	public void setRegional(boolean regional) {
		this.regional = regional;
	}

	@Override
	public String toString() {
		return "Equipment [iata=" + iata + ", name=" + name + ", turboProp=" + turboProp + ", jet=" + jet
				+ ", widebody=" + widebody + ", regional=" + regional + "]";
	}
	
	
	
}

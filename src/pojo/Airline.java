package pojo;

import java.io.Serializable;

public class Airline implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fs="";
	private String iata="";
	private String icao="";
	private String name="";
	private String phoneNumber="";
	private boolean active;
	private String category="";
	
	
	
	public Airline() {
		super();
	}
	@Override
	public String toString() {
		return "Airline [fs=" + fs + ", iata=" + iata + ", icao=" + icao + ", name=" + name + ", phoneNumber="
				+ phoneNumber + ", active=" + active + ", category=" + category + "]";
	}
	public String getFs() {
		return fs;
	}
	public void setFs(String fs) {
		this.fs = fs;
	}
	public String getIata() {
		return iata;
	}
	public void setIata(String iata) {
		this.iata = iata;
	}
	public String getIcao() {
		return icao;
	}
	public void setIcao(String icao) {
		this.icao = icao;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
}

package core.utils;

public class FSTrackParams extends Parameters {

	private String airport;
	private int year;
	private int month;
	private int day;
	private int hourOfDay;
	
	
	public FSTrackParams() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void setAirport(String a) {
		airport = a;
	}
	public String getAirport() throws Exception{
		if(airport==null)
			throw new Exception("Airport Null in Parametes");
		return airport;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getHourOfDay() {
		return hourOfDay;
	}

	public void setHourOfDay(int hourOfDay) {
		this.hourOfDay = hourOfDay;
	}
	
	
	
	

}

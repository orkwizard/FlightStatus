package core.utils;

import java.util.Calendar;
import java.util.Date;

public class FSScheduleParams extends Parameters {

	private String airport;
        private String carrier;
        private String flightnumber;
        private String arrivingAt;
        private String departingAt;


	private int year;
	private int month;
	private int day;
        
	private Date date;

	
	
	public FSScheduleParams() {
		super();
		// TODO Auto-generated constructor stub
	}


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);

        this.year = cal.get(Calendar.YEAR);
        this.month = cal.get(Calendar.MONTH)+1;
        this.day = cal.get(Calendar.DAY_OF_MONTH);

        
        this.date = date;
    }
        
        
        
    public String getArrivingAt() {
        return arrivingAt;
    }

    public void setArrivingAt(String arrivingAt) {
        this.arrivingAt = arrivingAt;
    }

    public String getDepartingAt() {
        return departingAt;
    }

    public void setDepartingAt(String departingAt) {
        this.departingAt = departingAt;
    }
        
    public String getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(String flightnumber) {
        this.flightnumber = flightnumber;
    }
        
	
    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
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

	
	
	

}

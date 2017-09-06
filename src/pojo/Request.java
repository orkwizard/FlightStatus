package pojo;

import pojo.arrays.Airlines;
import pojo.arrays.Airports;
import pojo.arrays.Equipments;
import request.RQ;

import request.RQDate;
import request.RQHourDay;
import request.RQIN;
import request.RQNumHours;
import request.RQUTC;

public class Request {
	RQ airport;
	RQ carrier;
	RQDate date;
	
	RQIN hourOfDay; //RQ = Request IN = Interpred
	RQIN numHours;
	RQIN utc;
	
	RQIN codeType;
	
	RQIN maxFlights;
	RQIN extendedOptions;
	
	String url;
	public Request() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RQ getAirport() {
		return airport;
	}
	public void setAirport(RQ airport) {
		this.airport = airport;
	}
	public RQ getCarrier() {
		return carrier;
	}
	public void setCarrier(RQ carrier) {
		this.carrier = carrier;
	}
	public RQDate getDate() {
		return date;
	}
	public void setDate(RQDate date) {
		this.date = date;
	}
	public RQIN getHourOfDay() {
		return hourOfDay;
	}
	public void setHourOfDay(RQIN hourOfDay) {
		this.hourOfDay = hourOfDay;
	}
	public RQIN getNumHours() {
		return numHours;
	}
	public void setNumHours(RQIN numHours) {
		this.numHours = numHours;
	}
	public RQIN getUtc() {
		return utc;
	}
	public void setUtc(RQIN utc) {
		this.utc = utc;
	}
	public RQIN getCodeType() {
		return codeType;
	}
	public void setCodeType(RQIN codeType) {
		this.codeType = codeType;
	}
	public RQIN getMaxFlights() {
		return maxFlights;
	}
	public void setMaxFlights(RQIN maxFlights) {
		this.maxFlights = maxFlights;
	}
	public RQIN getExtendedOptions() {
		return extendedOptions;
	}
	public void setExtendedOptions(RQIN extendedOptions) {
		this.extendedOptions = extendedOptions;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Request [airport=" + airport + ", carrier=" + carrier + ", date=" + date + ", hourOfDay=" + hourOfDay
				+ ", numHours=" + numHours + ", utc=" + utc + ", codeType=" + codeType + ", maxFlights=" + maxFlights
				+ ", extendedOptions=" + extendedOptions + ", url=" + url + "]";
	}
	
	
	
	
}

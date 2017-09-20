package pojo;

import java.io.Serializable;
import java.util.Date;

public class Airport implements Serializable{

	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;

	private String fs="onoooo";
	private String iata;
	private String icao;
	//private String faa;
	private String name;
	//private String street1;
	//private String street2;
	private String city;
	private String cityCode;
	//private String district;
	//private String stateCode;
	//private String postalCode;
	private String countryCode;
	private String countryName;
	private String regionName;
	private String timeZoneRegionName;
	//private String weatherZone;
	private String localTime;
	private double utcOffsetHours;
	private double latitude;
	private double longitude;
	private int elevationFeet;
	private int classification;
	private boolean active;
	private String delayIndexUrl;
	private String weatherUrl;
	

	
	
	
	public Airport() {
		super();
	}





	public String getFs() {
		return fs;
	}





	public void setFs(String fs) {
            
            System.out.println(fs);
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



/*

	public String getFaa() {
		return faa;
	}





	public void setFaa(String faa) {
		this.faa = faa;
	}


*/


	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}




/*
	public String getStreet1() {
		return street1;
	}





	public void setStreet1(String street1) {
		this.street1 = street1;
	}





	public String getStreet2() {
		return street2;
	}





	public void setStreet2(String street2) {
		this.street2 = street2;
	}

*/



	public String getCity() {
		return city;
	}





	public void setCity(String city) {
		this.city = city;
	}





	public String getCityCode() {
		return cityCode;
	}





	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}



/*

	public String getDistrict() {
		return district;
	}





	public void setDistrict(String district) {
		this.district = district;
	}





	public String getStateCode() {
		return stateCode;
	}





	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}





	public String getPostalCode() {
		return postalCode;
	}





	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}


*/


	public String getCountryCode() {
		return countryCode;
	}





	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}





	public String getCountryName() {
		return countryName;
	}





	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}





	public String getRegionName() {
		return regionName;
	}





	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}





	public String getTimeZoneRegionName() {
		return timeZoneRegionName;
	}





	public void setTimeZoneRegionName(String timeZoneRegionName) {
		this.timeZoneRegionName = timeZoneRegionName;
	}




/*
	public String getWeatherZone() {
		return weatherZone;
	}

*/

/*

	public void setWeatherZone(String weatherZone) {
		this.weatherZone = weatherZone;
	}

*/



	public String getLocalTime() {
		return localTime;
	}





	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}





	public double getUtcOffsetHours() {
		return utcOffsetHours;
	}





	public void setUtcOffsetHours(double utcOffsetHours) {
		this.utcOffsetHours = utcOffsetHours;
	}





	public double getLatitude() {
		return latitude;
	}





	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}





	public double getLongitude() {
		return longitude;
	}





	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}





	public int getElevationFeet() {
		return elevationFeet;
	}





	public void setElevationFeet(int elevationFeet) {
		this.elevationFeet = elevationFeet;
	}





	public int getClassification() {
		return classification;
	}





	public void setClassification(int classification) {
		this.classification = classification;
	}





	public boolean getActive() {
		return active;
	}





	public void setActive(boolean active) {
		this.active = active;
	}





	public String getDelayIndexUrl() {
		return delayIndexUrl;
	}





	public void setDelayIndexUrl(String delayIndexUrl) {
		this.delayIndexUrl = delayIndexUrl;
	}





	public String getWeatherUrl() {
		return weatherUrl;
	}





	public void setWeatherUrl(String weatherUrl) {
		this.weatherUrl = weatherUrl;
	}





	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public String toString() {
		return "Airport [fs=" + this.fs +"]";
	}

/*
	@Override
	public String toString() {
		return "Airport [fs=" + fs + ", iata=" + iata + ", icao=" + icao + ", faa=" + faa + ", name=" + name
				+ ", street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", cityCode=" + cityCode
				+ ", district=" + district + ", stateCode=" + stateCode + ", postalCode=" + postalCode
				+ ", countryCode=" + countryCode + ", countryName=" + countryName + ", regionName=" + regionName
				+ ", timeZoneRegionName=" + timeZoneRegionName + ", weatherZone=" + weatherZone + ", localTime="
				+ localTime + ", utcOffsetHours=" + utcOffsetHours + ", latitude=" + latitude + ", longitude="
				+ longitude + ", elevationFeet=" + elevationFeet + ", classification=" + classification + ", active="
				+ active + ", delayIndexUrl=" + delayIndexUrl + ", weatherUrl=" + weatherUrl + "]";
	}
	*/
}

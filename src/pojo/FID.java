package pojo;

import java.io.Serializable;

public class FID implements Serializable {

	private String flightId;
	private String lastUpdatedTime;
	private String lastUpdatedTimeUtc;
	private String lastUpdatedDate;
	private String lastUpdatedDateUtc;
	private int dayOffset;
	private String statusCode;
	private String airlineName;
	private String airlineCode;
	private String flightNumber;
	private String airlineLogoUrlPng;
	private String airlineLogoUrlSvg;
	private boolean isCodeshare;
	private int operatedFlightNumber;
	private String operatingAirlineName;
	private String operatingAirlineCode;
	private String destinationAirportName;
	private String destinationAirportCode;
	private String destinationCity;
	private String destinationFamiliarName;
	private String destinationStateCode;
	private String destinationCountryCode;
	private String flight;
	private boolean delayed;
	private String remarks;
	private String remarksWithTime;
	private String remarksCode;
	private String airportCode;
	private String airportName;
	private String city;
	private String gate;
	private String terminal;
	private String baggage;
	private String scheduledTime;
	private String estimatedTime;
	private String actualTime;
	private String actualDate;
	private String currentTime;
	private String currentDate;
	private String scheduledGateTime;
	private String scheduledGateDate;
	private String estimatedGateTime;
	private String estimatedGateDate;
	private String actualGateTime;
	private String actualGateDate;
	private String currentGateTime;
	private String currentGateDate;
	private String codesharesAsNames;
	private String codesharesAsCodes;
	private String uplineAirportNames;
	private String uplineAirportCodes;
	private String downlineAirportNames;
	private String downlineAirportCodes;
	private String weather;
	private int temperatureC;
	private int temperatureF;
	private String primaryMarketingAirlineName;
	private String primaryMarketingAirlineCode;
	
	
	
	public FID() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getFlightId() {
		return flightId;
	}
	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}
	public String getLastUpdatedTime() {
		return lastUpdatedTime;
	}
	public void setLastUpdatedTime(String lastUpdatedTime) {
		this.lastUpdatedTime = lastUpdatedTime;
	}
	public String getLastUpdatedTimeUtc() {
		return lastUpdatedTimeUtc;
	}
	public void setLastUpdatedTimeUtc(String lastUpdatedTimeUtc) {
		this.lastUpdatedTimeUtc = lastUpdatedTimeUtc;
	}
	public String getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(String lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getLastUpdatedDateUtc() {
		return lastUpdatedDateUtc;
	}
	public void setLastUpdatedDateUtc(String lastUpdatedDateUtc) {
		this.lastUpdatedDateUtc = lastUpdatedDateUtc;
	}
	public int getDayOffset() {
		return dayOffset;
	}
	public void setDayOffset(int dayOffset) {
		this.dayOffset = dayOffset;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getAirlineName() {
		return airlineName;
	}
	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}
	public String getAirlineCode() {
		return airlineCode;
	}
	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public String getAirlineLogoUrlPng() {
		return airlineLogoUrlPng;
	}
	public void setAirlineLogoUrlPng(String airlineLogoUrlPng) {
		this.airlineLogoUrlPng = airlineLogoUrlPng;
	}
	public String getAirlineLogoUrlSvg() {
		return airlineLogoUrlSvg;
	}
	public void setAirlineLogoUrlSvg(String airlineLogoUrlSvg) {
		this.airlineLogoUrlSvg = airlineLogoUrlSvg;
	}
	public boolean isCodeshare() {
		return isCodeshare;
	}
	public void setCodeshare(boolean isCodeshare) {
		this.isCodeshare = isCodeshare;
	}
	public int getOperatedFlightNumber() {
		return operatedFlightNumber;
	}
	public void setOperatedFlightNumber(int operatedFlightNumber) {
		this.operatedFlightNumber = operatedFlightNumber;
	}
	public String getOperatingAirlineName() {
		return operatingAirlineName;
	}
	public void setOperatingAirlineName(String operatingAirlineName) {
		this.operatingAirlineName = operatingAirlineName;
	}
	public String getOperatingAirlineCode() {
		return operatingAirlineCode;
	}
	public void setOperatingAirlineCode(String operatingAirlineCode) {
		this.operatingAirlineCode = operatingAirlineCode;
	}
	public String getDestinationAirportName() {
		return destinationAirportName;
	}
	public void setDestinationAirportName(String destinationAirportName) {
		this.destinationAirportName = destinationAirportName;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getDestinationFamiliarName() {
		return destinationFamiliarName;
	}
	public void setDestinationFamiliarName(String destinationFamiliarName) {
		this.destinationFamiliarName = destinationFamiliarName;
	}
	public String getDestinationStateCode() {
		return destinationStateCode;
	}
	public void setDestinationStateCode(String destinationStateCode) {
		this.destinationStateCode = destinationStateCode;
	}
	public String getDestinationCountryCode() {
		return destinationCountryCode;
	}
	public void setDestinationCountryCode(String destinationCountryCode) {
		this.destinationCountryCode = destinationCountryCode;
	}
	public String getFlight() {
		return flight;
	}
	public void setFlight(String flight) {
		this.flight = flight;
	}
	public boolean isDelayed() {
		return delayed;
	}
	public void setDelayed(boolean delayed) {
		this.delayed = delayed;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getRemarksWithTime() {
		return remarksWithTime;
	}
	public void setRemarksWithTime(String remarksWithTime) {
		this.remarksWithTime = remarksWithTime;
	}
	public String getRemarksCode() {
		return remarksCode;
	}
	public void setRemarksCode(String remarksCode) {
		this.remarksCode = remarksCode;
	}
	public String getAirportCode() {
		return airportCode;
	}
	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
	}
	public String getAirportName() {
		return airportName;
	}
	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public String getBaggage() {
		return baggage;
	}
	public void setBaggage(String baggage) {
		this.baggage = baggage;
	}
	public String getScheduledTime() {
		return scheduledTime;
	}
	public void setScheduledTime(String scheduledTime) {
		this.scheduledTime = scheduledTime;
	}
	public String getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public String getActualTime() {
		return actualTime;
	}
	public void setActualTime(String actualTime) {
		this.actualTime = actualTime;
	}
	public String getActualDate() {
		return actualDate;
	}
	public void setActualDate(String actualDate) {
		this.actualDate = actualDate;
	}
	public String getCurrentTime() {
		return currentTime;
	}
	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	public String getScheduledGateTime() {
		return scheduledGateTime;
	}
	public void setScheduledGateTime(String scheduledGateTime) {
		this.scheduledGateTime = scheduledGateTime;
	}
	public String getScheduledGateDate() {
		return scheduledGateDate;
	}
	public void setScheduledGateDate(String scheduledGateDate) {
		this.scheduledGateDate = scheduledGateDate;
	}
	public String getEstimatedGateTime() {
		return estimatedGateTime;
	}
	public void setEstimatedGateTime(String estimatedGateTime) {
		this.estimatedGateTime = estimatedGateTime;
	}
	public String getEstimatedGateDate() {
		return estimatedGateDate;
	}
	public void setEstimatedGateDate(String estimatedGateDate) {
		this.estimatedGateDate = estimatedGateDate;
	}
	public String getActualGateTime() {
		return actualGateTime;
	}
	public void setActualGateTime(String actualGateTime) {
		this.actualGateTime = actualGateTime;
	}
	public String getActualGateDate() {
		return actualGateDate;
	}
	public void setActualGateDate(String actualGateDate) {
		this.actualGateDate = actualGateDate;
	}
	public String getCurrentGateTime() {
		return currentGateTime;
	}
	public void setCurrentGateTime(String currentGateTime) {
		this.currentGateTime = currentGateTime;
	}
	public String getCurrentGateDate() {
		return currentGateDate;
	}
	public void setCurrentGateDate(String currentGateDate) {
		this.currentGateDate = currentGateDate;
	}
	public String getCodesharesAsNames() {
		return codesharesAsNames;
	}
	public void setCodesharesAsNames(String codesharesAsNames) {
		this.codesharesAsNames = codesharesAsNames;
	}
	public String getCodesharesAsCodes() {
		return codesharesAsCodes;
	}
	public void setCodesharesAsCodes(String codesharesAsCodes) {
		this.codesharesAsCodes = codesharesAsCodes;
	}
	public String getUplineAirportNames() {
		return uplineAirportNames;
	}
	public void setUplineAirportNames(String uplineAirportNames) {
		this.uplineAirportNames = uplineAirportNames;
	}
	public String getUplineAirportCodes() {
		return uplineAirportCodes;
	}
	public void setUplineAirportCodes(String uplineAirportCodes) {
		this.uplineAirportCodes = uplineAirportCodes;
	}
	public String getDownlineAirportNames() {
		return downlineAirportNames;
	}
	public void setDownlineAirportNames(String downlineAirportNames) {
		this.downlineAirportNames = downlineAirportNames;
	}
	public String getDownlineAirportCodes() {
		return downlineAirportCodes;
	}
	public void setDownlineAirportCodes(String downlineAirportCodes) {
		this.downlineAirportCodes = downlineAirportCodes;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	public int getTemperatureC() {
		return temperatureC;
	}
	public void setTemperatureC(int temperatureC) {
		this.temperatureC = temperatureC;
	}
	public int getTemperatureF() {
		return temperatureF;
	}
	public void setTemperatureF(int temperatureF) {
		this.temperatureF = temperatureF;
	}
	public String getPrimaryMarketingAirlineName() {
		return primaryMarketingAirlineName;
	}
	public void setPrimaryMarketingAirlineName(String primaryMarketingAirlineName) {
		this.primaryMarketingAirlineName = primaryMarketingAirlineName;
	}
	public String getPrimaryMarketingAirlineCode() {
		return primaryMarketingAirlineCode;
	}
	public void setPrimaryMarketingAirlineCode(String primaryMarketingAirlineCode) {
		this.primaryMarketingAirlineCode = primaryMarketingAirlineCode;
	}
	@Override
	public String toString() {
		return "FID [flightId=" + flightId + ", lastUpdatedTime=" + lastUpdatedTime + ", lastUpdatedTimeUtc="
				+ lastUpdatedTimeUtc + ", lastUpdatedDate=" + lastUpdatedDate + ", lastUpdatedDateUtc="
				+ lastUpdatedDateUtc + ", dayOffset=" + dayOffset + ", statusCode=" + statusCode + ", airlineName="
				+ airlineName + ", airlineCode=" + airlineCode + ", flightNumber=" + flightNumber
				+ ", airlineLogoUrlPng=" + airlineLogoUrlPng + ", airlineLogoUrlSvg=" + airlineLogoUrlSvg
				+ ", isCodeshare=" + isCodeshare + ", operatedFlightNumber=" + operatedFlightNumber
				+ ", operatingAirlineName=" + operatingAirlineName + ", operatingAirlineCode=" + operatingAirlineCode
				+ ", destinationAirportName=" + destinationAirportName + ", destinationAirportCode="
				+ destinationAirportCode + ", destinationCity=" + destinationCity + ", destinationFamiliarName="
				+ destinationFamiliarName + ", destinationStateCode=" + destinationStateCode
				+ ", destinationCountryCode=" + destinationCountryCode + ", flight=" + flight + ", delayed=" + delayed
				+ ", remarks=" + remarks + ", remarksWithTime=" + remarksWithTime + ", remarksCode=" + remarksCode
				+ ", airportCode=" + airportCode + ", airportName=" + airportName + ", city=" + city + ", gate=" + gate
				+ ", terminal=" + terminal + ", baggage=" + baggage + ", scheduledTime=" + scheduledTime
				+ ", estimatedTime=" + estimatedTime + ", actualTime=" + actualTime + ", actualDate=" + actualDate
				+ ", currentTime=" + currentTime + ", currentDate=" + currentDate + ", scheduledGateTime="
				+ scheduledGateTime + ", scheduledGateDate=" + scheduledGateDate + ", estimatedGateTime="
				+ estimatedGateTime + ", estimatedGateDate=" + estimatedGateDate + ", actualGateTime=" + actualGateTime
				+ ", actualGateDate=" + actualGateDate + ", currentGateTime=" + currentGateTime + ", currentGateDate="
				+ currentGateDate + ", codesharesAsNames=" + codesharesAsNames + ", codesharesAsCodes="
				+ codesharesAsCodes + ", uplineAirportNames=" + uplineAirportNames + ", uplineAirportCodes="
				+ uplineAirportCodes + ", downlineAirportNames=" + downlineAirportNames + ", downlineAirportCodes="
				+ downlineAirportCodes + ", weather=" + weather + ", temperatureC=" + temperatureC + ", temperatureF="
				+ temperatureF + ", primaryMarketingAirlineName=" + primaryMarketingAirlineName
				+ ", primaryMarketingAirlineCode=" + primaryMarketingAirlineCode + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

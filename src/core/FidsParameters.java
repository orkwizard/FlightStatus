package core;

import java.util.List;

public class FidsParameters {

	private String airport;
	private String codeType;
	private List<String> requestedFields;
	private List<String> sortFields;
	private String terminal;
	private int timeWindowBegin;
	private int timeWindowEnd;
	private int maxFlights;
	private int lateMinutes;
	public FidsParameters() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getAirport() {
		return airport;
	}
	public void setAirport(String airport) {
		this.airport = airport;
	}
	public String getCodeType() {
		return codeType;
	}
	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public List<String> getRequestedFields() {
		return requestedFields;
	}
	public void setRequestedFields(List<String> requestedFields) {
		this.requestedFields = requestedFields;
	}
	public List<String> getSortFields() {
		return sortFields;
	}
	public void setSortFields(List<String> sortFields) {
		this.sortFields = sortFields;
	}
	public String getTerminal() {
		return terminal;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public int getTimeWindowBegin() {
		return timeWindowBegin;
	}
	public void setTimeWindowBegin(int timeWindowBegin) {
		this.timeWindowBegin = timeWindowBegin;
	}
	public int getTimeWindowEnd() {
		return timeWindowEnd;
	}
	public void setTimeWindowEnd(int timeWindowEnd) {
		this.timeWindowEnd = timeWindowEnd;
	}
	public int getMaxFlights() {
		return maxFlights;
	}
	public void setMaxFlights(int maxFlights) {
		this.maxFlights = maxFlights;
	}
	public int getLateMinutes() {
		return lateMinutes;
	}
	public void setLateMinutes(int lateMinutes) {
		this.lateMinutes = lateMinutes;
	}
	@Override
	public String toString() {
		return "FidsParameters [airport=" + airport + ", codeType=" + codeType + ", requestedFields=" + requestedFields
				+ ", sortFields=" + sortFields + ", terminal=" + terminal + ", timeWindowBegin=" + timeWindowBegin
				+ ", timeWindowEnd=" + timeWindowEnd + ", maxFlights=" + maxFlights + ", lateMinutes=" + lateMinutes
				+ "]";
	}
	
}

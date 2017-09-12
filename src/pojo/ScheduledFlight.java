package pojo;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ScheduledFlight {

@SerializedName("carrierFsCode")
@Expose
private String carrierFsCode;
@SerializedName("flightNumber")
@Expose
private String flightNumber;
@SerializedName("departureAirportFsCode")
@Expose
private String departureAirportFsCode;
@SerializedName("arrivalAirportFsCode")
@Expose
private String arrivalAirportFsCode;
@SerializedName("stops")
@Expose
private Integer stops;
@SerializedName("departureTerminal")
@Expose
private String departureTerminal;
@SerializedName("arrivalTerminal")
@Expose
private String arrivalTerminal;
@SerializedName("departureTime")
@Expose
private String departureTime;
@SerializedName("arrivalTime")
@Expose
private String arrivalTime;
@SerializedName("flightEquipmentIataCode")
@Expose
private String flightEquipmentIataCode;
@SerializedName("isCodeshare")
@Expose
private Boolean isCodeshare;
@SerializedName("isWetlease")
@Expose
private Boolean isWetlease;
@SerializedName("serviceType")
@Expose
private String serviceType;
@SerializedName("serviceClasses")
@Expose
private List<String> serviceClasses = null;
@SerializedName("trafficRestrictions")
@Expose
private List<Object> trafficRestrictions = null;
@SerializedName("codeshares")
@Expose
private List<Object> codeshares = null;
@SerializedName("referenceCode")
@Expose
private String referenceCode;

public String getCarrierFsCode() {
return carrierFsCode;
}

public void setCarrierFsCode(String carrierFsCode) {
this.carrierFsCode = carrierFsCode;
}

public String getFlightNumber() {
return flightNumber;
}

public void setFlightNumber(String flightNumber) {
this.flightNumber = flightNumber;
}

public String getDepartureAirportFsCode() {
return departureAirportFsCode;
}

public void setDepartureAirportFsCode(String departureAirportFsCode) {
this.departureAirportFsCode = departureAirportFsCode;
}

public String getArrivalAirportFsCode() {
return arrivalAirportFsCode;
}

public void setArrivalAirportFsCode(String arrivalAirportFsCode) {
this.arrivalAirportFsCode = arrivalAirportFsCode;
}

public Integer getStops() {
return stops;
}

public void setStops(Integer stops) {
this.stops = stops;
}

public String getDepartureTerminal() {
return departureTerminal;
}

public void setDepartureTerminal(String departureTerminal) {
this.departureTerminal = departureTerminal;
}

public String getArrivalTerminal() {
return arrivalTerminal;
}

public void setArrivalTerminal(String arrivalTerminal) {
this.arrivalTerminal = arrivalTerminal;
}

public String getDepartureTime() {
return departureTime;
}

public void setDepartureTime(String departureTime) {
this.departureTime = departureTime;
}

public String getArrivalTime() {
return arrivalTime;
}

public void setArrivalTime(String arrivalTime) {
this.arrivalTime = arrivalTime;
}

public String getFlightEquipmentIataCode() {
return flightEquipmentIataCode;
}

public void setFlightEquipmentIataCode(String flightEquipmentIataCode) {
this.flightEquipmentIataCode = flightEquipmentIataCode;
}

public Boolean getIsCodeshare() {
return isCodeshare;
}

public void setIsCodeshare(Boolean isCodeshare) {
this.isCodeshare = isCodeshare;
}

public Boolean getIsWetlease() {
return isWetlease;
}

public void setIsWetlease(Boolean isWetlease) {
this.isWetlease = isWetlease;
}

public String getServiceType() {
return serviceType;
}

public void setServiceType(String serviceType) {
this.serviceType = serviceType;
}

public List<String> getServiceClasses() {
return serviceClasses;
}

public void setServiceClasses(List<String> serviceClasses) {
this.serviceClasses = serviceClasses;
}

public List<Object> getTrafficRestrictions() {
return trafficRestrictions;
}

public void setTrafficRestrictions(List<Object> trafficRestrictions) {
this.trafficRestrictions = trafficRestrictions;
}

public List<Object> getCodeshares() {
return codeshares;
}

public void setCodeshares(List<Object> codeshares) {
this.codeshares = codeshares;
}

public String getReferenceCode() {
return referenceCode;
}

public void setReferenceCode(String referenceCode) {
this.referenceCode = referenceCode;
}

public String toString(){
    return "[ScheduledFlight -> DepartureAt: "+this.departureAirportFsCode+",ArrivalAt: "+this.arrivalAirportFsCode+", Carrier: "+this.carrierFsCode+", Flight:"+this.flightNumber+"]";
}

}
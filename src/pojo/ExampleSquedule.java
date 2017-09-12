package pojo;


import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExampleSquedule {


@SerializedName("request")
@Expose
private Request request;
@SerializedName("scheduledFlights")
@Expose
private List<ScheduledFlight> scheduledFlights = null;
@SerializedName("appendix")
@Expose
private Appendix appendix;

public Request getRequest() {
return request;
}

public void setRequest(Request request) {
this.request = request;
}

public List<ScheduledFlight> getScheduledFlights() {
return scheduledFlights;
}

public void setScheduledFlights(List<ScheduledFlight> scheduledFlights) {
this.scheduledFlights = scheduledFlights;
}

public Appendix getAppendix() {
return appendix;
}

public void setAppendix(Appendix appendix) {
this.appendix = appendix;
}

}

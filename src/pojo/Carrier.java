package pojo;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Carrier {

@SerializedName("requestedCode")
@Expose
private String requestedCode;
@SerializedName("fsCode")
@Expose
private String fsCode;

public String getRequestedCode() {
return requestedCode;
}

public void setRequestedCode(String requestedCode) {
this.requestedCode = requestedCode;
}

public String getFsCode() {
return fsCode;
}

public void setFsCode(String fsCode) {
this.fsCode = fsCode;
}

}
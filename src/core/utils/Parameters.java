package core.utils;

import java.util.HashMap;
import java.util.Map;

public class Parameters {
private Map<String,String> params;
	
	public Parameters() {
		super();
		// TODO Auto-generated constructor stub
		params = new HashMap<String,String>();
	}

	public void addParam(String key,String value) {
		params.put(key, value);
	}
	
	public boolean deleteParam(String key) {
		if(params.remove(key)!=null)
			return true;
		return false;
	}
	
	public String getParamObject(String key) {
		return params.get(key);
	}
	
	public Map<String,String> getParams() {
		return params;
	}
}

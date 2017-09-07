package core;

public class Credentials {
	private final static String appId="95f48407";
	private final static String appKey="819b4d571c001301b03b8ee6855b1780";
	
	public static String getAuthentication() {
		return "?appId="+appId+"&appKey="+appKey;
	}
}

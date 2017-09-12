package core;

public class Credentials {
	private  static String appId="95f48407";
	private  static String appKey="819b4d571c001301b03b8ee6855b1780";
	
	public static String getAuthentication() {
		return "?appId="+appId+"&appKey="+appKey;
	}
        
        public void setAppId(String appId){
            this.appId=appId;
        }
        
        public void setAppKey(String appKey){
            this.appKey=appKey;
        }
        
}

package core.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Net {
	CloseableHttpClient httpclient;
	HttpGet httpget;
	
	public Net() {
		super();
	}
        

	public static String get(String endpoint) throws Exception {
            
            return get(endpoint, true);
            
        }
	
	public static String get(String endpoint,Boolean debug) throws Exception {
            
                return get(endpoint, debug,"get");
                
	}
        
	public static String get(String endpoint,Boolean debug, String MethodVersion) throws Exception {
		String uri = endpoint;
		String responseBody="";
                
                if(debug==true){
                System.out.println("Executing request :--->" + uri);
                }
                        
                if(MethodVersion.equals("getold")){
                    System.out.println("using Old get Method");
                }
                
		
		try {
                    
                    if(MethodVersion.equals("get")){//El método original
                
                
                        CloseableHttpClient httpclient = HttpClients.createDefault();
			HttpGet httpget = new HttpGet(uri);
                       
                        if(debug==true){
			System.out.println("Executing request :--->" + httpget.getRequestLine());
                        }
                        
			ResponseHandler<String> responseHandler = new ResponseHandler<String>() {
				
				@Override
				public String handleResponse(final HttpResponse response) throws ClientProtocolException, IOException {
					// TODO Auto-generated method stub
					int status = response.getStatusLine().getStatusCode();
					if(status >=200 && status < 300) {
						HttpEntity entity = response.getEntity();
						return entity != null ? EntityUtils.toString(entity) : null;
					}else
					{
						throw new ClientProtocolException("Unexpected response status " + status);
					}
				}
			};
		
			responseBody = httpclient.execute(httpget,responseHandler);
			httpclient.close();
                    }
                    
                    if(MethodVersion.equals("getold")){
                        
                        responseBody= Net.GetOld(uri,"");
                        
                    }
                    
		}catch(Exception e) {
			System.out.println(e);
		}
                
                
                
		return responseBody;
	}
        
        
        
        
        
        
        public static String GetOld(String url, String params) throws IOException, Exception {
                url=url+params;
                url=url.replaceAll(" ","%20");
                String jsonText="";
                InputStream is = new URL(url).openStream();
                try {
                  BufferedReader rd = new BufferedReader(new InputStreamReader(is, Charset.forName("UTF-8")));

                StringBuilder sb = new StringBuilder();
                int cp;
                while ((cp = rd.read()) != -1) {
                  sb.append((char) cp);
                }
                jsonText= sb.toString();

                }catch(Exception e){
                    System.out.println("error en SendGet");
                    System.out.println(e.toString());
                }finally {
                  is.close();
                }
                return jsonText;
        }

        
        
        
        
        
}

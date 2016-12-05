package test;

import java.util.HashMap;

public class Signature {
	
	public static String signurl(String url,HashMap<String, Object> httpParams){
		
		String token="";
		
		if(httpParams.containsKey("user_id")){
			
			token="";
		}
		
		String signhttpurl="";
		httpParams.put("app_key", "http_client");
		System.out.println("~~~~~~"+httpParams);
		
		return url;
		
		
	}
	
	public static void main(String[] args){
	
		Signature httpurl=new Signature();
		
		String url="https://open07.edaixi.cn/client/v1/bind_http_user?";
		HashMap<String, Object> httpParams = new HashMap<String, Object>();
		String url1=Signature.signurl(url, httpParams);
		System.out.println("-----"+url1);
		
	}

}

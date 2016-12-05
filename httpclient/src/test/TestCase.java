package test;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import in.co.sahi.MysqlExec;


public class TestCase {

	public static void main(String[] args) throws Exception{
		
		Properties openconf=ModuleConf.getProperties();
		String baseurl=openconf.getProperty("edaixi");	
		String sendCouponByCid=openconf.getProperty("sendCouponByCid");
		
//		MysqlExec mysql=new MysqlExec();
//		mysql.executeQuery("");
		
		Map<String, String> params =new HashMap<String, String>();
		
		params.put("fan_id", "633913");
		params.put("cid", "20375194");
		        
		HttpTest get=new HttpTest();
		
		HttpGet httpGet=get.sendHttpGet(baseurl+sendCouponByCid, params);
		
		get.sendHttpGet(httpGet);
		
		HttpTest post=new HttpTest();
		
		HttpPost httpPost=post.sendHttpPost(baseurl+sendCouponByCid, params);
			
		post.sendHttpPost(httpPost);
		
	}

}

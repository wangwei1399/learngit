package test;


import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.net.URI;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.HttpEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.client.utils.URIBuilder;//�Ѹ����ַ�������url��ɲ��֣�����һ��url
import org.apache.http.client.HttpClient;
import org.apache.http.NameValuePair;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.config.RequestConfig.Builder;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.message.BasicNameValuePair;
import com.alibaba.fastjson.JSON;
import java.io.File;
import java.net.URL;





public class HttpTest {
	
	
	/*get����http*/
	/*ƴ��get����url*/
	public HttpGet sendHttpGet(String httpurl,Map<String,String> params) throws URISyntaxException{
		
			URIBuilder urlBuilder=new URIBuilder(httpurl);//ʵ����url������
			if(params!=null){
				Set<Entry<String,?>> set = (Set)params.entrySet();
				Iterator<Entry<String,?>> itr = set.iterator();
				while(itr.hasNext()){
					Entry<String, ?> entry = itr.next();
					urlBuilder.addParameter(entry.getKey(), entry.getValue() == null?"":String.valueOf(entry.getValue()));
				}//url����Ӳ�����������map key.value����
				URI RequestUrl=urlBuilder.build();
				HttpGet httpGet=new HttpGet(RequestUrl);
				 System.out.println(httpGet);	
				 return httpGet;//����url+����  �µ�url
			}
			return null;
			                     
			
		}
		
	/*����get���󣬲���ȡ��Ӧʵ��*/
	public String sendHttpGet(HttpGet httpGet){
		
		CloseableHttpClient httpClient = null; 
		CloseableHttpResponse response = null; 
		HttpEntity entity = null; 
		String responseContent = null; 
		
		try{
			//����Ĭ�ϵ�HttpClientʵ��
			httpClient=HttpClients.createDefault();
				
			//ִ������	
			response=httpClient.execute(httpGet);
			entity=response.getEntity();
			responseContent=EntityUtils.toString(entity,"UTF-8");
		} catch (Exception e) { 
			e.printStackTrace(); 
		
	} finally { 
		try { 
			// �ر�����,�ͷ���Դ 
			if (response != null) { 
			response.close(); 
			} 
			if (httpClient != null) { 
			httpClient.close(); 
			} 
			} catch (IOException e) { 
			e.printStackTrace(); 
			} 
			} 
			System.out.println("******"+responseContent);
			return responseContent; 
			} 
	
	
	/*post����http*/
	public HttpPost sendHttpPost(String url,Map<String,String> params) throws URISyntaxException{
		
		URIBuilder urlBuilder=new URIBuilder(url);
		if(params!=null){
			Set<Entry<String,?>> set = (Set)params.entrySet();
			Iterator<Entry<String,?>> itr = set.iterator();
			while(itr.hasNext()){
				Entry<String, ?> entry = itr.next();
				urlBuilder.addParameter(entry.getKey(), entry.getValue() == null?"":String.valueOf(entry.getValue()));
				//urlBuilder.addParameter(entry.getKey(), (String) entry.getValue());
			}
			URI RequestUrl=urlBuilder.build();
			HttpPost httpPost=new HttpPost(RequestUrl);
			 System.out.println(httpPost);	
			 return httpPost;
		}
		
		return null;

			
	}
	
	public String sendHttpPost(HttpPost httpPost){
		
		
		CloseableHttpClient httpClient = null; 
		CloseableHttpResponse response = null; 
		HttpEntity entity = null; 
		String responseContent = null;
		

		try{
			//����Ĭ�ϵ�HttpClientʵ��
			httpClient=HttpClients.createDefault();
				
			//ִ������	
			response=httpClient.execute(httpPost);
			entity=response.getEntity();//��ȡresponse����
			responseContent=EntityUtils.toString(entity,"UTF-8");
		} catch (Exception e) { 
			e.printStackTrace(); 
		
	} finally { 
		try { 
			// �ر�����,�ͷ���Դ 
			if (response != null) { 
			response.close(); 
			} 
			if (httpClient != null) { 
			httpClient.close(); 
			} 
			} catch (IOException e) { 
			e.printStackTrace(); 
			} 
			} 
			System.out.println("******"+responseContent);
			return responseContent; 
			} 
	
	
	
	/*���� get����https*/
	public HttpGet sendHttpsGet(String httpsurl,Map<String,String> params) throws URISyntaxException{
		
		URIBuilder urlBuilder=new URIBuilder(httpsurl);//ʵ����url������
		if(params!=null){
			Set<Entry<String,?>> set = (Set)params.entrySet();
			Iterator<Entry<String,?>> itr = set.iterator();
			while(itr.hasNext()){
				Entry<String, ?> entry = itr.next();
				urlBuilder.addParameter(entry.getKey(), entry.getValue() == null?"":String.valueOf(entry.getValue()));
			}//url����Ӳ�����������map key.value����
			URI RequestUrl=urlBuilder.build();
			HttpGet httpsGet=new HttpGet(RequestUrl);
			 System.out.println(httpsGet);	
			 return httpsGet;//����url+����  �µ�url
		}
		return null;
			
}
	
	/*����get���󣬲���ȡ��Ӧʵ��*/
	public String sendHttpsGet(HttpGet httpsGet){
		
		CloseableHttpClient httpsClient = null; 
		CloseableHttpResponse response = null; 
		HttpEntity entity = null; 
		String responseContent = null; 
		
		try{
			//����Ĭ�ϵ�HttpClientʵ��
			PublicSuffixMatcher publicSuffixMatcher = PublicSuffixMatcherLoader.load(new URL(httpsGet.getURI().toString())); 
			DefaultHostnameVerifier hostnameVerifier = new DefaultHostnameVerifier(publicSuffixMatcher); 
			httpsClient = HttpClients.custom().setSSLHostnameVerifier(hostnameVerifier).build(); 
				
			//ִ������	
			response=httpsClient.execute(httpsGet);
			entity=response.getEntity();
			responseContent=EntityUtils.toString(entity,"UTF-8");
		} catch (Exception e) { 
			e.printStackTrace(); 
		
	} finally { 
		try { 
			// �ر�����,�ͷ���Դ 
			if (response != null) { 
			response.close(); 
			} 
			if (httpsClient != null) { 
			httpsClient.close(); 
			} 
			} catch (IOException e) { 
			e.printStackTrace(); 
			} 
			} 
			System.out.println("******"+responseContent);
			return responseContent; 
			} 
	

	
	/*����post����https*/
	public HttpPost sendHttpsPost(String url,Map<String,String> params) throws URISyntaxException{
		
		URIBuilder urlBuilder=new URIBuilder(url);
		if(params!=null){
			Set<Entry<String,?>> set = (Set)params.entrySet();
			Iterator<Entry<String,?>> itr = set.iterator();
			while(itr.hasNext()){
				Entry<String, ?> entry = itr.next();
				urlBuilder.addParameter(entry.getKey(), entry.getValue() == null?"":String.valueOf(entry.getValue()));
				//urlBuilder.addParameter(entry.getKey(), (String) entry.getValue());
			}
			URI RequestUrl=urlBuilder.build();
			HttpPost httpsPost=new HttpPost(RequestUrl);
			 System.out.println(httpsPost);	
			 return httpsPost;
		}
		
		return null;

			
	}
	
	/*����post���󣬲���ȡ��Ӧʵ��*/
	public String sendHttpsPost(HttpPost httpsPost){
			
		CloseableHttpClient httpsClient = null; 
		CloseableHttpResponse response = null; 
		HttpEntity entity = null; 
		String responseContent = null;
		

		try{
			//����Ĭ�ϵ�HttpClientʵ��
			PublicSuffixMatcher publicSuffixMatcher = PublicSuffixMatcherLoader.load(new URL(httpsPost.getURI().toString())); 
			DefaultHostnameVerifier hostnameVerifier = new DefaultHostnameVerifier(publicSuffixMatcher); 
			httpsClient = HttpClients.custom().setSSLHostnameVerifier(hostnameVerifier).build(); 
				
			//ִ������	
			response=httpsClient.execute(httpsPost);
			entity=response.getEntity();//��ȡresponse����
			responseContent=EntityUtils.toString(entity,"UTF-8");
		} catch (Exception e) { 
			e.printStackTrace(); 
		
	} finally { 
		try { 
			// �ر�����,�ͷ���Դ 
			if (response != null) { 
			response.close(); 
			} 
			if (httpsClient != null) { 
			httpsClient.close(); 
			} 
			} catch (IOException e) { 
			e.printStackTrace(); 
			} 
			} 
			System.out.println("******"+responseContent);
			return responseContent; 
			} 
		
	
	

	/*demo*/
	public static void main(String[] args) throws URISyntaxException{
		Map<String, String> params =new HashMap<String, String>();
		params.put("fan_id", "633913");
		params.put("cid", "20375194");
		HttpTest get=new HttpTest();
		
		HttpGet httpGet=get.sendHttpGet("http://edxpay07.edaixi.cn:8801/coupon/sendCouponByCid", params);
		
		get.sendHttpGet(httpGet);
		
		HttpTest post=new HttpTest();
		
		HttpPost httpPost=post.sendHttpPost("http://edxpay07.edaixi.cn:8801/coupon/sendCouponByCid", params);
		
		post.sendHttpsPost(httpPost);
		
	}

}

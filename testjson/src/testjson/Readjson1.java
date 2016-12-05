package testjson;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;

public class Readjson1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JsonParser parser=new JsonParser();
		try {
			JsonObject object=(JsonObject) parser.parse(new FileReader("test1.json"));		
			boolean ret=object.get("ret").getAsBoolean();
			String ts=object.get("ts").getAsString();
			String version=object.get("version").getAsString();
			System.out.println("ret="+ret);
			System.out.println("ts="+ts);
			System.out.println("vsrsion="+version);	
			System.out.println("~~~~~~~~~~~~~~~~~~");
			JsonArray array=object.get("data").getAsJsonArray();
			
			for(int i=0;i<array.size();i++){
				
			JsonObject sub=array.get(i).getAsJsonObject();
			String address_id=sub.get("address_id").getAsString();
			System.out.println("address_id="+address_id);
			String username=sub.get("username").getAsString();
			System.out.println("username="+username);
			String tel=sub.get("tel").getAsString();
			System.out.println("tel="+tel);
			String city=sub.get("city").getAsString();
			System.out.println("city="+city);
			String area=sub.get("area").getAsString();
			System.out.println("area="+area);
			String address=sub.get("address").getAsString();
			System.out.println("address="+address);
			String address_line_1=sub.get("address_line_1").getAsString();
			System.out.println("address_line_1="+address_line_1);
			String address_line_2=sub.get("address_line_2").getAsString();
			System.out.println("address_line_2="+address_line_2);
			
			String city_id=sub.get("city_id").getAsString();
			System.out.println("city_id="+city_id);
			String area_id=sub.get("area_id").getAsString();
			System.out.println("area_id="+area_id);
			String frequently_address=sub.get("frequently_address").getAsString();
			System.out.println("frequently_address="+frequently_address);
			String can_wash=sub.get("can_wash").getAsString();
			System.out.println("can_wash="+can_wash);
			JsonArray available_category_ids=sub.get("available_category_ids").getAsJsonArray();
			System.out.println("available_category_ids="+available_category_ids);
			for(int j=0;j<available_category_ids.size();j++){
				String sub1=available_category_ids.get(j).getAsString();
				System.out.println("xunhuan----"+sub1);
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
			
			}
		
		
			
		
		
		
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package test;

import java.util.Properties;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ModuleConf {
	
	public static Properties getProperties(){
		
		Properties Pro=new Properties();
		//InputStream in = Class.class.getResourceAsStream("/config.properties");   
		 
		InputStream in=null;
		try {
			in = new BufferedInputStream (new FileInputStream("H:/work/eclipse/workspace/httpclient/src/test/config.properties"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		 if(in==null){
			 System.out.println("^^^^^^"+in);
			 return null;
		 }
		try {
			Pro.load(in);		
			System.out.println("^^^^^^"+Pro.getProperty("edaixi"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		return Pro;
	}

}

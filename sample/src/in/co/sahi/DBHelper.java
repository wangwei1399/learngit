package in.co.sahi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelper {
	public static final String url="jdbc:mysql://54.223.151.125:3306/rongchain04";
	public static final String name="com.mysql.jdbc.Driver";
	public static final String user="testuser";
	public static final String password="testedaixi";
	
	public Connection conn=null;
	
	public PreparedStatement pst=null;
	
	public DBHelper(String sql){
		 
		try{
			 Class.forName(name);
			 conn=DriverManager.getConnection(url, user, password);
			 pst=conn.prepareStatement(sql);
			
		}catch(Exception e){
			 e.printStackTrace(); 
		}
	}
	public void close(){
		try {  
            this.conn.close();  
            this.pst.close();  
        } catch (SQLException e) { 
        	System.out.println("数据库连接失败！");
            e.printStackTrace();  
        }  
	}
}


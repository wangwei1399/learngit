package in.co.sahi;

import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class MysqlExec {
	
	private static final int Row = 0;
	public final String url="jdbc:mysql://54.223.151.125:3306/rongchain04";//数据库地址、库名
	public final String name="com.mysql.jdbc.Driver";
	public final String user="testuser";//数据库登录用户名
	public final String password="testedaixi";////数据库登录密码
	public Connection Con=null; //数据库连接
	public PreparedStatement statement=null; //用来执行sql语句
	public ResultSet result=null; //sql语句结果集
	public Statement e=null;  //用来执行sql语句

	public ResultSet executeQuery(String Querysql)throws SQLException{
	  
		try{
		  
		  Class.forName(name);//加载驱动程序
		  System.out.println("加载mysql驱动成功");
		  Connection Con=DriverManager.getConnection(url, user, password);//连接数据库
		  Statement e=Con.createStatement();
		  ResultSet result=e.executeQuery(Querysql);
		  System.out.println("开始查询:"+result);
		  result.last();
		  return result;
	  }catch(Exception e){
		  
		  e.printStackTrace();  
		  System.out.println("数据库连接失败！！！");
		  ResultSet result=null;
		  return result;
	 
	  }
			
	}
	
	
	public int executeUpdate(String Updatesql) throws ClassNotFoundException{
		
			
		  try {
			  Class.forName(name);
			  System.out.println("加载mysql驱动成功");
			  Connection Con=DriverManager.getConnection(url, user, password);
			  Statement e=Con.createStatement();
			  int Row=e.executeUpdate(Updatesql);
			  if(Row!=-1){
				  boolean isUpdateSuccess=true;
				 System.out.println("mysql记录更新成功");
				 System.out.println("更新记录"+Row+"条");
			  }
			  else{
				  boolean isUpdateSuccess=false;
					 System.out.println("mysql记录更新失败");
			  }
			  return Row;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	       return Row;
	
	}
	
	public boolean execute(String sql){
		
		return true;
	}
	
	public void close(){
		
		try{
			this.Con.close();
			this.e.close();
			this.result.close();
		}
		
		catch(SQLException e){
			
			e.printStackTrace(); 
		}
	
	}
		
}
package in.co.sahi;

import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;

public class MysqlExec {
	
	private static final int Row = 0;
	public final String url="jdbc:mysql://54.223.151.125:3306/rongchain04";//���ݿ��ַ������
	public final String name="com.mysql.jdbc.Driver";
	public final String user="testuser";//���ݿ��¼�û���
	public final String password="testedaixi";////���ݿ��¼����
	public Connection Con=null; //���ݿ�����
	public PreparedStatement statement=null; //����ִ��sql���
	public ResultSet result=null; //sql�������
	public Statement e=null;  //����ִ��sql���

	public ResultSet executeQuery(String Querysql)throws SQLException{
	  
		try{
		  
		  Class.forName(name);//������������
		  System.out.println("����mysql�����ɹ�");
		  Connection Con=DriverManager.getConnection(url, user, password);//�������ݿ�
		  Statement e=Con.createStatement();
		  ResultSet result=e.executeQuery(Querysql);
		  System.out.println("��ʼ��ѯ:"+result);
		  result.last();
		  return result;
	  }catch(Exception e){
		  
		  e.printStackTrace();  
		  System.out.println("���ݿ�����ʧ�ܣ�����");
		  ResultSet result=null;
		  return result;
	 
	  }
			
	}
	
	
	public int executeUpdate(String Updatesql) throws ClassNotFoundException{
		
			
		  try {
			  Class.forName(name);
			  System.out.println("����mysql�����ɹ�");
			  Connection Con=DriverManager.getConnection(url, user, password);
			  Statement e=Con.createStatement();
			  int Row=e.executeUpdate(Updatesql);
			  if(Row!=-1){
				  boolean isUpdateSuccess=true;
				 System.out.println("mysql��¼���³ɹ�");
				 System.out.println("���¼�¼"+Row+"��");
			  }
			  else{
				  boolean isUpdateSuccess=false;
					 System.out.println("mysql��¼����ʧ��");
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
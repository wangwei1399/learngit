package in.co.sahi;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo {
		
	public static void main(String[] args) throws SQLException{
	
		
		try{
		String Querysql="select id from ims_fans where mobile='13439072813';";
		MysqlExec mysqlexec=new MysqlExec();	
		ResultSet result=mysqlexec.executeQuery(Querysql);
		 String id = result.getString("id") ; 
		 System.out.println("执行结果是:"+id);
		
		 String upadtesql="UPDATE ims_washing_order SET `status`='7',status_delivery='3' "
		 		+ "WHERE ordersn='16072096699488';";
		 int result1=mysqlexec.executeUpdate(upadtesql);
		 
		 
	}
	catch(Exception e){
		
		e.printStackTrace();  
	}
}

}
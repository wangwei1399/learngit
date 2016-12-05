package in.co.sahi;


import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;
import net.sf.sahi.client.Browser;
import net.sf.sahi.client.ExecutionException;
import net.sf.sahi.config.Configuration;

public class Login extends TestCase {
	
	public Elements browser;
	public String userDataDirectory; 
	
	public void setUp(){
		String sahiBase = "H:/work/cherry/sahi"; 
		userDataDirectory = "myuserdata"; 
		Configuration.initJava(sahiBase, userDataDirectory); 
		browser = new Elements("chrome");	
		browser.open();
	}
	
public void testLogin() throws ExecutionException, SQLException, ClassNotFoundException{
	
	String deletemobile="DELETE FROM ims_washing_mobile WHERE mobile='13439072813';";
	String queryresult="select code from ims_washing_mobile where mobile='13439072813';";
	MysqlExec mysqlexec=new MysqlExec();
	try {
		mysqlexec.executeUpdate(deletemobile);
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	browser.navigateTo("http://wx07.edaixi.cn:81");
	browser.link("����").click();	
	browser.span("�ҵ�").click();
	browser.link("������¼").click();
	browser.label("input_wrap").click();
	browser.telephonebox("tel").setValue("13439072813");
	browser.link("������֤��").click();
	ResultSet result=mysqlexec.executeQuery(queryresult);
	String code=result.getString("code");
	System.out.println("code��ֵ�ǣ�"+code);
	browser.telephonebox("code").setValue(code);
	browser.submit("��¼").click();

	browser.paragraph("13439072813").exists();
	browser.paragraph("13439072813").isVisible();
	browser.paragraph("13439072813").getText();
	browser.paragraph("13439072813").containsText("13439072813");
	

		
	}
}

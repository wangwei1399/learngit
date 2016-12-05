package in.co.sahi;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.TestCase;
import net.sf.sahi.client.Browser;
import net.sf.sahi.client.ExecutionException;
import net.sf.sahi.config.Configuration;




public class CaiWu extends TestCase{
	
	
	public Elements browser;
	public String userDataDirectory; 
	
	public void setUp(){
		
		String sahiBase = "H:/work/cherry/sahi"; 
		userDataDirectory = "H:/work/eclipse/workspace/sample/myuserdata"; 
		Configuration.initJava(sahiBase, userDataDirectory); 
		browser = new Elements("chrome");	
		browser.open();
	}
	
	public void testCaiWu(){
		
		Date date=new Date();
		SimpleDateFormat time = new SimpleDateFormat("yyyymmddhhmmss");
		String title=time.format(date);
		System.out.println("shijian------"+title);
		
		
		browser.navigateTo("http://caiwuadmin07.edaixi.cn:81/");
		browser.link("SSO登录").click();
		browser.textbox("user[login]").setValue("test");
		browser.password("user[password]").setValue("Abcd1234");
		browser.submit("登 录").click();
		browser.link("充值卡管理").click();
		browser.link("充值卡列表").click();
		browser.submit("新建").click();
		browser.popup("荣昌财务系统").textbox("title").setValue(title);
		browser.popup("荣昌财务系统").textbox("zhenqian").setValue("100");
		browser.popup("荣昌财务系统").textbox("price").setValue("130");
		//browser.popup("荣昌财务系统").italic("fa fa-chevron-right glyphicon glyphicon-chevron-right").click();
		//browser.popup("荣昌财务系统").cell("30[1]").click();
		browser.popup("荣昌财务系统").textbox("apply_department").setValue("js");
		browser.popup("荣昌财务系统").textbox("applicant").setValue("js");
		browser.popup("荣昌财务系统").textbox("city").setValue("bj");
		browser.popup("荣昌财务系统").submit("提交").click();
		
	}
}

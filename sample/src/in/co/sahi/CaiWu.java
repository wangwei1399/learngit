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
		browser.link("SSO��¼").click();
		browser.textbox("user[login]").setValue("test");
		browser.password("user[password]").setValue("Abcd1234");
		browser.submit("�� ¼").click();
		browser.link("��ֵ������").click();
		browser.link("��ֵ���б�").click();
		browser.submit("�½�").click();
		browser.popup("�ٲ�����ϵͳ").textbox("title").setValue(title);
		browser.popup("�ٲ�����ϵͳ").textbox("zhenqian").setValue("100");
		browser.popup("�ٲ�����ϵͳ").textbox("price").setValue("130");
		//browser.popup("�ٲ�����ϵͳ").italic("fa fa-chevron-right glyphicon glyphicon-chevron-right").click();
		//browser.popup("�ٲ�����ϵͳ").cell("30[1]").click();
		browser.popup("�ٲ�����ϵͳ").textbox("apply_department").setValue("js");
		browser.popup("�ٲ�����ϵͳ").textbox("applicant").setValue("js");
		browser.popup("�ٲ�����ϵͳ").textbox("city").setValue("bj");
		browser.popup("�ٲ�����ϵͳ").submit("�ύ").click();
		
	}
}

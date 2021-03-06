package in.co.sahi;

import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.TestCase;
import net.sf.sahi.client.Browser;
import net.sf.sahi.client.ExecutionException;
import net.sf.sahi.config.Configuration;

public class CreatOrder extends TestCase{
	public Elements browser;
	public String userDataDirectory; 
	
	public void setUp(){
		String sahiBase = "H:/work/cherry/sahi"; 
		userDataDirectory = "myuserdata"; 
		Configuration.initJava(sahiBase, userDataDirectory); 
		browser = new Elements("chrome");	
		browser.open();

}
	public void testCreatOrder() throws ExecutionException, SQLException, ClassNotFoundException{
		
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
		browser.link("北京").click();	
		browser.span("我的").click();
		browser.link("立即登录").click();
		browser.label("input_wrap").click();
		browser.telephonebox("tel").setValue("13439072813");
		browser.link("发送验证码").click();
		ResultSet result=mysqlexec.executeQuery(queryresult);
		String code=result.getString("code");
		System.out.println("code的值是："+code);
		browser.telephonebox("code").setValue(code);
		browser.submit("登录").click();

		browser.paragraph("13439072813").exists();
		browser.paragraph("13439072813").isVisible();
		browser.paragraph("13439072813").getText();
		browser.paragraph("13439072813").containsText("13439072813");
		
		browser.span("首页").click();
		browser.image("ic_laundry.png").click();
		//browser.paragraph("i-know-btn").click();
		browser.div("预约取件").click();
		browser.div("address").click();
		browser.paragraph("北京 海淀区 他咯了 啦啦").click();
		browser.div("timeinput").click();
		browser.paragraph("view_text[12]").click();
		browser.submit("确定选择").click();
		browser.div("立即预约").click();
			

	}
}
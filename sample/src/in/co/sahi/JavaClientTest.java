package in.co.sahi;

import junit.framework.TestCase;
import net.sf.sahi.client.Browser;
import net.sf.sahi.client.ExecutionException;
import net.sf.sahi.config.Configuration;



public class JavaClientTest extends TestCase {
	private Browser browser;
	private String userDataDirectory;

	/**
	 * This starts the Sahi proxy, toggles the proxy settings on Internet Explorer
	 * and starts a browser instance. This could be part of your setUp method in a JUnit test.
	 * 
	 */
	public void setUp(){
		String sahiBase = "H:/work/cherry/sahi"; // where Sahi is installed or unzipped
		userDataDirectory = "myuserdata"; 
		Configuration.initJava(sahiBase, userDataDirectory); // Sets up configuration for proxy. Sets Controller to java mode.

		browser = new Browser("chrome");	
		browser.open();
	}	
	
	public void testGoogle() throws ExecutionException{
		
		browser.navigateTo("http://wuliu07.edaixi.cn:81");
		browser.link("µÇÂ½ÎïÁ÷").click();
		browser.textbox("user[login]").setValue("wangw");
		browser.password("user[password]").setValue("Abcd1234");
		browser.submit("µÇ Â¼").click();
		
	}


	
	public void tearDown(){
		browser.close();		
	}
		
}

package in.co.sahi;

import net.sf.sahi.client.Browser;
import net.sf.sahi.client.ElementStub;

public class Elements extends Browser {
	
	
	 public Elements(String browserName)
	  {
	   super(browserName);
	  }

	
	 public ElementStub telephonebox(String args)
	  {
	    return new ElementStub("telephonebox", this.browser, args);
	  }
	
}

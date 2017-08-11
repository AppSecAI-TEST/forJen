import org.junit.After;
import org.junit.Before;

import com.alibaba.fastjson.JSONObject;

import macaca.client.MacacaClient;
import macaca.client.common.GetElementWay;

public class Test {

	 MacacaClient driver= new MacacaClient();
	  static JSONObject desiredCapabilities=new JSONObject();
	  
	  @Before
	  public void setUp() throws Exception {
	      // platform: android or ios
		  driver.setWaitElementTimeInterval(500);
		  driver.setWaitElementTimeout(5000);
		  JSONObject porps=new JSONObject();
	      String platform = "ios";
	      porps.put("platformName", platform);
	      porps.put("bundleId", "com.kingsoft.www.office.wpsoffice");
	      porps.put("udid", "65f2f17bc6270f120ef966b17cd04c7825c62852");
	      porps.put("version", "10.3.1");
	      porps.put("proxyPort", 8900);
	      porps.put("deviceName", "Yujianiphone");
	      desiredCapabilities.put("desiredCapabilities", porps);
	      driver.initDriver(desiredCapabilities);
	  }
	  
	  @org.junit.Test
	  public void openfile1() throws Exception {
			driver.waitForElement(GetElementWay.NAME, "tabbar pop icon").click();
			driver.waitForElement(GetElementWay.NAME, "pub new wps").click();
			driver.getElement(GetElementWay.NAME, "空白").click();
	  }
	  
	  @org.junit.Test
	  public void openfile2() throws Exception {
			driver.waitForElement(GetElementWay.NAME, "tabbar pop icon").click();
			driver.waitForElement(GetElementWay.NAME, "pub new wpp").click();
			driver.getElement(GetElementWay.NAME, "空白111").click();
	  }
	  

	  
	  @After
	  public void tearDown() throws Exception {
	      driver.quit();
	  }

}

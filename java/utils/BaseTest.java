package utils;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseTest extends WebConnector {

	@Before 
	public void setup() throws Exception {
		System.setProperty("Webdriver.gecko.driver", "/next/src/test/java/resources/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@After
	public void tearDown() throws Exception{
		driver.quit();

	}
	
}

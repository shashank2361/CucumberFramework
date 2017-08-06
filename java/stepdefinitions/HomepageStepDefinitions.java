// you can use 	@Given("^I am on (.*)$
// you can use 	@Given("^I am on \"(.*)""$" if Given has double codes in feature file
		// open the next web site

package stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;

import utils.WebConnector;

public class HomepageStepDefinitions extends WebConnector {
	
	@Given("^I am on \"([^\"]*)\"$")
	public void i_am_on(String arg1) throws Throwable {
		driver.get(baseUrl+arg1);
		Thread.sleep(3000);
		
	}

	@Then("^I shoud see Title \"([^\"]*)\"$")
	public void i_shoud_see_Title(String arg1) throws Throwable {
		Assert.assertEquals("failed", arg1, driver.getTitle());
	 
	}	

	@Then("^I shoud see \"([^\"]*)\" element$")
	public void i_shoud_see_element(String arg1) throws Throwable {
	
		boolean elementdisplayed = driver.findElement(By .xpath(arg1)).isDisplayed();
		
		Assert.assertTrue("Failed Logo is not displayed", elementdisplayed);

	}

	@When("^I click on \"([^\"]*)\" element$")
	public void i_click_on_element(String arg1) throws Throwable {
			driver.findElement(By .xpath(arg1)).click();
	}
	
	@Then("^I should be on \"([^\"]*)\"$")
	public void i_should_be_on(String arg1) throws Throwable {
	 String currenturl = driver.getCurrentUrl();
	 Assert.assertTrue("failed", currenturl.contains(arg1));
	 driver.quit();
	}
	
}

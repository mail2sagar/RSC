package com.ps.maven.rsc.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ps.maven.rsc.NavigateRSC;
import com.ps.maven.utils.BrowserTypes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Batteries extends BrowserTypes{
	WebDriver driver = null;
	BrowserTypes browser = new BrowserTypes();	
	
	
	NavigateRSC navigate_rsc = new NavigateRSC();
	

	//@Given("^navigate to RSC site$")
	@Given("^navigate to RSC site$")
	public void navigate_to_RSC_site() throws Throwable {
		//WebDriver driver = browser("Chrome");
		
		System.setProperty("webdriver.chrome.driver", "\\Users\\sagar\\Documents\\Automation\\chromedriver.exe");
		driver.navigate().to("http://uk.rs-online.com/web/");

		verbose("Launching the application");
		//verbose("The system path is : " + System.getProperty("user.dir"));
		//driver.get(getProps().getProperty("platformURL"));
		driver.manage().window().maximize();
		waitExplicitly(1);
		verbose("***********************************************************");
	}

	/*@When("^given valid username and valid password$")
	public void given_valid_username_and_password() throws Throwable {
		verbose("***********************************************************");
		verbose("The username is : " + getProps().getProperty("valid_username"));
		verbose("The password is : " + getProps().getProperty("valid_password"));
		waitExplicitly(1);
		login.enterUsername(getProps().getProperty("valid_username"));
		waitExplicitly(1);
		login.enterPassword(getProps().getProperty("valid_password"));
		verbose("***********************************************************");
	}*/

	@When("^click on all products$")
	public void click_on_all_products() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.allproducts());
		verbose("***********************************************************");
	}

	@Then("^I should navigate to batteries$")
	public void i_should_navigate_to_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.batteries());
		verbose("***********************************************************");
	}
	@Then("^select non recharchable batteries$")
	public void select_non_recharchable_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.nonreachargebatteries());
		verbose("***********************************************************");
	    
	}

	@Then("^select camera batteries$")
	public void select_camera_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.camerabatteries());
		verbose("***********************************************************");
	    
	}

	@Then("^select duracell ulta photo batteries$")
	public void select_duracell_ulta_photo_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.duracell());
		verbose("***********************************************************");
	    
	}

	@Then("^click on add to basket$")
	public void click_on_add_to_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.addbasket());
		verbose("***********************************************************");
	    
	}

	@Then("^view basket$")
	public void view_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.viewbasket());
		verbose("***********************************************************");
	 
	}

	@Then("^click on checkout$")
	public void click_on_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_rsc.checkout());
		verbose("***********************************************************");
	    
	}

	@Then("^close the browser driver$")
	public void close_the_browser_driver() throws Throwable {
		verbose("***********************************************************");
		// Write code here that turns the phrase above into concrete actions
		browser.tearDown();
		verbose("***********************************************************");
	}

}

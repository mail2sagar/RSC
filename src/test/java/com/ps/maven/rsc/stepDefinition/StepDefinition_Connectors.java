package com.ps.maven.rsc.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ps.maven.rsc.NavigateConnectors;
import com.ps.maven.utils.BrowserTypes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Connectors extends BrowserTypes{
	WebDriver driver = null;
	BrowserTypes browser = new BrowserTypes();	
	
	
	NavigateConnectors navigate_Connectors = new NavigateConnectors();
	

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

	
	@When("^click on all products$")
	public void click_on_all_products() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.allproducts());
		verbose("***********************************************************");
	}

	@Then("^I should navigate to connectors$")
	public void i_should_navigate_to_connectors() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.connectors());
		verbose("***********************************************************");
	}
	@Then("^select power connectors$")
	public void select_power_connectors() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.powerconnectors());
		verbose("***********************************************************");
	    
	}

	@Then("^select automotive connectors$")
	public void select_automotive_connectors() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.AutomotiveConnectors());
		verbose("***********************************************************");
	    
	}

	@Then("^select duracell ulta photo batteries$")
	public void select_duracell_ulta_photo_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.TEConnectivity());
		verbose("***********************************************************");
	    
	}

	@Then("^click on add to basket$")
	public void click_on_add_to_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.addbasket());
		verbose("***********************************************************");
	    
	}

	@Then("^view basket$")
	public void view_basket() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.viewbasket());
		verbose("***********************************************************");
	 
	}

	@Then("^click on checkout$")
	public void click_on_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(navigate_Connectors.checkout());
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

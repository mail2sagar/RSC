package com.ps.maven.rsc.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.ps.maven.rsc.SearchFilter1;
import com.ps.maven.utils.BrowserTypes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition_Filter1 extends BrowserTypes{
	WebDriver driver = null;
	BrowserTypes browser = new BrowserTypes();	
	
	 SearchFilter1 search_filter1 = new SearchFilter1();
	

	//@Given("^navigate to RSC site$")
	@Given("^navigate to RSC site1$")
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
		Assert.assertTrue(search_filter1.allproducts());
		verbose("***********************************************************");
	}

	@Then("^I should navigate to batteries$")
	public void i_should_navigate_to_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(search_filter1.batteries());
		verbose("***********************************************************");
	}
	@Then("^select non recharchable batteries$")
	public void select_non_recharchable_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(search_filter1.nonreachargebatteries());
		verbose("***********************************************************");
	    
	}

	@Then("^select camera batteries$")
	public void select_camera_batteries() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(search_filter1.camerabatteries());
		verbose("***********************************************************");
	    
	}

	@Then("^click on brand from the filter options$")
	public void select_brand() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(search_filter1.brand());
		verbose("***********************************************************");
	}

	@Then("^click duracell$")
	public void click_on_duracell() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(search_filter1.duracell());
		verbose("***********************************************************");
	    
	}


	@Then("^click on apply filter$")
	public void click_on_apply_filter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		verbose("***********************************************************");
		Assert.assertTrue(search_filter1.applyfilter());
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
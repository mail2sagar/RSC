package com.ps.maven.rsc;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ps.maven.utils.BrowserTypes;

public class SearchFilter1 extends BrowserTypes {
	WebDriver driver = null;
	
	String actual_stock_no = null;
	
	By AllProducts =  By.xpath("//div[3]/div/ul/li[1]/a");
	By Batteries = By.xpath("//div[3]/div/ul/li[1]/ul/li[2]/a");
	By NonRechargeable = By.xpath("//ul/li[3]/div/a");
	By CameraBatteries = By.xpath("//ul/li[7]/div/a");
	By Brand = By.cssSelector("#filters > div > div > rs-facets > a:nth-child(1)");
	By Duracell = By.cssSelector("#\\34 294966532 > span");
	By ApplyFilter = By.xpath("//div/div[2]/div/div[6]/rs-apply-button/button");
	By AppliedFilter = By.xpath("//div[2]/h4/a[2]");
	

//Selecting all products
	public Boolean allproducts(){
		verbose("Clicking on all products");
		getElement(AllProducts).click();	
		waitExplicitly(1);
		//validating whether Electronics items menu has been expanded or not
		
		By Electronics = null;
		String electronics_items = getElement(Electronics).getText();
				if (electronics_items =="Electronics"){
					verbose("All electronics items are visible");
					return true;
				} else {
					error("Electronics items are not visible, hence user can not select the required item");
					return false;
				}
	}
	
//Selecting the Batteries from the options	
	public Boolean batteries() {
		waitExplicitly(1);
		verbose("selecting batteries");
		getElement(Batteries).click();
		//validating whether batteries has been selected or not from the options
		if (driver.getTitle().contains("Batteries | RS Components")){
			verbose("After selecting batteries page has been navigates to Batteries page successfully!");
			return true;
		} else {
			error("user is not navigates to batteries page");
			return false;
		}
	}
	
	//Selecting the non rechargeable Batteries from the options	
	public Boolean nonreachargebatteries() {
		waitExplicitly(1);
		verbose("selecting non recharge batteries");
		getElement(NonRechargeable).click();
		//validating whether NonRechargeable batteries has been selected or not from the options
		if (driver.getTitle().contains("Non-Rechargeable Batteries | RS Components")){
			verbose("After selecting non rechargable batteries page has been navigates to non rechargable Batteries page successfully!");
			return true;
		} else {
			error("user is not navigates to non rechargable batteries page");
			return false;
		}
	}
	
	//Selecting the camera batteries from the options	
		public Boolean camerabatteries() {
			waitExplicitly(1);
			verbose("selecting non recharge batteries");
			getElement(CameraBatteries).click();
			//validating whether camera batteries has been selected or not from the options
			if (driver.getTitle().contains("Camera Batteries | RS Components")){
				verbose("After selecting non Camera Batteries page has been navigates to Camera Batteries page successfully!");
				return true;
			} else {
				error("user is not navigated to Camera Batteries page");
				return false;
			}
		}
		
		//Selecting the brand from the filter options	
		public boolean brand() {
			waitExplicitly(1);
			verbose("selecting brand from filter");
			getElement(Brand).click();
			return false;
		}
		//Selecting duracell from the list
		public boolean duracell() {
		//String actual_stock_no = null;
		waitExplicitly(1);
		verbose("selecting duracell from the filter");
		getElement(Duracell).click();
		return false;
		}
		
		//Apply filter 
				public Boolean applyfilter() {
					
					waitExplicitly(1);
					verbose("clicking on apply filter");
					getElement(ApplyFilter).click();
					return null;
				}
				}

		
				
				
				
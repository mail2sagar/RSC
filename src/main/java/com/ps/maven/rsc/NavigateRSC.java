package com.ps.maven.rsc;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.ps.maven.utils.BrowserTypes;

public class NavigateRSC extends BrowserTypes {
	WebDriver driver = null;
	
	String actual_stock_no = null;
	
	By AllProducts =  By.xpath("//div[3]/div/ul/li[1]/a");
	By Batteries = By.xpath("//div[3]/div/ul/li[1]/ul/li[2]/a");
	By NonRechargeable = By.xpath("//ul/li[3]/div/a");
	By CameraBatteries = By.xpath("//ul/li[7]/div/a");
	By Duracell = By.cssSelector("#results-table > tbody > tr:nth-child(1) > td.descriptionCol.compareContainer > div.row.margin-bottom > a");
	By AddtoBasket = By.xpath("//div/div[2]/div/div[3]/button");
	By GotoBasket = By.xpath("//div/div[2]/div/div[4]/button");
	By Stock_no1 = By.xpath("//div/div[1]/div[1]/div/ul/li[1]/span[2]");
	By Stock_no2 = By.xpath("//table/tbody/tr[3]/td[2]/div[2]/span[2]");
	By Guestpopup = By.cssSelector("#loginModelPanel_header_content > span");
	By CheckoutSecurely = By.cssSelector("#checkoutSecurelyAndPuchBtn");
	By Electronics = By.xpath("//div[3]/div/ul/li[1]/ul/li[1]");
	

//Selecting all products
	public Boolean allproducts(){
		verbose("Clicking on all products");
		getElement(AllProducts).click();	
		waitExplicitly(1);
		//validating whether Electronics items menu has been expanded or not
		
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
		
		//Selecting the duracell batteries from the options	
				public Boolean duracell() {
					//String actual_stock_no = null;
					waitExplicitly(1);
					verbose("selecting duracell battery");
					getElement(Duracell).click();
					//get stock number from the selected duracell batteries 
					actual_stock_no = getElement(Stock_no1).getText();
					//Validating whether page has been navigates to add basket page
					if (driver.getTitle().contains("5000394020320 | Duracell Ultra Photo CR123A 3V Lithium Manganese Dioxide Camera Battery | Duracell")){
						verbose("After selecting duracell battery page has been navigates to Add basket page successfully!");
						return true;
					} else {
						error("page still remains the same page");
						return false;
					}
				}
				
				//Add to basket 	
				public Boolean addbasket() {
					//String actual_stock_no = null;
					waitExplicitly(1);
					verbose("clicking on add to basket");
					getElement(AddtoBasket).click();
					return null;
				}

				//Clicking view basket	
				public Boolean viewbasket() {
					waitExplicitly(1);
					verbose("clicking on view basket");
					getElement(GotoBasket).click();
					//validating whether selected product has been added to my basket or not
					
					String actual_stock_no2 = getElement(Stock_no2).getText();
					
					if (actual_stock_no2 == actual_stock_no){
						verbose("Selected product has been moved to my basket successfully!");
						return true;
					} else {
						error("Wrong product has been selected / product has not been selected at all");
						return false;
					}
				}
				
				//Checkout	
				public Boolean checkout() {
					waitExplicitly(1);
					verbose("clicking on secure checkout");
					getElement(CheckoutSecurely).click();
					//validating whether checked out has been successful or not
					
					String guestwindow = getElement(Guestpopup).getText();
					
					if (guestwindow == "Log in or continue as a guest"){
						verbose("Product has been moved to check out successfully!");
						return true;
					} else {
						error("product has not been moved to check out");
						return false;
					}
				}
				}
				
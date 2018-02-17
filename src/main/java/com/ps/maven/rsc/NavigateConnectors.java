package com.ps.maven.rsc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ps.maven.utils.BrowserTypes;

public class NavigateConnectors extends BrowserTypes {
	WebDriver driver = null;
	
	String actual_stock_no = null;
	
	By AllProducts =  By.xpath("//div[3]/div/ul/li[1]/a");
	By Connectors = By.xpath("//div[3]/div/ul/li[1]/ul/li[3]/a");
	By PowerConnectors = By.xpath("//*[@id=\"categories\"]/ul/li[10]/div/a");
	By AutomotiveConnectors = By.xpath("//*[@id=\"categories\"]/ul/li[2]/div/a");
	By TEConnectivity = By.cssSelector("#results-table > tbody > tr:nth-child(1) > td.descriptionCol.compareContainer > div.row.margin-bottom");
	By AddtoBasket = By.xpath("//div/div[2]/div/div[3]/button");
	By GotoBasket = By.xpath("//div/div[2]/div/div[4]/button");
	By Stock_no1 = By.xpath("//tr[9]/td[2]/div[2]/span[2]");
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
	
//Selecting the Connectors from the options	
	public Boolean connectors() {
		waitExplicitly(1);
		verbose("selecting connectors");
		getElement(Connectors).click();
		//validating whether connectors has been selected or not from the options
		if (driver.getTitle().contains("Connectors | RS Components")){
			verbose("After selecting batteries page has been navigates to Connectors page successfully!");
			return true;
		} else {
			error("user is not navigates to Connectors page");
			return false;
		}
	}
	
	//Selecting the power connectors from the options	
	public Boolean powerconnectors() {
		waitExplicitly(1);
		verbose("selecting power connectors");
		getElement(PowerConnectors).click();
		//validating whether power connectors has been selected or not from the options
		if (driver.getTitle().contains("Power Connectors | RS Components")){
			verbose("After selecting power connectors page has been navigates to power connectors page successfully!");
			return true;
		} else {
			error("user is not navigates to power connectors page");
			return false;
		}
	}
	
	//Selecting the Automotive Connectors from the options	
		public Boolean AutomotiveConnectors() {
			waitExplicitly(1);
			verbose("selecting Automotive Connectors");
			getElement(AutomotiveConnectors).click();
			//validating whether Automotive Connectors has been selected or not from the options
			if (driver.getTitle().contains("Automotive Connectors | RS Components")){
				verbose("After selecting Automotive Connectors page has been navigates to Automotive Connectors page successfully!");
				return true;
			} else {
				error("user is not navigated to Automotive Connectors page");
				return false;
			}
		}
		
		//Selecting the TE Connectivity AMP Connector from the options	
				public Boolean TEConnectivity() {
					//String actual_stock_no = null;
					waitExplicitly(1);
					verbose("selecting TE Connectivity");
					getElement(TEConnectivity).click();
					//get stock number from the selected TE Connectivity 
					actual_stock_no = getElement(Stock_no1).getText();
					//Validating whether page has been navigates to add basket page
					if (driver.getTitle().contains("282080-1 | TE Connectivity AMP SUPERSEAL 1.5 Series, 1 Row 2 Way Cable Mount Socket Connector, with Crimp Termination Method | TE Connectivity")){
						verbose("After selecting TE Connectivity page has been navigates to Add basket page successfully!");
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




package com.selenium.automation.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.selenium.automation.base.TestBase;

public class Salesforce_ActionEngine extends TestBase {
	WebElement webElement;
	
	public WebElement getWebElement(By locator) throws Exception{
		webElement = driver.findElement(locator);
		return webElement;
		
	}
	
	
			
			public void isWebElementDisplayed(By locator,String locatorName )
				{try {
					WebElement we = driver.findElement(locator);
					System.out.println( we.isDisplayed());}
				catch(Exception e) {
					e.printStackTrace();
				}
				}
			
				public void isWebElementEnabled(By locator,String locatorName )
				{try {
					WebElement we = driver.findElement(locator);
					System.out.println(we.isEnabled());}
				catch(Exception e) {
					e.printStackTrace();
				}
				}
	
	public void click(By locator) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.click();
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}
	
	public void type(By locator, String locatorName,String data) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			we.clear();
			we.sendKeys(data);
		}catch(Exception e) {
			e.printStackTrace();
		} 
		finally {
			
		}}
		

  
	public void selectByyDropdownVisibleText(By locator, String locatorName, String visibleText) throws Exception{
		
		try {
			WebElement we = getWebElement(locator);
			Select dropDown = new Select(we);
			dropDown.selectByVisibleText(visibleText);
			
		}catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
	}}
	

	



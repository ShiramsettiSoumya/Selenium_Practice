package com.selenium.automation.pages;

import org.openqa.selenium.By;

import com.selenium.automation.actions.Salesforce_ActionEngine;

public class SalesForceTryForFreePage extends Salesforce_ActionEngine {

	// finding elements through different locators
	// used X-path
	private By Tryforfree = By.xpath("//a[@class='button secondary']");
	// using ID
	private By FIrstName = By.name("UserFirstName");
	// using name
	private By LastName = By.name("UserLastName");

	private By Email = By.xpath("//input[@type='email']");
	private By Company = By.xpath("//input[@name='CompanyName']");
	
	private By Phone = By.xpath("//input[@type='tel']");
	private By JobTitle = By.xpath("//select[@name='UserTitle']");
	private By Employees = By.xpath("//select[@name='CompanyEmployees']");
	private By IagreetotheMainServicesAgreement = By
			.xpath("(//div[@class='field']//div[@class='checkbox-ui'])[position()=2]");
	private By StartMyFreeTrial = By.xpath("//button[@name='start my free trial']");

	public void validateSubmitFunctionality() throws Exception {
		click(Tryforfree);

		Thread.sleep(2000);
		isWebElementDisplayed(FIrstName, "First name ");
		isWebElementEnabled(FIrstName, "First name ");
        type(FIrstName, "First name", "Shiramsetti");
        
        
        isWebElementDisplayed(LastName, "Last name");
        isWebElementEnabled(LastName, "Last name");
		type(LastName, "Last name", "Soumya");
		
		
		type(Email, "Email", "shiramsettisoumya1994@gmail.com");
		click(JobTitle);
		selectByyDropdownVisibleText(JobTitle, "Job Title", "Sales Manager");
		type(Company, "Company", "Infosys");
		click(Employees);
		selectByyDropdownVisibleText(Employees, "Employees", "2001+ employees");
		type(Phone, "Phone", "9502516985");
		click(IagreetotheMainServicesAgreement);
		click(StartMyFreeTrial);
	}

}
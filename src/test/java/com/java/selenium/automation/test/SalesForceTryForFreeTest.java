package com.java.selenium.automation.test;

import org.testng.annotations.Test;

import com.selenium.automation.base.TestBase;
import com.selenium.automation.pages.SalesForceTryForFreePage;

public class SalesForceTryForFreeTest extends TestBase{

	SalesForceTryForFreePage salesForceTryForFreePage=new SalesForceTryForFreePage();
	@Test
	public void salesForceTryForFreeTest() throws Exception
	{
	
		salesForceTryForFreePage.validateSubmitFunctionality();
	}
}

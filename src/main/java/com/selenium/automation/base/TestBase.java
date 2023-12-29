package com.selenium.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.java.automation.utility.LoadProperties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	@Parameters({"browser"})
     @BeforeMethod
	public static void setup(String driverType) throws Exception {
		if(driverType.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}else if(driverType.equals("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		//driver.get("https://www.instagram.com");
		driver.get(LoadProperties.getData("Url"));
		}
	@AfterMethod
	public void closedriver() throws InterruptedException {
		Thread.sleep(3000);
		//driver.close();
	}
	}



package com.Scneider.Xyphias.Hi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demote4wts {
	public static WebDriver driver;
	
	@Test
	
	public void Test1() {
		
System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver 76\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		
		//((JavascriptExecutor)driver).executeScript("windows.scrollTo(0, documemt.body.scrollHeight)");
		
		driver.get("https://www.crmpro.com");
		
		String CRMtitle = driver.getTitle();
		
		
		Assert.assertEquals("CRMtitle","Hey");
	}

}

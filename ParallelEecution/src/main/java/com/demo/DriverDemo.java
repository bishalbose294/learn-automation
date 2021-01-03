package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverDemo {
	
	@Test
	public void blaunchDriver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.google.com");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

	@Test
	public void aopenFacebook() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	@Test
	public void atYoutube() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.youtube.com");
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}

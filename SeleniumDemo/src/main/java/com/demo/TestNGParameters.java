package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGParameters {
	
	WebDriver driver=null;
	
	@BeforeClass
	public void launchDriver() throws Exception
	{
		System.out.println("inside BeforeMethod");
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver.exe");
		driver = new ChromeDriver(); 
	}
	
	@Test
	public void executeTestCase1() throws Exception
	{
		System.out.println("inside TestCase1");
		driver.get("https://www.google.com");
		Thread.sleep(1000);
	}
	
	@Test
	public void executeTestCase2() throws Exception
	{
		System.out.println("inside TestCase2");
		driver.get("https://www.youtube.com");
		Thread.sleep(1000);
	}
	
	@Test
	public void executeTestCase3() throws Exception
	{
		System.out.println("inside TestCase3");
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
	}
	
	@AfterClass
	public void quitDriver() throws Exception
	{
		System.out.println("inside AfterMethod");
		driver.quit();
	}
}

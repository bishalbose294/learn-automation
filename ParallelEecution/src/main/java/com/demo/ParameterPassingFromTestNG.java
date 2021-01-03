package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterPassingFromTestNG {
	
	@Test
	public void openDynamicUrl(ITestContext context) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		String url = context.getCurrentXmlTest().getParameter("bhavini");
		driver.get(url);
		
		String text = context.getCurrentXmlTest().getParameter("munot");
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	@Test
	@Parameters({"bhavini","munot"})
	public void openDynamicUrl(String url, String text) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		System.out.println(text);
		
		Thread.sleep(2000);
		driver.quit();
	}

}

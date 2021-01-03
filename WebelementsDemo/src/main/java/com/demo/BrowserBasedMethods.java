package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserBasedMethods {

	@Test(enabled=false)
	public void browserMethods()
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
				
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/");
		
		String title = driver.getTitle();
		System.out.println("Title of current Page " +title);
		
		int titlelength = driver.getTitle().length();
		System.out.println("Length of Title " +titlelength);
		
		String url = driver.getCurrentUrl();
		System.out.println("URL of Current Page " +url);
		if(url.equals("https://www.toolsqa.com/"))
		{
			System.out.println("Correct URL");
		}
		else 
			System.out.println("Incorrect URL");
		
		String pagesource = driver.getPageSource();
		System.out.println("Page Source of Current Page " +pagesource);
		
		int pagesourcelength = driver.getPageSource().length();
		System.out.println("Length of Page Source " +pagesourcelength);
		
		driver.close();
		
		driver.quit();
	}
	
	@Test
	public void verifyTitle()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.toolsqa.com/");
			
			WebElement demosite = driver.findElement(By.linkText("DEMO SITES"));
			demosite.click();
			Thread.sleep(2000);
			WebElement practice = driver.findElement(By.linkText("Automation Practice Form"));
			practice.click();
			
			//String title = driver.getTitle();
			if(driver.getTitle().contains("ToolsQA"))
			{
				System.out.println("Yes it is present");
			}
			else
			{
				System.out.println("No it is not present");
			}
			
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

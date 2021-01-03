package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationCommands {

	@Test
	public void navigationButtons()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.toolsqa.com/");
			Thread.sleep(2000);
			
			driver.navigate().to("https://demoqa.com/automation-practice-form/");
			
			driver.navigate().back();
			
			driver.navigate().forward();
			
			driver.navigate().refresh();
			
			driver.quit();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

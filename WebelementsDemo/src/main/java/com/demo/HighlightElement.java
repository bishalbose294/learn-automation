package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HighlightElement 
{
	@Test
	public void highlightDemo()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.toolsqa.com/");
			
			Thread.sleep(2000);
			  
			WebElement demoSites= driver.findElement(By.linkText("DEMO SITES"));  
			
			String colorStyle = "arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');";
			
			((JavascriptExecutor)driver).executeScript(colorStyle, demoSites);
			
			Thread.sleep(5000);
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

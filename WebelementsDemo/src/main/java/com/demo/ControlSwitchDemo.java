package com.demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ControlSwitchDemo {
	
	@Test
	public void newTab()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.toolsqa.com/");
			
			driver.manage().window().maximize();
			
			WebElement demoSite = driver.findElement(By.linkText("DEMO SITES"));
			demoSite.click();
			
			Thread.sleep(2000);
			
			WebElement switchwindow = driver.findElement(By.linkText("Automation Practice Switch Windows"));
			switchwindow.click();
			
			WebElement newTabButton = driver.findElement(By.xpath(".//button[text()='New Browser Tab']"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", newTabButton);
			
			newTabButton.click();
			
			String currentWindowHandle = driver.getWindowHandle();
			
			System.out.println("Current Window hanle : "+currentWindowHandle);
			System.out.println("Current Title : "+driver.getTitle());
			
			Set<String> windowHandles = driver.getWindowHandles();//stores unique elements and in unordered fashion
			
			Iterator<String> it = windowHandles.iterator();
			
			while(it.hasNext())
			{
				try {
					String currentWindow = it.next();
					
					driver.switchTo().window(currentWindow);
					
					driver.findElement(By.linkText("DEMO SITES"));
					
					break;
					
				} catch (Exception e) {}
			}
			
			demoSite = driver.findElement(By.linkText("DEMO SITES"));
			demoSite.click();
			
			Thread.sleep(2000);
			
			switchwindow = driver.findElement(By.linkText("Automation Practice Switch Windows"));
			switchwindow.click();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//https://chandanachaitanya.github.io/selenium-practice-site/

}

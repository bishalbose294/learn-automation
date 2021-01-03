package com.demo;

import java.io.File;
import java.util.Iterator;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchWindows {
	
	@Test
	public void switchTabs()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://chandanachaitanya.github.io/selenium-practice-site/");
			
			driver.manage().window().maximize();
			
			WebElement newwindow = driver.findElement(By.xpath(".//button[@id='win1']"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", newwindow);
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("E:\\Bhavi\\Selenium\\screen.png"));
			
			newwindow.click();
			
			String mainwindow = driver.getWindowHandle();
			
			Set<String> windowHandles = driver.getWindowHandles();
			Iterator<String> it = windowHandles.iterator();
			
			while(it.hasNext())
			{
				try {
					String currentwindow = it.next();
					driver.switchTo().window(currentwindow);
					driver.findElement(By.xpath(".//input[@name='q']"));
					break;
				} catch (Exception e) {
				}
			}
			
			WebElement searchBar = driver.findElement(By.xpath(".//input[@name='q']"));
			searchBar.sendKeys("Bhavi");
			
			driver.switchTo().window(mainwindow);
			
			WebElement message = driver.findElement(By.id("enterText"));
			message.sendKeys("hi");
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

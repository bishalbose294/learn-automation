package com.demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionsDemo {

	@Test
	public void assertionDemo() {
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		
		WebDriver driver = new ChromeDriver();
		
		try {
			
			
			
			driver.get("https://www.toolsqa.com/");
			
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			
			WebElement demosite = driver.findElement(By.linkText("DEMO SITES"));
			demosite.click();
			
			WebElement basicsite = driver.findElement(By.linkText("Basic Demo Site"));
			basicsite.click();
			
            Set<String> windowHandles = driver.getWindowHandles();//stores unique elements and in unordered fashion
			
			Iterator<String> it = windowHandles.iterator();
			
			WebDriverWait explicitWait = new WebDriverWait(driver, 10);
			WebElement text = null;
			
			while(it.hasNext())
			{
				try {
					String currentWindow = it.next();
					
					driver.switchTo().window(currentWindow);
					
					explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[@id='content']")));
					
					text = driver.findElement(By.xpath(".//div[@id='content']"));
					
					break;
					
				}catch (Exception e) {}
			}
			
			//Assert.assertEquals(text.getText().toUpperCase(), "home");
			
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(text.getText().toUpperCase(), "home");
			
			driver.findElement(By.linkText("Menu")).click();
			
			System.out.println("Menu Clicked");
			
			softAssert.assertAll();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	}
}
package com.demo;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FindElementsDemo {
	
	@Test(enabled=false)
	public void findElementByDriver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver.exe");
		
		WebDriver driver; // -> driver here is an Instance variable
		driver = new ChromeDriver(); // -> driver here is the Object of ChromeDriver class
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.name("userName"));
		userName.sendKeys("CutePanda");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("abc");
		
		Thread.sleep(1000);
		
		userName.clear();
		password.clear();
		
		Thread.sleep(1000);
		
		WebElement homeLink = driver.findElement(By.linkText("Home"));
		homeLink.click();
		
		WebElement flights = driver.findElement(By.linkText("Flights"));
		flights.click();
		
		WebElement contacts = driver.findElement(By.linkText("CONTACT"));
		contacts.click();
		
		Thread.sleep(1000);
		
		WebElement businessTravel = driver.findElement(By.partialLinkText("Business Travel"));
		businessTravel.click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}
	
	@Test
	public void findElementsByDriver() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		System.out.println("Size : "+allLinks.size());
		
		driver.quit();
	}
	
	
}

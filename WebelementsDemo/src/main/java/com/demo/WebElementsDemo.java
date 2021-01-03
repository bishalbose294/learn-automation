package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebElementsDemo {

	@Test
	public void launchBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.toolsqa.com/");
			
			WebElement demosite = driver.findElement(By.partialLinkText("DEMO SITES"));
			demosite.click();
			
			Thread.sleep(1000);
			
			WebElement practiceform = driver.findElement(By.linkText("Automation Practice Form"));
			practiceform.click();
			
			Thread.sleep(1000);
			
			/*WebElement firstname = driver.findElement(By.xpath(".//input[@name='firstname']"));
			firstname.sendKeys("bhavi");

			Thread.sleep(2000);
			
			firstname.clear();
			
			Thread.sleep(2000);
			
			firstname.sendKeys("bhavi");
			
			Thread.sleep(2000);
			
			firstname.click();
			
			
			Thread.sleep(2000);
			
			System.out.println("Name: "+firstname.getAttribute("name"));
			System.out.println("Type: "+firstname.getAttribute("type"));
			System.out.println("Value: "+firstname.getAttribute("value"));
			
			System.out.println(firstname.getClass());
			
			System.out.println(firstname.getCssValue("height"));
			
			System.out.println("X - "+firstname.getLocation().getX());
			System.out.println("Y - "+firstname.getLocation().getY());
			
			System.out.println("Rect Height - "+firstname.getRect().getHeight());
			System.out.println("Rect Width - "+firstname.getRect().getWidth());
			
			System.out.println("Size Height - "+firstname.getSize().getHeight());
			System.out.println("Size Width - "+firstname.getSize().getWidth());
			
			System.out.println("Tagname : "+firstname.getTagName());
			
			System.out.println("Is Displayed? : "+firstname.isDisplayed());
			
			System.out.println("Is Enabled? : "+firstname.isEnabled());
			
			System.out.println("Is Selected? : "+firstname.isSelected());
			
			System.out.println(firstname.toString());
			
			firstname.submit();*/
			
			/*firstname.findElement(null);
			firstname.findElements(null);
			firstname.getText();
			firstname.sendKeys("");*/
			
			WebElement submitButton =  driver.findElement(By.xpath(".//nav[@id='main']"));
			System.out.println("Color : "+submitButton.getCssValue("background-color"));
			
			driver.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

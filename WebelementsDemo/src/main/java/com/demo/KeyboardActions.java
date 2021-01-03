package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActions {

	@Test(enabled=false)
	public void keyboardActionsDemo() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();
		
		WebElement homeLink = driver.findElement(By.xpath(".//a[text()='Home']"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(homeLink).build().perform();
		
		Thread.sleep(5000);
		
		driver.quit();
	}
	
	@Test
	public void doubleAndRightClick()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Bhavi\\\\Selenium\\\\Driver\\\\chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/tooltip-and-double-click/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dclick = driver.findElement(By.id("doubleClickBtn"));
		
		Actions builder = new Actions(driver);
		
		builder.doubleClick(dclick).build().perform();
		
		Alert alertElement = driver.switchTo().alert();
		
		System.out.println(alertElement.getText());
		alertElement.accept();
		
		WebElement rclick = driver.findElement(By.id("rightClickBtn"));
		
		builder.contextClick(rclick).build().perform();
		
		WebElement editbutton = driver.findElement(By.xpath(".//div[contains(text(),'Edit')]"));
		editbutton.click();
		alertElement = driver.switchTo().alert();
		alertElement.accept();
		
		WebElement hover = driver.findElement(By.id("tooltipDemo"));
		builder.moveToElement(hover).build().perform();
		
		driver.quit();
		
		
	}
	
}

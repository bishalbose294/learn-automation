package com.demo;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWaitCommands {
	
	@Test(enabled=false)
	public void implicitWaitCommand()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		WebElement editor = driver.findElement(By.linkText("WYSIWYG Editor"));
		
		/*JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", editor);*/
		
		
		editor.click();
		
		driver.quit();
	}

	@Test(enabled=false)
	public void explicitWaitCommand()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("WYSIWYG Editor")));
		
		WebElement editor = driver.findElement(By.linkText("WYSIWYG Editor"));
		editor.click();
		
		driver.quit();
	}
	
	@Test
	public void fluentWaitCommand()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		Wait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
								.withTimeout(30, TimeUnit.SECONDS)
								.pollingEvery(5, TimeUnit.SECONDS)
								.ignoring(NoSuchElementException.class);
		
		WebElement editor = fluentWait.until(new Function<WebDriver,WebElement>() {
			public WebElement apply(WebDriver driver) 
			{
				return driver.findElement(By.linkText("WYSIWYG Editor"));
			}
			});
		
		editor.click();
		driver.quit();
		
	}
}

package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollingDemo {
	
	@Test
	public void verticalScrolling()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.toolsqa.com/");
			
			driver.manage().window().maximize();
			
			Thread.sleep(1000);
			
			//scrolling by pixels
			JavascriptExecutor js = (JavascriptExecutor) driver;
			String script = "window.scrollBy(0,1000)";
			js.executeScript(script);
			
			//js.executeScript("window.scrollBy(x-pixels,y-pixels)");
			
			Thread.sleep(2000);
			
			//scroll till element is in view
			WebElement bottomText = driver.findElement(By.xpath(".//div[@class='bottom-text-block']"));
			script = "arguments[0].scrollIntoView();";
			js.executeScript(script,bottomText);
			
			//scroll till end of the page
			script="window.scrollTo(0, document.body.scrollHeight)";
			js.executeScript(script);
			
			Thread.sleep(2000);
			
			driver.quit();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

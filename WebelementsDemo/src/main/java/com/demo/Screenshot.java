package com.demo;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot {

	@Test
	public void captureScreenshot()
	{
		try {
			
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.toolsqa.com/");
			
			Thread.sleep(1000);
			
			File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("E:/Bhavi/Selenium/error.png"));
			
			Thread.sleep(1000);
			
			driver.quit();
			
		}  
		catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}

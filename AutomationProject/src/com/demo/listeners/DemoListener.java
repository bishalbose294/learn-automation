package com.demo.listeners;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DemoListener {

	@Test
	public void openBrowser()
	{
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(true, false);
		
		driver.quit();
	}
	
	@Test
	public void openBrowser2()
	{
        System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		Assert.assertEquals(true, true);
		
		driver.quit();
	}

}

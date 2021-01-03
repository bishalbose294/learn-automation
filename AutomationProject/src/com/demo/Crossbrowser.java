package com.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Crossbrowser {

	@Test
	@Parameters({"browser"})
	public void launchDriver(String browser)
	{
		WebDriver driver = null;
		switch(browser)
		{
		case "chrome" :
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			driver= new ChromeDriver();
			break;
			
		case "edge" :
			System.setProperty("webdriver.edge.driver", "./lib/msedgedriver.exe");
			driver= new EdgeDriver();
			break;
			
		case "firefox" :
			System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
			driver= new FirefoxDriver();
			break;
			
		
		}
		
		
		
		
		driver.get("http://the-internet.herokuapp.com/");	
		driver.quit();
		
	}
}

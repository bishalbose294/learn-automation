package com.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class DesiredCapabilitesChromeOptionsDemo {
	
	@Test(testName = "Execute Method")
	public static void executeMethod() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("acceptSslCerts", "true");
		capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		//options.addArguments("incognito");
		//options.addArguments("headless");
		//options.addArguments("disable-extensions");
		//options.addArguments("disable-popup-blocking");
		//options.addArguments("make-default-browser");
		//options.addArguments("version");
		options.addArguments("disable-infobars");
		
		options.merge(capabilities);
		
		WebDriver driver = new ChromeDriver(options);

		driver.get("http://www.fao.org/home/en");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(driver.getTitle());
		
		
		
		
		
		Thread.sleep(5000);
		
		driver.quit();

	}

}

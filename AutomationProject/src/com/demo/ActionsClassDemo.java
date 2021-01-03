package com.demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariOptions;

public class ActionsClassDemo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Actions builder = new Actions(driver);
		
		
		
		/*WebElement cmenu = driver.findElement(By.linkText("Context Menu"));
		cmenu.click();
		
			WebElement cbox = driver.findElement(By.xpath(".//div[@id='hot-spot']"));
			
			
			Action contextMenu = builder.contextClick(cbox).build();
			
			contextMenu.perform();
			
			Alert alert = driver.switchTo().alert();
			System.out.println(alert.getText());
			
			alert.accept();
			
			//cbox.click();
			
			driver.navigate().back();
			
			WebElement dragAndDrop = driver.findElement(By.linkText("Drag and Drop"));
			dragAndDrop.click();
			
			WebElement source = driver.findElement(By.xpath(".//div[@id='column-a']/header"));
			WebElement target = driver.findElement(By.xpath(".//div[@id='column-b']/header"));
			Actions builder2 = new Actions(driver);
			Action dragdrop = builder2.dragAndDrop(source, target)
										.dragAndDrop(target, source)
										.dragAndDrop(source, target)
										.dragAndDrop(target, source)
										.build();
			dragdrop.perform();
			
			driver.navigate().back();*/
			
		   
		    /*
			WebElement keypress = driver.findElement(By.linkText("Key Presses"));
			keypress.click();
			 WebElement textbox = driver.findElement(By.id("target"));
			 textbox.click();
			builder.keyDown(Keys.ALT).keyUp(Keys.ALT).build().perform();
			Thread.sleep(500);
			builder.keyDown(Keys.CONTROL).keyUp(Keys.CONTROL).build().perform();
			builder.keyDown(textbox, Keys.SHIFT)
			.sendKeys(textbox, "hi")
			.keyUp(textbox, Keys.SHIFT)
			.build().perform();
			builder.sendKeys(textbox, Keys.ENTER).build().perform();
			builder.keyDown(textbox, Keys.ESCAPE)
			.sendKeys(textbox, Keys.ESCAPE)
			.keyUp(textbox, Keys.ESCAPE)
			.build().perform();
			builder.sendKeys(textbox, Keys.ESCAPE).build().perform();
			

			*/
	}

}

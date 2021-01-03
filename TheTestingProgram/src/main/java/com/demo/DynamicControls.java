package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicControls {

	/*
	1. check if checkbox is present
	2. verify whether button is remove
	3. click remove
	4. verify if checkbox dissappears
	5. verify button is add
	6. click on add 
	7. check if checkbox reappears
	8. check whether 2nd button is named as Enable 
	9. check whetehr text box is disabled
	10. click on enable button
	11. check of button changes to disbale
	12. check if texbox is enabled
	13. type somehting inside checkbox
	14. click on disable button 
	15. check if button renamed to enable
	16. check if textbox is disabled
	17. print the text inside the textbox in console
 */
	@Test
	public void dynamicControlButtons() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		WebElement dynacontrols = driver.findElement(By.linkText("Dynamic Controls"));
		dynacontrols.click();
		Thread.sleep(1000);
		
		WebElement cbox = driver.findElement(By.id("checkbox"));
		System.out.println("Text on the checkbox:-" + cbox.getText());
		
		WebElement rbutton = driver.findElement(By.xpath(".//button[text()='Remove']"));
		
		System.out.println("Text on the Remove button" + rbutton.getText());
		if(rbutton.getText().equals("Remove"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		rbutton.click();
		
		WebDriverWait explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.invisibilityOf(cbox));
		
		if (driver.findElements(By.id("checkbox")).size() == 0)
		{
			System.out.println("Checkbox Not Present");
		}
		else
		{
			System.out.println("Checkbox present");
		}
		
		explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(".//button[text()='Add']")));
		
		WebElement abutton = driver.findElement(By.xpath(".//form[@id = 'checkbox-example']//button"));
		System.out.println("Text on the Add button:-" + abutton.getText());
		Assert.assertEquals(abutton.getText(), "Add");
		Thread.sleep(1000);
		abutton.click();
		
		explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
		
		if (driver.findElements(By.id("checkbox")).size() == 0)
		{
			System.out.println("Checkbox Not Present");
		}
		else
		{
			System.out.println("Checkbox present");
		}
		
		WebElement ebutton = driver.findElement(By.xpath(".//button[text()='Enable']"));
		System.out.println("Text present on enable button:-" + ebutton.getText());
		
		/*explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@type='text'")));*/
		WebElement inputfield = driver.findElement(By.xpath(".//input[@type='text']"));
		
		if(inputfield.isEnabled())
		{
			System.out.println("Textbox is enabled");
		}
		else
		{
			System.out.println("Textbox is disabled");
		}
		ebutton.click();
		
		explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[text()='Disable']")));
		
		WebElement dbutton = driver.findElement(By.xpath(".//button[text()='Disable']"));
		dbutton.click();
		
		System.out.println("Text on the Disable button:-" + dbutton.getText());
		Assert.assertEquals(dbutton.getText(), "Disable");
		
		
		if(inputfield.isEnabled())
		{
			System.out.println("Textbox is enabled");
		}
		else
		{
			System.out.println("Textbox is disabled");
		}
		inputfield.sendKeys("Hi this is bhavi");
		
		dbutton.click();
		
		explicitWait = new WebDriverWait(driver, 30);
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//button[text()='Enable']")));
		
		Assert.assertEquals(ebutton.getText(), "Enable");
		
		if(inputfield.isEnabled())
		{
			System.out.println("Textbox is enabled");
		}
		else
		{
			System.out.println("Textbox is disabled");
		}
		
		System.out.println("Textbox field info:-" + inputfield.getAttribute("value"));
		
		driver.quit();
		
	}
}

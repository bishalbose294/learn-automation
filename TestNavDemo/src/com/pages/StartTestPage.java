package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartTestPage {

	private String startButtonLocator = ".//button[@id='startTestBtn']";
	private By startButtonBy = By.xpath(startButtonLocator);
	private WebElement startButtonElement = null;
	
	private String checkboxLocator = ".//div[@id='termsModalCheck']//input[@id='term-check']";
	private By checkboxBy = By.xpath(checkboxLocator);
	private WebElement checkboxElement = null;
	
	private String continueButtonLocator = ".//div[@class='term-buttons']//button[@id='acceptTerms']";
	private By continueButtonBy = By.xpath(continueButtonLocator);
	private WebElement continueButtonElement = null;
	
	private String startSectionLocator = ".//button[@id='startSectionBtn']";
	private By startSectionBy = By.xpath(startSectionLocator);
	private WebElement startSectionElement = null;
	
	public void clickOnStartButton(WebDriver driver)
	{
		startButtonElement = driver.findElement(startButtonBy);
		startButtonElement.click();
	}
	
	public void clickOnTermsAndConditionsCheckBox(WebDriver driver)
	{
		checkboxElement = driver.findElement(checkboxBy);
		checkboxElement.click();
	}
	
	public void clickOnContinueButton(WebDriver driver) 
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		continueButtonElement = driver.findElement(continueButtonBy);
		continueButtonElement.click();
		
	}
	
	public void clickOnStartSectionButton(WebDriver driver)
	{
		startSectionElement = driver.findElement(startSectionBy);
		startSectionElement.click();
		WebDriverWait explicitWait = new WebDriverWait(driver,30);
		explicitWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(".//div[@id='loading']")));
	}
}

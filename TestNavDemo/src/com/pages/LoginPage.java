package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private String usernameLocator = ".//input[@id='email']";
	private By usernameBy = By.xpath(usernameLocator);
	private WebElement usernameElement = null;
	
	private String passwordLocator = ".//input[@id='password']";
	private By passwordBy = By.xpath(passwordLocator);
	private WebElement passwordElement = null;
	
	private String signinLocator = ".//button[@id='btnLogin']";
	private By signinBy = By.xpath(signinLocator);
	private WebElement signinElement = null;
	
	public void login(WebDriver driver, String uName, String pWord)
	{
		usernameElement = driver.findElement(usernameBy);
		passwordElement = driver.findElement(passwordBy);
		signinElement = driver.findElement(signinBy);
		
		usernameElement.sendKeys(uName);
		passwordElement.sendKeys(pWord);
		signinElement.click();
	}
}

package com.demo;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TheInternetTesting {
	
	@Test(enabled=false)
	public void aBTesting()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println("Title:- " +title);
			Thread.sleep(1000);
			WebElement firstelem = driver.findElement(By.xpath(".//a[@href='https://github.com/tourdedave/the-internet']/img"));
			firstelem.click();
			driver.navigate().back();
			Thread.sleep(1000);
			WebElement heading1 = driver.findElement(By.xpath(".//h1[@class='heading']"));
			System.out.println("Heading 1:- " +heading1.getText());
			
			WebElement firstlink = driver.findElement(By.linkText("A/B Testing"));
			firstlink.click();
			
			WebElement ABTestingHeading = driver.findElement(By.xpath(".//div[@id='content']//h3"));
			System.out.println("ABTestHeading:- " + ABTestingHeading.getText());
			
			WebElement content = driver.findElement(By.xpath(".//div[@id='content']//p"));
			System.out.println("Para content:- " + content.getText());
			
			driver.navigate().back();
			
			WebElement scrollelem = driver.findElement(By.linkText("Multiple Windows"));
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", scrollelem);
			
			scrollelem.click();
			
			String url = driver.getCurrentUrl();
			System.out.println("URL: " +url);
			if (url.equals("https://www.facebook.com"))
			{
				System.out.println("Correct URL");
			}
			else
				System.out.println("Incorrect URL");
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("E:\\Bhavi\\Selenium\\newwindow.png"));
			
			driver.navigate().back();
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(enabled=false)
	public void addRemoveElements()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
			
			WebDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			
			WebElement firstlink = driver.findElement(By.linkText("Add/Remove Elements"));
			firstlink.click();
			
			WebElement addbutton = driver.findElement(By.xpath(".//button[@onclick='addElement()']"));
			
			for(int i = 1; i<=5; i++)
			{
				addbutton.click();
			}
			
			List<WebElement> deletebuttons = driver.findElements(By.xpath(".//button[@onclick='deleteElement()']"));
			if(deletebuttons.size()==5)
			{
				System.out.println("Correct");
			}
			else 
			{
				System.out.println("Incorrect");
			}
				
			Thread.sleep(2000);   
			
			
			for(int i = 0; i<5; i++)
			{
				deletebuttons.get(i).click();
			}
			
			try {
				driver.findElement(By.xpath(".//button[@onclick='deleteElement()']"));
				System.out.println("Failed");
			} catch (Exception e) {
				System.out.println("Passed");
			}
			
			//this can also be used to find whether an element is present in the DOM or not, if element is not found then it returns 0 elements, hence the size of the list is 0
			System.out.println("Delete Button List Size : "+driver.findElements(By.xpath(".//button[@onclick='deleteElement()']")).size());
			
			Thread.sleep(2000);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void brokenImages()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://the-internet.herokuapp.com/");
			driver.manage().window().maximize();
			
			WebElement imglink = driver.findElement(By.linkText("Broken Images"));
			imglink.click();
			
			Thread.sleep(1000);
			
			List<WebElement> brokenimgs = driver.findElements(By.xpath(".//div[@class='example']//img"));
			
			for(int i = 0; i<brokenimgs.size(); i++)
			{
				if(brokenimgs.get(i).getAttribute("naturalWidth").equals("0"))
				{
					System.out.println("Image is broken");
				}
				else 
				{
					System.out.println("Image is not broken");
				}
				
			}
			Thread.sleep(1000);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void checkboxSelection()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement chkbox = driver.findElement(By.linkText("Checkboxes"));
		chkbox.click();
		
		List<WebElement> checkb = driver.findElements(By.xpath(".//form[@id='checkboxes']//input"));
		
		for (int i = 0; i<checkb.size(); i++)
		{
			if(checkb.get(i).isSelected())
			{
				System.out.println("Checkbox is selected");
			}
			else
			{
				System.out.println("Checkbox is not selected");
			}
			checkb.get(i).click();
		}
		
		for (int i = 0; i<checkb.size(); i++)
		{
			if(checkb.get(i).isSelected())
			{
				System.out.println("Checkbox is selected");
			}
			else
			{
				System.out.println("Checkbox is not selected");
			}
		}
		driver.quit();
	}

	@Test(enabled=false)
	public void dropDown()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement drpdown = driver.findElement(By.linkText("Dropdown"));
		drpdown.click();
		
		/*List<WebElement> alldropdowns = driver.findElements(By.xpath(".//div[@class='example']//select//option"));
		
		for(int i=0; i<alldropdowns.size(); i++)
		{
			System.out.println("Dropdown options:- " + alldropdowns.get(i).getText());
		}*/
		
		Select sel = new Select(driver.findElement(By.xpath(".//select[@id='dropdown']")));
		
		sel.selectByIndex(1);
		/*sel.selectByValue("1");
		sel.selectByVisibleText("Option 1");*/
		
		List<WebElement> options = sel.getOptions();
		for(int i=0; i<options.size(); i++)
		{
			System.out.println("Option " +(i+1)+ ":-" +options.get(i).getText());
		}
		
		//WebElement firstSelected = sel.getFirstSelectedOption();
		//List<WebElement> allOptions = sel.getOptions();
		//List<WebElement> allSelectedOptions = sel.getAllSelectedOptions();
		
	}
	
	
	
	@Test(enabled=false)
	public void contextMenu() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		WebElement cmenu = driver.findElement(By.xpath(".//a[text()='Context Menu']"));
		cmenu.click();
		
		Thread.sleep(1000);
		
		WebElement rclick = driver.findElement(By.id("hot-spot"));
		Actions builder = new Actions(driver);
		builder.contextClick(rclick).build().perform();
		
		Alert alertElement = driver.switchTo().alert();
		alertElement.accept();
		
		driver.quit();
	}
	
	@Test(enabled=false)
	public void basicAuth()
	{
			System.setProperty("webdriver.chrome.driver", "E:\\Bhavi\\Selenium\\Driver\\chromedriver_79.0.3945.36.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
	}

}

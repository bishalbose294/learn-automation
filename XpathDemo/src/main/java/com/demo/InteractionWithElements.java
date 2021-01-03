package com.demo;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InteractionWithElements {
	
	WebDriver driver=null;;
	
	@BeforeClass
	public void preLaunch() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:/Bhavi/Selenium/Driver/chromedriver_79.0.3945.36.exe");
		
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
		driver.get("https://www.toolsqa.com/");
		
		
		WebElement demosite = driver.findElement(By.partialLinkText("DEMO SITES"));
		demosite.click();
		
		Thread.sleep(1000);
		
		WebElement practiceform = driver.findElement(By.linkText("Automation Practice Form"));
		practiceform.click();
		
		Thread.sleep(1000);
	}
	
	@Test(enabled=false)
	public void interactionWithInputElements()
	{
		WebElement firstname = driver.findElement(By.xpath(".//input[@name='firstname']"));
		firstname.sendKeys("bhavi");
		
		WebElement lastname = driver.findElement(By.xpath(".//input[@id='lastname']"));
		lastname.sendKeys("munot");
	}
	
	@Test(enabled=false)
	public void interactionWithRadioElements() throws Exception
	{
		WebElement male = driver.findElement(By.xpath(".//input[@id='sex-0']"));
		male.click();
		Thread.sleep(1000);
		
		WebElement female = driver.findElement(By.xpath(".//input[@id='sex-1']"));
		female.click();
		Thread.sleep(1000);
		
		
		List<WebElement> experience = driver.findElements(By.xpath(".//input[contains(@id,'exp-')]"));
		
		for(WebElement temp : experience)
		{
			temp.click();
			Thread.sleep(1000);
		}
		
		for (int i=0; i<experience.size(); i++)
		{
			experience.get(i).click();
			Thread.sleep(1000);
		}
		
		int i=0;
		while(i<experience.size())
		{
			experience.get(i).click();
			Thread.sleep(1000);
			i++;
		}
		/*WebElement one = driver.findElement(By.xpath(".//input[@id='exp-0']"));
		one.click();
		
		WebElement two = driver.findElement(By.xpath(".//input[@id='exp-1']"));
		two.click();
		
		WebElement three = driver.findElement(By.xpath(".//input[@id='exp-2']"));
		three.click();
		
		WebElement four = driver.findElement(By.xpath(".//input[@id='exp-3']"));
		one.click();
		
		WebElement one = driver.findElement(By.xpath(".//input[@id='exp-0']"));
		one.click();*/
	}
	
	@Test(enabled=false)
	public void interactionWithCheckBoxElements() throws Exception
	{
        List<WebElement> experience = driver.findElements(By.xpath(".//input[@type='checkbox']"));
		
		for(WebElement temp : experience)
		{
			temp.click();
			Thread.sleep(1000);
		}
		
		for (int i=0; i<experience.size(); i++)
		{
			experience.get(i).click();
			Thread.sleep(1000);
		}
		
		int i=0;
		while(i<experience.size())
		{
			experience.get(i).click();
			Thread.sleep(1000);
			i++;
		}
	}
	
	@Test(enabled=false)
	public void interactionWithButtons()
	{
		try {
			List<WebElement> experience = driver.findElements(By.xpath(".//button[@name='submit']"));
			
			/*for(WebElement temp : experience) // StaleElementReferenceException as temp doesn't keep a track of the newly updated variable
			{
				Thread.sleep(1000);
				experience = driver.findElements(By.xpath(".//button[@name='submit']"));
				temp.click();
			}*/
			
			for (int i=0; i<experience.size(); i++)
			{
				Thread.sleep(1000);
				experience = driver.findElements(By.xpath(".//button[@name='submit']"));
				experience.get(i).click();
			}
			
			int i=0;
			while(i<experience.size())
			{
				experience = driver.findElements(By.xpath(".//button[@name='submit']"));
				experience.get(i).click();
				i++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(enabled=false)
	public void interactionWithDropdown()
	{
		try {
			List<WebElement> list= driver.findElements(By.xpath(".//select"));
			for(int i=0; i<list.size();i++)
			{
				Select continents = new Select(list.get(i));
				continents.selectByIndex(1);
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void interactionWithImages()
	{
		WebElement image = driver.findElement(By.xpath(".//img[@class='preload-me lazyloading']"));
		String alt = image.getAttribute("alt");
		String expected = "ToolsQA";
		
		Assert.assertEquals(alt.toLowerCase(), expected.toLowerCase());
	}
	
	@Test(enabled=false)
	public void interactionWithLabels()
	{
		WebElement label = driver.findElement(By.xpath(".//label[@id='NextedText']/span"));
		String text=label.getText();
		System.out.println("Label " +text);
	}
	
	@Test(enabled=false)
	public void interactionWithAlertsAndPopups()
	{
		try {
			WebElement windows = driver.findElement(By.linkText("Automation Practice Switch Windows"));
			windows.click();
			
			WebElement alert = driver.findElement(By.xpath(".//button[@id='alert']"));
			alert.click();

			Thread.sleep(2000);
			
			Alert alertElement = driver.switchTo().alert();
			
			//alertElement.accept(); //clicking ok
			//alertElement.dismiss(); // clicking cancel
			//alertElement.getText(); // to give the text inside
			
			String text = alertElement.getText();
			System.out.println("text " +text);
			
			alertElement.accept();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void interactionWithFrames()
	{
		try {
			WebElement framesLink = driver.findElement(By.linkText("IFrame practice page"));
			framesLink.click();
			
			Thread.sleep(2000);
			
			WebElement iframe = driver.findElement(By.xpath(".//iframe[@id='IF1' and @name='iframe1']"));
			
			System.out.println(iframe.getTagName());
			
			driver.switchTo().defaultContent();
			
		//	driver.switchTo().frame(0); //this switches the frame by its index number.
		//	driver.switchTo().frame("iframe1"); //this switches the frame by its name or id, we passed name here
		//	driver.switchTo().frame("IF1"); //this switches the frame by its name or id, we passed id here
			driver.switchTo().frame(iframe); //this switches the frame by its WebElement.
			
			System.out.println(driver.getTitle());
			
		//	new WebDriverWait(driver, 30).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframe));
			
			//Thread.sleep(2000);
			
			WebElement div = driver.findElement(By.xpath(".//div[@id='page']"));
			
			WebElement img = div.findElement(By.xpath("//a[@href='https://www.toolsqa.com/']/img"));
			
			//WebElement img = div.findElement(By.xpath("//img[@class='preload-me lazyloading']"));
			
			System.out.println(img.getAttribute("alt"));
			
			Thread.sleep(2000);
			
			driver.switchTo().defaultContent();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	@Test(enabled=false)
	public void interactionWithFileUpload()
	{
		try {
			Thread.sleep(1000);
			WebElement file = driver.findElement(By.xpath(".//input[@id='photo']"));
			file.sendKeys("E:\\Bhavi\\Selenium\\Queries.txt");
			System.out.println(file.getAttribute("value"));
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void interactionWithUnorderedOrderedList()
	{
		/*List<WebElement> ul = driver.findElements(By.xpath(".//ul[@id='menu-top']//li//a"));
		
		System.out.println(ul.size());
		for(int i=0; i<ul.size(); i++)
		{
			System.out.println(ul.get(i).getText());
		}
		
		
		WebElement ul_list = driver.findElement(By.xpath(".//ul[@id='menu-top']"));
		List<WebElement> anchors = ul_list.findElements(By.tagName("a"));
		
		anchors.forEach(anchor -> System.out.println(anchor.getText()));*/
		
		List<WebElement> unorderlist = driver.findElements(By.xpath(".//ul[@id='beverages']//li"));
		
		for(int i=0; i<unorderlist.size(); i++)
		{
			System.out.println(unorderlist.get(i).getText());
		}
	}
	
	@Test
	public void interactionWithTables()
	{
		WebElement practice = driver.findElement(By.linkText("Automation practice table"));
		practice.click();
		
		//Printing the whole table
		
		/*WebElement tables = driver.findElement(By.xpath(".//table[@class='tsc_table_s13']"));
		System.out.println(tables.getText());*/
		
		//printing the rows
		/*List<WebElement> rows = driver.findElements(By.xpath(".//table[@class='tsc_table_s13']//tr"));
		System.out.println(rows.size());
		for(int i=0; i<rows.size(); i++)
		{
			System.out.println(rows.get(i).getText());
		}
		
		System.out.println("\n\n");
		
		int i=0;
		while(i<rows.size())
		{
			System.out.println(rows.get(i).getText());
			i++;
		}
		
		System.out.println("\n\n");
		
		for (WebElement value : rows)
		{
			System.out.println(value.getText());
		}
		
		System.out.println("\n\n");
		
		rows.forEach(value -> System.out.println(value.getText()));*/
		
		
		List<WebElement> data = driver.findElements(By.xpath(".//table[@class='tsc_table_s13']//tr//td"));
		
		for(int i =0; i<data.size(); i++)
		{
			System.out.println(data.get(i).getText());
		}
		
		
		//print the values in side a table by rows and cols individually
		/*List<WebElement> rows = driver.findElements(By.xpath(".//table[@class='tsc_table_s13']//tr"));
		
		for(int i=0; i<rows.size(); i++)
		{
			 List<WebElement> cols = rows.get(i).findElements(By.xpath("td | th"));
			 //cols.forEach(col -> System.out.print(col.getText()+"\t"));
			 
			 for(int j=0; j<cols.size(); j++)
			 {
				 System.out.print(cols.get(j).getText() + "\t");
			 }
			 System.out.println();
		}*/
		
		/*List<WebElement> rows = driver.findElements(By.xpath(".//table[@class='tsc_table_s13']//tr"));
		
		for(int i=0; i<rows.size(); i++)
		{
			if(rows.get(i).getText().contains("Financial Center"))
			{
				List<WebElement> cols = rows.get(i).findElements(By.xpath("td"));
				System.out.println(cols.get(3).getText());
			}
		}*/
		
	}
	
	@AfterClass
	public void postLaunch() throws Exception
	{
		Thread.sleep(1000);
		driver.quit();
	}
}

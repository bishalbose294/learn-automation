package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Question2WriteData {

	@Test
	public void readExcelData()
	{
		try {
			
			System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://the-internet.herokuapp.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement formAuth = driver.findElement(By.linkText("Form Authentication"));
			formAuth.click();
			
			WebElement uname = driver.findElement(By.id("username"));
			uname.sendKeys("tomsmith");
			
			WebElement pword = driver.findElement(By.id("password"));
			pword.sendKeys("SuperSecretPassword!");
			
			WebElement loginButton = driver.findElement(By.xpath(".//button[@class='radius']"));
			loginButton.click();
			
			System.out.println(driver.getTitle());
			
			String xlsx_filepath = "C:\\Users\\P7110968\\eclipse-workspace\\TestProject\\loginData.xlsx";
		    File src = new File(xlsx_filepath);
		
		    FileInputStream fis = new FileInputStream(src);
			
				XSSFWorkbook workbook = new XSSFWorkbook(fis);
				XSSFSheet sheet = workbook.getSheetAt(0);
				
				for (int i = sheet.getFirstRowNum(); i<=sheet.getLastRowNum(); i++)
				{
					XSSFRow row = sheet.getRow(i);
					for(int j=row.getFirstCellNum(); j<row.getLastCellNum(); j++)
					{
						XSSFCell cell = row.getCell(j);
						System.out.print(cell+"\t");
					}
					System.out.println();
				}
				
				WebElement text = driver.findElement(By.xpath(".//div[@id='flash-messages']"));
				System.out.println(text.getText());
				if(text.getText().contains("Your username is invalid!"))
				{
					sheet.getRow(0).createCell(2).setCellValue("Invalid");
				}
				else {
					sheet.getRow(1).createCell(2).setCellValue("Valid");
				}
				
				FileOutputStream fos = new FileOutputStream(src);
				
				workbook.write(fos);
				workbook.close();
				fis.close();
				driver.quit();
			} 
			
			catch (Exception e) {
				e.printStackTrace();
			}
			} 	
	}


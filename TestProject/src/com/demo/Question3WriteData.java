package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Question3WriteData {
	
	@Test
	public void writeData()
	{
        try {
        	
        	int x, y, sum;
            Scanner sc = new Scanner(System.in); 
            System.out.println("Type first number:");
            x = sc.nextInt(); 

            System.out.println("Type second number:");
            y = sc.nextInt(); 
            
            sum = x + y;  
            System.out.println("Sum is: " + sum); 
        	//int a = 5;
			//int b = 4;
			//int sum = a+b;
        	
		    String xlsx_filepath = "C:\\Users\\P7110968\\eclipse-workspace\\TestProject\\writeData.xlsx";
		    File src = new File(xlsx_filepath);
		
			FileOutputStream fos = new FileOutputStream(src);
			
		        XSSFWorkbook workbook = new XSSFWorkbook();
				XSSFSheet sheet = workbook.createSheet("Data");
				
				XSSFRow row = sheet.createRow(0);
				
				XSSFCell cell = row.createCell(0);
	        		cell.setCellValue(sum);
	        	
	        		if(sum>=1)
					{
						XSSFCell cell1 = row.createCell(1);
						cell1.setCellValue("Positive");
					}
					else
					{
						XSSFCell cell1 = row.createCell(1);
						cell1.setCellValue("Negative");
					}
	        	
	        	workbook.write(fos);
	        	workbook.close();
	        	fos.close();
				} 
        catch (Exception e) {
    		
    		e.printStackTrace();
    	}
        
	}
	
	
        

	}
	


package com.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Question1ReadData {

	@Test
	public void readExcelData()
	{
		try {
		String xlsx_filepath = "C:\\Users\\P7110968\\eclipse-workspace\\TestProject\\demo_xlsx.xlsx";
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
				
				workbook.close();
				fis.close();
			} 
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
		} 
		}


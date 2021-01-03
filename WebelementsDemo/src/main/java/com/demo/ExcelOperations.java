package com.demo;

import static jxl.Workbook.getWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelOperations {
	
	@Test(enabled=false)
	//main disadvantage of jxl is that it can only read .xls file
	public void readExcelUsingJXL()
	{
		String xls_dataFilepath = "E:\\Bhavi\\Selenium\\demo_xls.xls";
		
		//You need to specify the path of the .xls file and create a path object out of it.
		File src=new File(xls_dataFilepath);
		 
		try {
			
		//Workbook is a class in Jexcel which will take file as an argument with the .xls fileloaded
		Workbook wb = getWorkbook(src);
		
		wb.getNumberOfSheets();
		Sheet[] sheet = wb.getSheets();
		String[] sheetName = wb.getSheetNames();
		
		// gives me the sheet of the workbooc specified with name or index
		Sheet sh1 = wb.getSheet(0);  
		//Sheet sh1 = wb.getSheet("Student_Data");	
		
		Cell[] columnValues = sh1.getColumn(0);
		Cell[] rowVlues = sh1.getRow(0);
		sh1.getColumns();
		sh1.getName();
		sh1.getRows();
		
		
		
		//sh1.getCell(); takes  column, row argument
		Cell c1 = sh1.getCell(1, 1);
		c1.getColumn();
		c1.getRow();
		c1.getType();
		
		String data1=c1.getContents();
		 
		//Print the data
		System.out.println(data1);
		 
		System.out.println("Sheet data is "+data1);
		 
		} 
		catch (Exception e)
		{            
		e.printStackTrace();
		}
	}
	
	@Test(enabled=true)
	public void readExcelFromApachePOI()
	{
		/*try {
			String xls_dataFilepath = "E:\\Bhavi\\Selenium\\demo_xls.xls";
			File src=new File(xls_dataFilepath);
			FileInputStream fis = new FileInputStream(src);
			HSSFWorkbook workbok = new HSSFWorkbook(fis);
			
			HSSFSheet sheet = workbok.getSheetAt(0);
			
			
			for(int i =sheet.getFirstRowNum(); i<=sheet.getLastRowNum(); i++)
			{
				HSSFRow row = sheet.getRow(i);
				
				for(int j=row.getFirstCellNum(); j<row.getLastCellNum(); j++)
				{
					HSSFCell cell = row.getCell(j);
					
					System.out.print(cell+"\t");
				}
				
				System.out.println();
			}
			
			
			workbok.close();
			fis.close();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try
		{
			String xls_dataFilepath = "E:\\Bhavi\\Selenium\\demo_xlsx.xlsx";
			File src=new File(xls_dataFilepath);
			FileInputStream fis = new FileInputStream(src);
			XSSFWorkbook workbok = new XSSFWorkbook(fis);
			
			XSSFSheet sheet = workbok.getSheetAt(0);
			
			
			for(int i =sheet.getFirstRowNum(); i<=sheet.getLastRowNum(); i++)
			{
				XSSFRow row = sheet.getRow(i);
				
				for(int j=row.getFirstCellNum(); j<row.getLastCellNum(); j++)
				{
					XSSFCell cell = row.getCell(j);
					
					System.out.print(cell+"\t");
				}
				
				System.out.println();
			}
			
			
			workbok.close();
			fis.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void writeExcelFromApachePOI()
	{
		/*try
		{
			String xls_dataFilepath = "E:\\Bhavi\\Selenium\\newExcel.xls";
			File src=new File(xls_dataFilepath);
			FileOutputStream fos = new FileOutputStream(src);
			HSSFWorkbook workbok = new HSSFWorkbook();
			
			HSSFSheet sheet = workbok.createSheet("Bhavi");
			
			HSSFRow row = sheet.createRow(0);
			
			HSSFCell cell = row.createCell(0);
			
			cell.setCellValue("Selenium Generated Cell");
			
			workbok.write(fos);
			
			workbok.close();
			fos.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}*/
		
		/*try
		{
			String xls_dataFilepath = "E:\\Bhavi\\Selenium\\newExcelx.xlsx";
			File src=new File(xls_dataFilepath);
			FileOutputStream fos = new FileOutputStream(src);
			XSSFWorkbook workbok = new XSSFWorkbook();
			
			XSSFSheet sheet = workbok.createSheet("Bhavi");
			
			XSSFRow row = sheet.createRow(0);
			
			XSSFCell cell = row.createCell(0);
			
			cell.setCellValue("Selenium Generated Cell");
			
			workbok.write(fos);
			
			workbok.close();
			fos.close();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}*/
		
		try
		{
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test(enabled=false)
	public void writeExcel()
	{
		try {
			String dataFilepath = "E:\\Bhavi\\Selenium\\newFile.xls";
			
			File src = new File (dataFilepath);
			
			FileOutputStream fos = new FileOutputStream(src);
			
			HSSFWorkbook workbook = new HSSFWorkbook();
			
			HSSFSheet sheet = workbook.createSheet("Numbers");
			
			for (int i = 0; i<20; i++)
			{
				HSSFRow row = sheet.createRow(i);
				
				HSSFCell cell0 = row.createCell(0);
				HSSFCell cell1 = row.createCell(1);
				
				cell0.setCellValue(i+1);
				cell1.setCellValue((i+1)*5);
				
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

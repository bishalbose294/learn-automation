package com.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	
		FileInputStream fis = new FileInputStream("practice.properties");
		
		Properties prop = new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("age"));
		System.out.println(prop.getProperty("dob"));
		System.out.println(prop.getProperty("place"));
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("practice.properties");
		prop.put("company", "apple");
		
		prop.setProperty("name", "bm");
		
		prop.store(fos, "This is a comment section");
		
		fos.flush();
		
		fos.close();

	}

}


//https://www.tutorialspoint.com/how-to-read-the-data-from-a-properties-file-in-java
package com.demo;


import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class Loggersdemo {

	private static final Logger LOGGER = Logger.getLogger("7");
	public static void main(String[] args) throws SecurityException, IOException
	{
		Handler filehandler = new FileHandler("./logging.log");
		SimpleFormatter simplaformatter = new SimpleFormatter();
		filehandler.setFormatter(simplaformatter);
		LOGGER.addHandler(filehandler);
		filehandler.setLevel(Level.ALL);
		LOGGER.setLevel(Level.ALL);
		LOGGER.info("Logger Name: "+LOGGER.getName());
		LOGGER.warning("Can cause ArrayIndexOutOfBoundsException");
		//An array of size 3
		int []a = {1,2,3};
		int index = 3;
		LOGGER.config("index is set to "+index);
		try{
		System.out.println(a[index]);
		LOGGER.info("print the element");
		}catch(ArrayIndexOutOfBoundsException ex){
		LOGGER.log(Level.SEVERE, "Exception occur", ex);
		}
	}
}

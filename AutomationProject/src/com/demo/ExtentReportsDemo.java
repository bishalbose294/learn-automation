package com.demo;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsDemo {

	@Test
	public void loginTest() throws IOException
	{
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/report1.html"); 
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		ExtentTest extentTest = extent.createTest("LoginTest");
		extentTest.log(Status.INFO, "Login to Amazon");
		extentTest.log(Status.PASS, "Title Verified");
		extent.flush();
		
		ExtentTest extentTest2 = extent.createTest("LogoutTest");
		extentTest2.log(Status.FAIL, "Title Verified");
		extentTest2.fail("Failed", MediaEntityBuilder.createScreenCaptureFromPath("‪C:\\Users\\P7110968\\Desktop\\TNAV-30705-FF-Test.png").build());
		extentTest2.pass("Passed", MediaEntityBuilder.createScreenCaptureFromPath("‪C:\\Users\\P7110968\\Desktop\\TNAV-30705-FF-Test.png").build());
		
		extent.flush();

	}

}

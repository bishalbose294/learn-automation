package com.demo.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenersDemo implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Inside testNG Listener Demo onTestStart method");
		System.out.println(result.getEndMillis());
		System.out.println(result.getInstance());
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		System.out.println(result.getTestName());
		System.out.println(result.isSuccess());
		System.out.println(result.getHost());
		System.out.println(result.getStartMillis());
		System.out.println(result.getAttributeNames());
		System.out.println("Time: " +(result.getStartMillis()-result.getEndMillis()));
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Inside testNG Listener Demo onTestSuccess method");
		System.out.println(result.getEndMillis());
		System.out.println(result.getInstance());
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		System.out.println(result.getTestName());
		System.out.println(result.isSuccess());
		System.out.println(result.getHost());
		System.out.println(result.getStartMillis());
		System.out.println(result.getAttributeNames());
		System.out.println("Time: " +(result.getStartMillis()-result.getEndMillis()));
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Inside testNG Listener Demo onTestFailure method");
		System.out.println(result.getEndMillis());
		System.out.println(result.getInstance());
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		System.out.println(result.getTestName());
		System.out.println(result.isSuccess());
		System.out.println(result.getHost());
		System.out.println(result.getStartMillis());
		System.out.println(result.getAttributeNames());
		System.out.println("Time: " +(result.getStartMillis()-result.getEndMillis()));
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Inside testNG Listener Demo onTestSkipped method");
		System.out.println(result.getEndMillis());
		System.out.println(result.getInstance());
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		System.out.println(result.getTestName());
		System.out.println(result.isSuccess());
		System.out.println(result.getHost());
		System.out.println(result.getStartMillis());
		System.out.println(result.getAttributeNames());
		System.out.println("Time: " +(result.getStartMillis()-result.getEndMillis()));
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Inside testNG Listener Demo onTestFailedButWithinSuccessPercentage method");
		System.out.println(result.getEndMillis());
		System.out.println(result.getInstance());
		System.out.println(result.getInstanceName());
		System.out.println(result.getName());
		System.out.println(result.getStatus());
		System.out.println(result.getTestName());
		System.out.println(result.isSuccess());
		System.out.println(result.getHost());
		System.out.println(result.getStartMillis());
		System.out.println(result.getAttributeNames());
		System.out.println("Time: " +(result.getStartMillis()-result.getEndMillis()));
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Inside testNG Listener Demo onStart method");
		System.out.println(context.getHost());
		System.out.println(context.getName());
		System.out.println(context.getOutputDirectory());
		System.out.println(context.getAllTestMethods());
		System.out.println(context.getAttributeNames());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Inside testNG Listener Demo onFinish method");
		System.out.println(context.getHost());
		System.out.println(context.getName());
		System.out.println(context.getOutputDirectory());
		System.out.println(context.getAllTestMethods());
		System.out.println(context.getAttributeNames());
		
	}

}

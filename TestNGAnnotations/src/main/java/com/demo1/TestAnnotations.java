package com.demo1;
import org.testng.annotations.Test;

public class TestAnnotations extends AllAnnotations{

	@Test
	public void Test1()
	{
		System.out.println("This is Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("This is Test2");
	}
}

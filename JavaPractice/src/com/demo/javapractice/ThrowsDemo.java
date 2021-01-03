package com.demo.javapractice;

class DemoClass{
	public static void display() throws BhaviniException
	{
		System.out.println("This is a throws display method");
		throw new BhaviniException("This is throws exception");
	}
	
}

public class ThrowsDemo {

	public static void main(String[] args) {
		try {
		DemoClass.display();
		}
		catch(BhaviniException e)
		{
			e.printStackTrace();
		}

	}

}

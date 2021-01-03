package com.oops;

// Method Overloading

class Addition
{
	public void add(int num1, int num2)
	{
		int total = num1+num2;
		System.out.println("Addition of 2 int numbers = "+total);
	}
	
	public void add(double num1, double num2)
	{
		double total = num1+num2;
		System.out.println("Addition of 2 double numbers = "+total);
	}
	
	public void add(int num1, int num2, int num3)
	{
		int total = num1+num2+num3;
		System.out.println("Addition of 3 numbers = "+total);
	}
	
	public void add(int num1, int num2, double num3)
	{
		double total = num1+num2+num3;
		System.out.println("Addition of 3 double numbers = "+total);
	}
	
	public void add(int num1, int num2, int num3, int num4)
	{
		int total = num1+num2+num3+num4;
		System.out.println("Addition of 3 numbers = "+total);
	}
	
}

/*class Subtraction
{
	public int sub(int num1, int num2)
	{
		int total = num1 - num2;
		return total;
	}
	
	
	public double sub(int num1, int num2)
	{
		int total = num1 - num2;
		return total;
	}
}*/

public class JavaDemo2 {

	public static void main(String[] args) {
		Addition m1 = new Addition();
		
		//m1.add(10.0, 20.0);
		
		//m1.add(10, 20, 30);
		
		//Subtraction sub = new Subtraction();
		//System.out.println("Subtraction : "+sub.sub(20, 10));
	}

}

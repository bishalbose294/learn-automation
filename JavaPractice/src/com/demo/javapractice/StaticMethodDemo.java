package com.demo.javapractice;

public class StaticMethodDemo {
	
	static double squareroot(double x)
	{
		return Math.sqrt(x);
	}

	public static void main(String[] args) {
		double result = StaticMethodDemo.squareroot(64);
		System.out.println(result);

	}

}

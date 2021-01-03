package com.demo.competitiveprogramming;

public class SwapTwoVariablesWithoutUsingThird {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 6;
		System.out.print(a);
		System.out.print(b);
		a = a+b;
		b = a-b;
		a = a-b;
System.out.println();
		System.out.print(a);
		System.out.print(b);
	}

}

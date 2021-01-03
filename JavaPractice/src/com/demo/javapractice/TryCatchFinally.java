package com.demo.javapractice;


public class TryCatchFinally {

	public static void main(String[] args) {
		System.out.println("Main Started");
		try
		{
			System.out.println("Sentence before Exception");
			int a = 1/0;
			int arr[] = {1,2,3,4,5};
			System.out.println(arr[5]);
			String abc = null;
			System.out.println(abc.length());
			System.out.println("Sentence after Exception");
		}
		catch(ArithmeticException ex) 
		{
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println("Inside ArithmeticException Catch");
		}
		catch (ArrayIndexOutOfBoundsException ex) { 
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println("Inside ArrayIndexOutOfBoundsException Exception Catch");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			System.out.println("Inside Exception Catch");
		}
		finally 
		{
			System.out.println("Inside Finally");
		}
		
		System.out.println("Main Ended");
	}

}

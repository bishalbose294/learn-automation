package com.demo.competitiveprogramming;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		

		int arr[] = {-100,-50000,-10,-250};
		
		int largest = arr[0];
		int secondlargest = 0;
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0; i<arr.length; i++)
		{
		   if(arr[i]>largest)
		     {
			   secondlargest = largest;
			   largest = arr[i];
	         }
		   else if(arr[i]>secondlargest)
		   {
			   secondlargest = arr[i];
		   }
		}
		System.out.println("Largest" +largest);
		System.out.println("Second Largest" +secondlargest);
		
	}

}

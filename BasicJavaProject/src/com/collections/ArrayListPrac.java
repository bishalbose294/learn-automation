package com.collections;

import java.util.ArrayList;

public class ArrayListPrac {

	/*
	 * Store 500 numbers in an array list
	 * for the 1st 100 you have to print odd numbers
	 * for the 2nd hundred you have to print even numbers
	 * for the 3rd hundred you have to print multiples of 3
	 * for the 4th hundred you have to print multiple of 5
	 * for the last hundred you have to print multiple of 10
	 * you have to do all this in a single for loop
	 */
	
	/*
	 * Taxable income		:		Tax Payable $
		0 - 6000			:		nil
		6001 - 21600		:		15% of excess over 6000
		21601 - 63000		:		30% of excess over 21600
		63001 - 95000		:		42% of excess over 63000
		95000 +				:		47% of excess over 95000
		
	Eg:
	1.	40000 Income
		6000 - nil
		21600 - 15%
		12400 - 30%
	2.	100000 Income
		6000 - nil
		21600 - 15%
		63000 - 30%
		9500 - 42%
	 */
	public static void main(String[] args) {
		ArrayList <Integer> arrayList = new ArrayList<Integer>();
		
		
		for(int i=1; i<=500;i++)
		{
			
			arrayList.add(i);
			
		}
		
		System.out.println("Size: "+arrayList.size());
		/*for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}*/
		
		/*int number=0;
		for (int i=0; i<=arrayList.size(); i++)
			{
			number=arrayList.get(i);
			if (number>=0 && number<100 && number%2==1)
			{
				System.out.println("Odd numbers " +number);
			}
			else if(number>=100 && number<200 && number%2==0)
			{
				System.out.println("Even numbers " +number);
			}
			else if (number>=200 && number<300 && number%3==0)
			{
				System.out.println("Multiples of 3 " +number);
			}
			else if (number>=300 && number<400 && number%5==0)
			{
				System.out.println("Multiples of 5 " +number);
			}
			else if (number>=400 && number<500 && i%10==0)
			{
				System.out.println("Multiples of 10 " +number);
			}
		}*/
		
		for (int number : arrayList)
		{
		    if (number>=0 && number<100 && number%2==1)
		    {
			    System.out.println("Odd numbers " +number);
		    }
		    else if(number>=100 && number<200 && number%2==0)
		    {
			    System.out.println("Even numbers " +number);
		    }
		    else if (number>=200 && number<300 && number%3==0)
		    {
			    System.out.println("Multiples of 3 " +number);
		    }
		    else if (number>=300 && number<400 && number%5==0)
		    {
			    System.out.println("Multiples of 5 " +number);
		    }
		    else if (number>=400 && number<=500 && number%10==0)
		    {
			    System.out.println("Multiples of 10 " +number);
		    }
	}

	}

}

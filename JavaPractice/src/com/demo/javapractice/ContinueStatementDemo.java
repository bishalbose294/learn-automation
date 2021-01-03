package com.demo.javapractice;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		/*
		 * for(int i=1; i<=10; i++) { if(i==5) { continue; }
		 * System.out.println("Numbers: " +i); }
		 */

		/*
		 * int i=1; while(i<=10) { if(i==5) { continue; } System.out.println(i); i++; }
		 */

		/*
		 * for(int i=1; i<=5; i++) { for(int j=1; j<=10; j++) { if(j==5) { continue; }
		 * System.out.println("Numbers: " +i +"-"+ +j); } }
		 */

		int i = 1;
		
		while (i <= 5) 
		{
			int j = 1;
			while (j <= 10) 
			{
				if (j == 5) 
				{
					j++;
					continue;
				}
				System.out.println(i + "-" + j);
				j++;
			}
			i++;
		}
	}

}

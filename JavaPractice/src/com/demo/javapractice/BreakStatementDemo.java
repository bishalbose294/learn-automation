package com.demo.javapractice;

public class BreakStatementDemo {

	public static void main(String[] args) {
		
		/*for(int i=0; i<=10; i++)
		{
			if(i==9)
			{
				break;
			}
			System.out.println("Number is " +i);
		}*/
		
		/*int i=1;
		while(i<=10)
		{
			if(i==9)
			{
				break;
			}
			System.out.println(i);
			i++;
		}*/
		
		for(int i=0; i<=5; i++)
		{
			boolean flag=false;
			for(int j=0; j<=10; j++)
			{
				if(j==5 && i==2)
				{
					
					flag=true;
					break;
				}
				System.out.println(i+ "-" +j);
			}
			if(flag)
			{
				break;
			}
		}
		
		/*int i=1;
		while(i<=5)
		{
			int j=1;
			while(j<=10)
			{
				if(j==5)
				{
					break;
				}
				System.out.println(i+ "-" +j);
				j++;
			}
			i++;
		}*/

	}

}

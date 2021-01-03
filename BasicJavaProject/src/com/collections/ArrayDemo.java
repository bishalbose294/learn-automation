package com.collections;

public class ArrayDemo {

	public static void main(String[] args) {
		
		// primitive datatype || userdefined datatype
		
		int a = 5;
		int b = 10;
		int c = 15;
		int d = 20;
		int e = 25;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		
		
		int array[] = {5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100,105};
		
		System.out.println("Array Length : "+array.length);
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		
		System.out.println(array[5]); // exception
		
		for(int i=1; i<array.length;) //pint only numbers with 0 at the end using indexing
		{
			System.out.println(array[i]);
			i=i+2;
		}
		
		int randomArray[] = {50,10,100,21,254,300,355,407,458,501,505,610,615,7770,750,8401,845,940,975,7100,111050};
		
		for(int i=0;i<=randomArray.length-1;i++)
		{
			if((randomArray[i]%10)==0)
			{
				System.out.println(randomArray[i]);
			}
		}
		
		int j=0;
		while(j<randomArray.length)
		{
			if((randomArray[j]%10)==0)
			{
				System.out.println(randomArray[j]);
			}
			j++;
		}
	}
}

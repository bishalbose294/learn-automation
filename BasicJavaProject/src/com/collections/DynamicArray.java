package com.collections;

public class DynamicArray {

	public static void main(String[] args) {
		
		//int array[] = {};
		//array[0]=1;// after initializing array once, no more values can be further added
		//System.out.println(array[0]);
		
		int array2[] = new int[5]; //it is same  as array2[] = {0,0,0,0,0}
		
		for(int i=0;i<array2.length;i++)
		{
			//array2[i]=i+1;
			array2[i]=3*(i+1);
		}
		/*1 x 3 = 3
		2 x 3 = 6*/		
		
		int i=0;
		while(i<array2.length)
		{
			System.out.println((i+1)+" x 3 = " +array2[i]);
			i++;
		}
	}
}

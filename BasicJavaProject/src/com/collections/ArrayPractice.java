package com.collections;

public class ArrayPractice {

	public static void main(String[] args) {
		int array[] = new int [100];
		
		for(int i=0; i<array.length;i++)
		{
			array[i] = i+1;
		}

		int i=0;
		while(i<array.length)
		{
			if(array[i]%2==1)
			{
				System.out.println(array[i]);
			}
			i++;
		}
	}

}

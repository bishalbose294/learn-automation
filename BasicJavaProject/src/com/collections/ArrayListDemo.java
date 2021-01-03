package com.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("I");
		arrayList.add("am");
		arrayList.add("a");
		arrayList.add("free");
		arrayList.add("bird.");
		arrayList.add("I");
		arrayList.add("fly");
		arrayList.add("freely");
		arrayList.add("in");
		arrayList.add("sky");
		
		
		arrayList.add(9, "the");
		
		System.out.println("Size: "+arrayList.size());
		
		/*for(String value : arrayList)
		{
			System.out.println(value);
		}*/
		
		/*int i=0;
		while(i<arrayList.size())
		{
			System.out.println(arrayList.get(i));
			i++;
		}*/
	
		/*for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
		}*/
		
		for(String value : arrayList)
		{
			if(value.length()<=3 )
			{
				System.out.println(value);
			}
				
		}
		
		//System.out.println(arrayList.get(3));
	}

}

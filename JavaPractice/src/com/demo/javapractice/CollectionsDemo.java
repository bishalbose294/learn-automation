package com.demo.javapractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;




public class CollectionsDemo {

	//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
	
	public static void main(String[] args) {
		
		//Interface				//Implements List Interface
		List<String> list = new ArrayList<String>();
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("Bhavini");
		arrayList.add("Sandhya");
		arrayList.add("Neha");
		arrayList.add("Bhavini");
		arrayList.add("Komal");
		arrayList.add("Bhavini");
		arrayList.add("Kinnari");
		arrayList.add("Saily");
		arrayList.add("Krutika");
		arrayList.add("Bhavini");
		arrayList.add("Sujay");
		arrayList.add("Suyog");
		arrayList.add("Bhavini");
		arrayList.add("Swapnil");
		arrayList.add("Roshan");
		arrayList.add("Bhavini");
		arrayList.add("Shivani");
		arrayList.add("Bishal");
		
		Iterator<String> it = arrayList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(arrayList.contains("Bhavini"));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		arrayList.add(2, "Kaustubh");
		
		
		it = arrayList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		arrayList.ensureCapacity(5);
		
		System.out.println(arrayList.equals(new ArrayList<String>()));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(arrayList.get(arrayList.size()-1));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(arrayList.indexOf("Bishal"));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(arrayList.isEmpty());
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(arrayList.remove("Kaustubh"));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(arrayList.remove(arrayList.indexOf("Bishal")));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(arrayList.indexOf("Bhavini"));
		System.out.println(arrayList.lastIndexOf("Bhavini"));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		it = arrayList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println();
		System.out.println();
		arrayList.set(arrayList.size()-1, "Kadri");
		
		it = arrayList.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		arrayList.clear();
		
		System.out.println(arrayList.isEmpty());
		
		System.out.println("--------------------------------------------------------------------------------");
	}
	
	//https://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html
	/*
	public static void main(String[] args)
	{
		//Interface			//Implements List Interface
		Set<Integer> setInt = new HashSet<Integer>();
		HashSet<Integer> hashSetInt = new HashSet<Integer>();
		
		hashSetInt.add(10);
		hashSetInt.add(20);
		hashSetInt.add(30);
		hashSetInt.add(40);
		hashSetInt.add(50);
		hashSetInt.add(60);
		hashSetInt.add(70);
		hashSetInt.add(80);
		hashSetInt.add(90);
		hashSetInt.add(100);
		
		Iterator<Integer> it = hashSetInt.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("--------------------------------------------------------------------------------");
		
		hashSetInt.add(110);
		
        it = hashSetInt.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashSetInt.contains(50));
		System.out.println(hashSetInt.contains(new Integer("10")));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashSetInt.isEmpty());
		
		System.out.println("--------------------------------------------------------------------------------");
		
		//does not have remove via index because unordered lists i.e. set doesn't have index for values
		System.out.println(hashSetInt.remove(60));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashSetInt.size());
		
		System.out.println("--------------------------------------------------------------------------------");
		
		hashSetInt.clear();
		
		System.out.println(hashSetInt.isEmpty());
		
	}*/
	
	//public static void main(String[] args)
	//{
		//Interface						//Implements List Interface
		/*Map<Integer, String> mapIntStr = new HashMap<Integer, String>();
		HashMap<Integer, String> hashmapIntStr = new HashMap<Integer, String>();
		
		hashmapIntStr.put(0,"Bhavini");
		hashmapIntStr.put(1,"Sandhya");
		hashmapIntStr.put(2,"Neha");
		hashmapIntStr.put(3,"Bhavini");
		hashmapIntStr.put(4,"Komal");
		hashmapIntStr.put(5,"Bhavini");
		hashmapIntStr.put(6,"Kinnari");
		hashmapIntStr.put(7,"Saily");
		hashmapIntStr.put(8,"Krutika");
		hashmapIntStr.put(9,"Bhavini");
		hashmapIntStr.put(10,"Sujay");
		hashmapIntStr.put(11,"Suyog");
		hashmapIntStr.put(12,"Bhavini");
		hashmapIntStr.put(13,"Swapnil");
		hashmapIntStr.put(14,"Roshan");
		hashmapIntStr.put(15,"Bhavini");
		hashmapIntStr.put(16,"Shivani");
		hashmapIntStr.put(17,"Bishal");
		
		
		for(Map.Entry<Integer, String> entry : hashmapIntStr.entrySet())
		{
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		for(Integer index : hashmapIntStr.keySet())
		{
			System.out.println(index+"-"+hashmapIntStr.get(index));
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		for(String values : hashmapIntStr.values())
		{
			System.out.println(values);
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashmapIntStr.containsKey(5));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashmapIntStr.containsValue("Bhavini"));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashmapIntStr.get(8));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashmapIntStr.remove(2));
		
		System.out.println("--------------------------------------------------------------------------------");
		
		System.out.println(hashmapIntStr.isEmpty());
		
		System.out.println("--------------------------------------------------------------------------------");
		
		hashmapIntStr.clear();
		
        System.out.println(hashmapIntStr.isEmpty());
		
		System.out.println("--------------------------------------------------------------------------------");
		
	}*/
	
}

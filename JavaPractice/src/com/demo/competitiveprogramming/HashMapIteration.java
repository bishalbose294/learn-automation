package com.demo.competitiveprogramming;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {

	public static void main(String[] args) {
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		hmap.put("Bhavini", 1);
		hmap.put("Bishal", 5);
		hmap.put("Megha", 3);
		Iterator<Map.Entry<String, Integer>> itr = hmap.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> entry = itr.next();
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
		}
		System.out.println();
		for(Map.Entry<String, Integer> entry:hmap.entrySet())
		{
			System.out.print(entry.getKey());
			System.out.print(entry.getValue());
		}

	}

}

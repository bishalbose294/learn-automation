package com.demo.competitiveprogramming;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList alist = new ArrayList();
		alist.add("5");
		alist.add("10");
		alist.add("15");
		Iterator itr = alist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		for(Object obj:alist)
		{
			System.out.println(obj);
		}
		
		for(int i=0; i<alist.size(); i++)
		{
			System.out.println(alist.get(i));
		}
		

	}

}

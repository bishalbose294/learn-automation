package com.demo.competitiveprogramming;

import java.util.HashMap;

public class CountNumberOfWordsUsingHashMap {

	public static void main(String[] args) {
		String str = "This this is is is a a good phone phone phone phone";
		HashMap<String, Integer> wordCount = new HashMap<String, Integer>();
		String[] str2 = str.split(" ");
		for (String word:str2)
		{
			if(wordCount.containsKey(word))
			{
				int count = wordCount.get(word);
				wordCount.put(word, count+1);
			}
			else
			{
				wordCount.put(word, 1);
			}
			
		}
		System.out.println(wordCount);

	}

}

package com.demo.competitiveprogramming;

public class Palindrome {

	/*public static void main(String[] args) {
		String str = "dad";
		String str2 = "";
		StringBuilder sbuilder = new StringBuilder();
		sbuilder = sbuilder.append(str);
		sbuilder = sbuilder.reverse();
		str2 = sbuilder.toString();
		if(str.equals(str2))
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");}

	}*/
	
	public static void main(String[] args) {
		String str = "dad";
		String save = "";
		
		char[] str2 = str.toCharArray();
		for(int i=str2.length-1; i>=0; i--)
		{
			save += str.charAt(i); 
		}
		System.out.println();
		if(str.equals(save))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
	}
	
	

}

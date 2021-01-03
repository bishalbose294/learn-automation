package com.demo.competitiveprogramming;

/*Q #1) Write a Java Program to reverse a string without using String inbuilt function.

Answer: Here, we are initializing a string variable str and making use of the string builder class.

The object of the string builder class str2 will be further used to append the value stored in the string variable str.
Thereafter, we are using the inbuilt function of the string builder (reverse()) and storing the new reversed string in str2. Finally, we are printing str2.

Following program code explains this:*/

public class ReverseStringWithoutUsingStringMethods {

	public static void main(String[] args) {
		
		String str="bhavini";
		StringBuilder str2 = new StringBuilder(); //We use StringBuilder Class because we want to use reverse()
		str2.append(str); // append() appends the string we pass to the object of StringBuilder class
		str2 = str2.reverse(); //reverse is a function of StringBuilder Class
		System.out.println("Reverse: " +str2);

	}

}

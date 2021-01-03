package com.demo.package3;

import com.demo.package1.ClassA;

public class ClassC extends ClassA{
	
	public void displayC()
	{
		System.out.println(protectedeVariable);
		System.out.println(publicVariable);
	}

	public static void main(String[] args) {
		ClassC c = new ClassC();
		c.protectedDisplay();
		c.publicDisplay();
		c.displayC();
		
	}

}

package com.ifloop;

public class Nested_ifLoop {
	/*
	 * Less than 40 to Fail 
	 * in between 40-49 to C 
	 * in between 50-59 to B 
	 * between 60-69 to A 
	 * between 70-79 to A+ 
	 * between 80-89 to S 
	 * between 90-99 to O 
	 * if 100 to O+
	 */
	public static void main(String args[]) {
		int num = 101;

		if (num < 40)
			System.out.println("Fail");
		else if (num >= 40 && num < 50)
			System.out.println("C");
		else if (num >= 50 && num < 60)
			System.out.println("B");
		else if (num >= 60 && num < 70)
			System.out.println("A");
		else if (num >= 70 && num < 80)
			System.out.println("A+");
		else if (num >= 80 && num < 90)
			System.out.println("S");
		else if (num >= 90 && num <= 99)
			System.out.println("O");
		else if (num == 100)
			System.out.println("O+");
		else
			System.out.println("Error");

	}

}

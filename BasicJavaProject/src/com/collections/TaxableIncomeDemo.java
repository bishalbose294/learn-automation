package com.collections;

public class TaxableIncomeDemo {

	/*public static void main(String args[]) {
		
		int income = 40000;
		double tax = 0;
		
		if (income <= 6000) 
		{
			tax = 0;
		} 
		else if (income <= 21600) 
		{
			tax = 0 + (income - 6000) * 0.15;
		} 
		else if (income <= 63000) 
		{
			tax = 0 + (21600 - 6000) * 0.15 + (income - 21600) * 0.3;
		} 
		else if (income <= 95000) 
		{
			tax = 0 + (21600 - 6000) * 0.15 + (63000 - 21600) * 0.3 + (income - 63000) * 0.42;
		} 
		else 
		{
			tax = 0 + (21600 - 6000) * 0.15 + (63000 - 21600) * 0.3 + (95000 - 63000) * 0.42 + (income - 95000) * 0.47;
		}

		System.out.println(tax);
	}*/
	
	/*public static void main(String args[])
	{
		double[] max = {0,6000,21600,63000,95000};
		double[] rate = {0,0.15,0.30,0.42,0.47};
		double left = 40000;
		double tax = 0.0d;
		for(int i = 1; i <= max.length && left > 0; i++) {
		    double df = (i==max.length) ? left : Math.min(max[i]-max[i-1],left);
		    tax += rate[i-1]*df;
		    //System.out.println(df+" - "+(rate[i-1]*df));
		    left -= df;
		}
		System.out.println("Tax : "+tax);
	}*/

}

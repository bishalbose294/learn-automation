package com.collections;


/*
 * Taxable income		:		Tax Payable $
	0 - 6000			:		nil
	6001 - 21600		:		15% of excess over 6000
	21601 - 63000		:		30% of excess over 21600
	63001 - 95000		:		42% of excess over 63000
	95000 +				:		47% of excess over 95000
	
Eg:
1.	40000 Income
	6000 - nil
	21600 - 15%
	12400 - 30%
2.	100000 Income
	6000 - nil
	21600 - 15%
	63000 - 30%
	9500 - 42%
 */

public class TaxableIncomeProgram {

	public static void main(String[] args) {
		
		int income=100000;
		int newincome=0;
		//int newincome1=0;
		double n, n1, n2, n3, number1;
		
		if (income>=0 && income<6000)
		        {
		           n = 0*6000;
		          // newincome=income-6000;
			       System.out.println("Tax payable: " + n);
			    }
		    
		     else if (income>6000 && income<=21600)
	            {
			       newincome=income-6000; 
		           n1 = (0.15)*newincome; 
		           System.out.println("Tax payable: " + n1);
		        }
		   
		     else if (income>21600 && income<63000)
                {
		    	 n1 = (0.15)*(21600 - 6000);
	             n2 = (0.30)*(income - 21600); 
	             number1= n1+n2;
	             System.out.println("Tax payable: " + number1);
	            }
		
		     else if (income>63001 && income<95000)
		     {
		    	 newincome=income-6000;
		    	 //n1 = (0.15)*(15600);
		    	 //n2 = (0.30)*41400;
		    	 n3 = (0.42)*32000; // 37000 - (95000-63000) = 32000
		    	 //number = n1+n2+n3;
		    	 System.out.println("Tax payable: " + n3);
		     }
		
		     else
		     {
		    	 //n4 = 
		     }
		
		
		    }
		}
	


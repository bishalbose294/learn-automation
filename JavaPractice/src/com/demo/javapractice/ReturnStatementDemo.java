package com.demo.javapractice;

public class ReturnStatementDemo {
	
	/*public int sum(int x, int y)
	{
		return x+y;
	}*/

	public static void main(String[] args) {
		
		/*ReturnStatementDemo rs = new ReturnStatementDemo();
		System.out.println(rs.sum(5, 6));*/
		
		display(4,2);

	}
	
	public static void display(int a,int b)
	{
		if(a%b == 0)
		{
			System.out.println("Factors");
			return;
		}
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
	}
	

}

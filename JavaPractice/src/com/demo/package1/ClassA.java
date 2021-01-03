package com.demo.package1;

public class ClassA {
	
	private int privateVariable = 10;
	protected int protectedeVariable = 20;
	int defaultVariable = 30;
	public int publicVariable = 40;

	private void privateDisplay()
	{
		System.out.println("This is in Private Method");
	}
	
	protected void protectedDisplay()
	{
		System.out.println("This is in Protected Method");
	}
	
	void defaultDisplay()
	{
		System.out.println("This is in Default Method");
	}
	
	public void publicDisplay()
	{
		System.out.println("This is in Public Method");
	}
	
	public static void main(String[] args) 
	{
		ClassA classa = new ClassA();
		System.out.println(classa.privateVariable);
		classa.privateDisplay();
	}

}

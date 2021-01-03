package com.demo.javapractice;

class Parent
{
	int prop1=10;
	int prop2=20;
	
	public Parent() {
		System.out.println("In Parent default Constructor");
	}
	
	public Parent(int prop1, int prop2, boolean flag)
	{
		System.out.println("Start with PC of Parent");
		this.prop1 = prop1;
		this.prop2 = prop2;
		System.out.println("Inside parameterized constructor of parent");
	}
	
	void method1()
	{
		System.out.println("Parent Method 1");
	}
	
	void method2()
	{
		System.out.println("Parent Method 2");
	}
}

class Child extends Parent
{
	int prop1=30;
	int prop3=40;
	
	public Child() {
		super();//this is by default called even if we dont write
		//super();
		System.out.println("In Child default Constructor");
	}
	
	public Child(int prop1Child, int prop1Parent, int prop2, int prop3) {
		
		/*prop1 = prop1Child; // child even if name is same for both parent and child, it is by default considers this object, if we want parent object use super.
		super.prop1 = prop1Parent;
		super.prop2 = prop2; // this.prop2 and super.prop2 are the same as child extends prop2 from Parent and there is only 1 instance of prop2
		this.prop3 = prop3;*/
		
		super(prop1Parent,prop2,true);
		System.out.println("Start with PC of Child");
		prop1 = prop1Child;
		this.prop3 = prop3;
		System.out.println("Inside parameterized constructor of child");
	}
	
	void method1()
	{
		System.out.println("Child Method 1");
	}
	
	void method3()
	{
		System.out.println("Child Method 3");
	}
	
	void display()
	{
		System.out.println(super.prop1);
		System.out.println(super.prop2);
		System.out.println(this.prop1);
		System.out.println(this.prop2);
		System.out.println(this.prop3);
		
		super.method1();
		super.method2();
		this.method1();
		this.method2();
		this.method3();
		
		
	}
}

public class SuperKeywordDemo {

	public static void main(String[] args) {
		
		Child cc = new Child(10,20,30,40);
		//cc.display();
	}

}

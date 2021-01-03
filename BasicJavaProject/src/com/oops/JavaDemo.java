package com.oops;

//Inheritence and Method Overriding

class Parent
{
	public String name;
	public int age;
	public double height;
	public 	int weight;
	
	public void display()
	{
		System.out.println("Display inside Parent");
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Height : "+height);
		System.out.println("Weight : "+weight);
	}
}

class Child extends Parent
{
	public int marks;
	public String school;
	
	public void display()
	{
		super.display();
		System.out.println("Display inside Child");
		System.out.println("Marks : "+marks);
		System.out.println("School : "+school);
	}
}

public class JavaDemo {
	
	public static void main(String args[])
	{
		Child c1 = new Child();
		c1.age = 25;
		c1.height = 5.9;
		c1.weight = 65;
		c1.marks = 90;
		c1.name = "Bishal";
		c1.school = "Pillai";
		
		c1.display();
		
		System.out.println("\n\n");
		
		Child c2 = new Child();
		c2.age = 25;
		c2.height = 5.4;
		c2.weight = 80;
		c2.marks = 40;
		c2.name = "Bhavini";
		c2.school = "Somaya";
		
		c2.display();
		
		Parent p1 = new Parent();
		p1.age = 50;
		p1.height = 4.5;
		p1.name = "Papa";
		p1.weight = 55;
		
		p1.display();
	}
}

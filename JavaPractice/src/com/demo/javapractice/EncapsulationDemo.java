package com.demo.javapractice;

class Student
{
	private int roll=0;
	private String name=null;
	public String address=null;
	
	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void display() throws NullPointerException
	{
		System.out.println("Roll No - "+this.getRoll());
		System.out.println("Name - "+this.getName());
		System.out.println("Address - "+this.getAddress());
		System.out.println("Length of Address : "+this.getAddress().length());
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setRoll(1);
		student1.setName("Bhavini");
		student1.setAddress("Ghatkopar");
		student1.display();
		
	}

}

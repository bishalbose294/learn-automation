package com.demo.javapractice;


class Employee{
	String name;
	static String organization;
	int salary;
	
	public void changeOrg(String value)
	{
		organization = value;
	}
	
	public void displayOrg()
	{
		System.out.println(organization);
	}
}

public class StaticDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.name = "Bishal Bose";
		emp.salary = 10;
		emp.changeOrg("Ness");
		
		Employee emp1 = new Employee();
		emp1.name = "Bhavini";
		emp1.salary = 20;
		
		Employee emp2 = new Employee();
		emp2.name = "ABC";
		emp2.salary = 10;
		
		Employee emp3 = new Employee();
		emp3.name = "XYZ";
		emp3.salary = 20;
		
		System.out.println(emp.organization);
		System.out.println(emp1.organization);
		System.out.println(emp2.organization);
		System.out.println(emp3.organization);
		System.out.println(Employee.organization);
		
		emp3.changeOrg("Infosys");
		
		System.out.println(emp.organization);
		System.out.println(emp1.organization);
		System.out.println(emp2.organization);
		System.out.println(emp3.organization);
		System.out.println(Employee.organization);
	}

}

/*class StaticDemo {
	static int count = 0;

	StaticDemo() {
		count++;
		System.out.println(count);
	}

	public static void main(String args[]) {

		StaticDemo c1 = new StaticDemo();
		StaticDemo c2 = new StaticDemo();
		StaticDemo c3 = new StaticDemo();

	}
}*/

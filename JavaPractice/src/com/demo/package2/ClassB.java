package com.demo.package2;
import com.demo.package1.ClassA;

public class ClassB {

	public static void main(String[] args) {
		ClassA ca = new ClassA();
		System.out.println(ca.publicVariable);
        ca.publicDisplay();
	}

}

package com.demo.javapractice;

public class FinalizeDemo {
	
	public void finalize() throws Throwable
	{
		System.out.println("Object garbage collected");
	}

	public static void main(String[] args) {
		FinalizeDemo fd1 = new FinalizeDemo();
		fd1 = null;
		
		Runtime rc = Runtime.getRuntime();
		rc.gc();
		//System.gc();

	}

}

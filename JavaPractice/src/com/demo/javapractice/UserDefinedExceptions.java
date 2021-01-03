package com.demo.javapractice;

class BhaviniException extends Exception
{
	public BhaviniException(String msg)
	{
		System.out.println("Exception " +msg);
	}
}

public class UserDefinedExceptions {
	public static void main(String[] args)
	{
            try {
			String a = "bhavini munot";
		    char[] chars = a.toCharArray();
			if(chars.length>=10)
			{
				throw new BhaviniException("Length exceeded");
			}
			else
			{
				System.out.println("Length is " +chars.length);
			}
		} catch (BhaviniException e) {
			e.printStackTrace();
		}

	}
}

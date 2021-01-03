package projects;

public class PalindromeNumbers {
	
	public static void main(String[] args) {
		
		int newnum = 0;
		int r;
		int q;
		int num = 242;
		int temp = num;
		                 
		while (num > 0) {
			q = num / 10;
			r = num % 10; 
			newnum = (newnum*10) + r;
			num = q;
		}
		
		if (temp == newnum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}
}

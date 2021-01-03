package projects;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num = 51;
		boolean isPrime = false;
		for (int i = 2; i < num; i++) {
			if (num%i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
		}

		if(isPrime)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not Prime");
		}
	}
}

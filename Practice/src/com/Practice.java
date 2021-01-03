package com;



public class Practice {

	static int nthTermOfAP(int A1, int A2, int N) {

		int diff = A2 - A1;
		int term = 0;

		int i = 3;
		if (N == 1) {
			term = A1;
		} else if (N == 2) {
			term = A2;
		} else {
			term = A2;
			while (i <= N) {
				term = term + diff;
				i++;
			}
		}

		return term;

	}
	
	static int pthTermOfAP(int A1, int A2, int N) {
		return (A1+(N-1)*(A2-A1));
	}

	public static void main(String[] args) {
		System.out.println(pthTermOfAP(2, 396, 57064567));
	}

}

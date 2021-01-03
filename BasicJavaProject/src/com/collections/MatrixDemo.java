package com.collections;

public class MatrixDemo {

	public static void main(String[] args) {

		/*
		 * [1, 2, 3, 4] 
		 * [5, 6, 7, 8] 
		 * [9, 10, 11, 12]
		 * 
		 * matrix [row] [column]
		 */

		int matri[][] = { 	{ 1, 20, 3, 40, 55, 660 }, 
							{ 5, 60, 7, 80, 68, 32, 808 },
							{ 9, 10, 101, 120, 88, 740, 1120, 44 } };

		// System.out.println(matrix[2][3]);

		System.out.println("Length=" + matri.length);

		for (int i = 0; i < matri.length; i++)
		{
			for (int j = 0; j < matri[i].length; j++)
			{
				System.out.print(matri[i][j] + " ");
			}
			System.out.println();
		}
		

		int i = 0;
		int j = 0;
		while (i <= matri.length-1) 
		{
			j = 0; //for every column start we need j to start form 0 for indexing each row form the start.
			while (j < matri[i].length) 
			{
				if ((matri[i][j] % 10) == 0) 
				{
					System.out.print(matri[i][j] + " ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		
	}
}

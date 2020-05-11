package com.syntaxclass10;

public class class08 {

	public static void main(String[] args) {
		/* Write a program to double the values of every element in the array and print it out.

Example Output:
2.8 4.0 6.6 4.0 
8.0 3.0 12.2 2.0 
2.4 6.2 8.0 3.2
*/
		double[][]numbers=new double[3][4];//[rows][cols]
		//1st row
		numbers[0][0]=1.4;
		numbers[0][1]=2.0;
		numbers[0][2]=3.3;
		numbers[0][3]=2.0;
		//2nd row
		numbers[1][0]=4.0;
		numbers[1][1]=1.5;
		numbers[1][2]=6.1;
		numbers[1][3]=1.0;
		//3rd row
		numbers[2][0]=1.2;
		numbers[2][1]=3.1;
		numbers[2][2]=4.0;
		numbers[2][3]=1.6;
		//print value 15
		
		System.out.print(" "+numbers[0][1]);
		System.out.print(" "+numbers[0][2]);
		System.out.println(" "+numbers[0][3]);
		System.out.print(numbers[1][0]);
		System.out.print(" "+numbers[1][1]);
		System.out.print(" "+numbers[1][2]);
		System.out.println(" "+numbers[1][3]);
		System.out.print(numbers[2][0]);
		System.out.print(" "+numbers[2][1]);
		System.out.print(" "+numbers[2][2]);
		System.out.println(" "+numbers[2][3]);
		
		
	}

}

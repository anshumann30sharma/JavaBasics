package com.syntaxclass10;

public class practice09 {

	public static void main(String[] args) {
		/*Write a program that will print the sum of all elements in 2D array. 

Expected Output:
-9
*/
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2, 2},
				{1,-2, 3,-4}
				};
				int row=a.length;
				int sum=0;
				for(int i=0; i<=row-1; i++){
				 for(int j=0; j<=3; j++){
				   sum+=a[i][j];
				 }
				}
				System.out.print(sum);



				}
				}

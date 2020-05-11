package com.syntaxclass10;

public class Misc {

	public static void main(String[] args) {
		int[][] a = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
				};
				int row=a.length;
				int largestValue=a[0][0];
				for(int i=0; i<=row-1; i++) {
				for(int j=0; j<=3; j++) {
				 if(a[i][j] > largestValue){
				   largestValue=a[i][j];

				 }
				 }
				}
				System.out.println(largestValue);
				}
				





	}



package com.syntaxclass10;

public class aaa {

	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
				};
				int row = a.length;
				int sum=0;
				for (int i = 0; i <= row - 1; i++) {
				for (int j = 0; j <= 3; j++) {
				if(i%2==0 && j%2==0) {
				sum+=a[i][j];
				}
				}
				}
				System.out.println(sum);
	}
	
	
	}



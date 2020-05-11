package com.review05;

public class TwoDarrayEnhanced {

	public static void main(String[] args) {
		int [][] num= {
				{7,1,6,12},{9,6,2,8},{3,0,8,5}};
		int sum=0;
		//iterating rows of a three D array
		for(int[] row:num) {
			//iterating elements of a row
		
			for(int element:row) {
				System.out.print(element+" ");
		sum+=element;
			}
			System.out.println();
	}
System.out.println("the sum is "+ sum);
	}}

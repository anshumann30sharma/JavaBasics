package com.review05;

public class practice01 {

	public static void main(String[] args) {
		
	
			int [][] num= {
			{1, 2, 3},{ 4, 5, 6},{7, 8, 9}};
			//iterating a 2D Array
			int rows=num.length;
			for(int row=0;row<rows;row++) {
			int length=num[row].length;
			for(int col=0;col<length;col++) {
				int element=num[row][col];
			//	System.out.print(element+" ");
				
			}
		//	System.out.println();
			}	
	
		
			int sum=0;
			//iterating rows
					for(int row=0;row<num.length;row++) {
						//iterating elements of a row
						int length=num[row].length;
						for(int col=0;col<num[row].length;col++) {
							int element=num[row][col];
							sum+=num[row][col];
							//sum+=element;
							
						}
						System.out.println("the sum of all number is " +sum);
						

					}
	}
}

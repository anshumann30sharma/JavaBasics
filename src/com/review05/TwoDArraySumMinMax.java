package com.review05;

public class TwoDArraySumMinMax {

	public static void main(String[] args) {
		int [][] num= {
		{7,1,6,12},{9,6,2,8},{3,0,8,5}};
		//iterating a 2D Array
		int rows=num.length;
		for(int row=0;row<rows;row++) {
		int length=num[row].length;
		for(int col=0;col<length;col++) {
			int element=num[row][col];
			System.out.print(element+" ");
			
		}
		
System.out.println();
	}
// sum of all elements in a 2D Array
		int sum=0;
		//iterating rows
				for(int row=0;row<num.length;row++) {
					//iterating elements of a row
					int length=num[row].length;
					for(int col=0;col<num[row].length;col++) {
						int element=num[row][col];
						sum+=num[row][col];
						sum+=element;
						
					}
					System.out.println("the sum of all number is " +sum);
					
					int min=num[0][0];
					int max=num[0][0];
					for(int i=0;i<num.length;i++){
						for(int j=0;j<num[i].length;j++) {
							int element=num[i][j];
							if(element<min) {
								min=element;
							}
							if (element>max) {
								max=element;
								
							}
						}
					}
					System.out.println("the minimum is "+min);
					System.out.println("the maximum is  "+max);
				}
				// find the min and max in 2D Array
				
				
	}}

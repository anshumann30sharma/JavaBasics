package com.syntaxclass10;

public class practice12 {

	public static void main(String[] args) {
		/*Write a program that calculates the sum of elements from each row in a 2D array and adds them into array of integers

For example, if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
4
6
11
3
*/
		int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}}; //sum = 3
		int[]numbers={1,1,2};
		int sum=0;
		for (int i = 0; i <numbers.length; i++) {
			sum =sum +numbers[i];
		}
			System.out.println( sum);
	
	int[]numbers1={3,1,2};
	int sum1=0;
	for (int i = 0; i <numbers1.length; i++) {
		sum1 +=numbers1[i];
	}
		System.out.println( sum1);


	int[]numbers2={3,5,3};
	int sum2=0;
	for (int i = 0; i <numbers2.length; i++) {
		sum2 +=numbers2[i];
	}
		System.out.println( sum2);
		
		int[]number3={0,1,2};
		int sum3=0;
		for (int i = 0; i <number3.length; i++) {
			sum3 +=number3[i];
		}
			System.out.println( sum3);
	}
}
	
	
	


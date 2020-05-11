package com.syntax.class08;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// write a programme-reads a range of integers(Start and end point)
		//provided by user and then from that range prints the sum of the even and odd integers
		Scanner scan=new Scanner(System.in);
		System.out.println("write range of integers(start and end points)");
		int totalEven=0;
		int totalOdd=0;
		System.out.println("Please enter two numbers");
		int min=scan.nextInt();
		int max=scan.nextInt();
		
		for(int i=min;i<=max;i++) {
			if(i%2==0) {
				totalEven=totalEven+i;
			}else {
				totalOdd=totalOdd+i;
			}
		}
		System.out.println("The total of even numbers between "+totalEven);
		System.out.println("The total of odd numbers between "+totalOdd);
			
		}
		
		

	

}


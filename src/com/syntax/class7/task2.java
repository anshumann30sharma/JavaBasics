package com.syntax.class7;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		int num1;
		int luckynum=17;
		scan=new Scanner(System.in);
		
		
		do {
			System.out.println("please give any number 1-20");
			//num1++;
			num1=scan.nextInt();
		}while  (num1!=luckynum);
				
				System.out.println("Congratulation");
				
				
			}
			
		
	}



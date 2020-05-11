package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndlogicalimproved {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		
		Scanner scan;
		double sales;
		double commission;
		scan=new Scanner(System.in);
		System.out.println("Please enter your sales amount");
		sales=scan.nextDouble();
		if(sales>=1 && sales<=100) {
			commission=sales*0.10;
		}else if (sales>=100 && sales<=200) {
			commission=sales*0.20;
		}else if(sales>=200 && sales<=500) {
			commission=sales*0.50;
		}else {
			System.out.println("Your commission is="+(sales*.50));
			
}
	}

}

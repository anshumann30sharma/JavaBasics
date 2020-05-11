package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * write a program to ask user if there is a sale if no sale-->not going
		 * shopping if sale we will ask the price of the item based on the price we will
		 * apply discount and calculate final price
		 * 
		 * if price less than20-->apply 10% if price between 20 and 100-->20% if price
		 * between 100and 500-->apply 30% if price more than 500--> apply 50%
		 * 
		 * After discount--the price of the item reduced from --to--
		 * 
		 */

		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan=new Scanner(System.in);
		System.out.println("Is there a sale?");
		sale = scan.nextLine();
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("please enter the price");
			price = scan.nextDouble();

			if (price <= 20) {
				discount = price * 0.1;
			} else if (price >= 21 && price <= 100) {
				discount = price * 0.2;

			} else if (price >= 101 && price <= 500) {
				discount = price * 0.3;

			} else  if (price >= 501) {
				discount = price * 0.5;
			}else {
				discount = 0;
			}
			finalPrice = price - discount;
			System.out.println("After" + discount + "the price is reduced from " + price + "to" + finalPrice);
			}else {

				System.out.println("I dont go for shopping");

	}
		}
}

package com.syntax.class08;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		//enter the item you want to buy
		Scanner s;
		String item;
		double price;
		double money;
		double amount=0;
		double change;
		double remainingBalance;
		
	s=new Scanner(System.in);
	System.out.println("What are you buying today?");
	 item=s.nextLine();
	System.out.println("What is price of the item"+item);
	price=s.nextDouble();
	do {
		System.out.println("Please give payment");
		money=s.nextDouble();
		amount=amount+money;
		if(money<price) {
			remainingBalance=price-money;
			System.out.println("Please give more"+remainingBalance);
		}else if (money>price) {
			change=money-price;
			System.out.println("Here is your change"+change);
			break;
		}else {
			System.out.println("We got correct payment");
		}
	}while(price!=money);
	System.out.println("Thank you for shopping");
	}
	

	}



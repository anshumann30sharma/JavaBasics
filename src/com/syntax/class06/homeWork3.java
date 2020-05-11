package com.syntax.class06;

import java.util.Scanner;

public class homeWork3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan;
		char operator;
		double num;
		double num1;
		double result;
		scan = new Scanner(System.in);
		System.out.println("==CALCULATOR===");
		System.out.println("Please enter two number & an Arithmetic operators:");
		System.out.println("==================================================");
		System.out.print("Number 1 :");
		num = scan.nextInt();
		System.out.print("Choose from (+,-, * or /):");
		operator = scan.next().charAt(0);
		System.out.print("Number 2 :");
		num1 = scan.nextInt();
		scan.close();
		switch (operator) {
		case '+':
			result = num+num1;
			break;
		case '-':
			result = num-num1;
			break;
		case '*':
			result = num*num1;
			break;
		case '/':
			result = num/num1;
			break;
		default:
			System.out.println("You have entered wrong operator");
			return;
		}
		System.out.println("your calculation is " + result);
	}

}

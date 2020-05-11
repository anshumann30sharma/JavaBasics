package com.syntax.class08;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
	boolean app;
	
		Scanner scan = new Scanner(System.in);
		for (int i = 1; i <= 10; i++) {
			System.out.println("Apply for the credit card");
			 app = scan.nextBoolean();
			if (app == true) {
				break;
			}
		}
	}

}

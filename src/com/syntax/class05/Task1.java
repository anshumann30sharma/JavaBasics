package com.syntax.class05;

import java.util.Scanner;

public class Task1 {
public static void main(String[] args ){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your height");
	
	int inches=scan.nextInt();
	if (inches>=0 && inches<=60) {
		System.out.println("Your height is short");
	}else if(inches>=61 && inches<=72) {
		System.out.println("Your height is medium");
	}else {
			System.out.println("Your height is tall");
		}
	}
	
}


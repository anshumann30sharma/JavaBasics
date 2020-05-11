package com.syntaxclass12;

import java.util.Scanner;

public class task03 {

	public static void main(String[] args) {
		/* Write a programme that reads two people's first
		 * names and if they expecting boy or girl?
		 * Based on the input suggests a name for a baby:
		 * Eg.,output
		 * Mom's first name?Mary
		 * Dad's first name?Daniel
		 * Boy or Girl?boy
		 * Suggested baby name:DANRY
		 * Eg.,output
		 * Mom's first name?Mary
		 * Dad's first name?Daniel
		 * Boy or Girl?girl
		 * Suggested baby name:MAIEL
*/
		Scanner sc=new Scanner (System.in);
		
		String babyName = null;
		String input;
		String input1;
		String input2;
		System.out.println("What is Mom's firstName ? ");
		input=sc.next();
		System.out.println("What is Dad's firstName ? ");
		input1=sc.next();
		System.out.println("Boy or Girl? ");
		input2=sc.next();
		if (input2.equalsIgnoreCase("boy")) {
			babyName=(input1.substring(0, (input1.length()/2) ))+(input.substring((input.length()/2) ));
		}else {
			babyName=(input.substring(0, (input.length()/2) ))+(input1.substring((input1.length()/2) ));
		}
		System.out.println(babyName.toUpperCase());
	}

}

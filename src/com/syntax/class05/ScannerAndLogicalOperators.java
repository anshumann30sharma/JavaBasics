package com.syntax.class05;

import java.util.Scanner;

public class ScannerAndLogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Take aGE INPUT FROM A USER AND THEN BASED ON THE AGE PRINT OUTPUT
 * IF AGE IS FROM 0-3--> YOU ARE A BABY
 * if age from 4-5-->you are a kid
 * ig age from 6-12you are a child
 * if age from 13-19 you are teenager
 * if age from 20-64-->you are an adult
 * if age is more or equal to 65--> you are a senior
 */
		//1-declare all variables
		int age;
		Scanner scan;//ctrl+shift+o
		//cmd+shift+o
		//2.capture values
	 scan=new Scanner(System.in);
	 System.out.println("Please enter your age");
		age=scan.nextInt();
		//3.perform verification
		if(age>3) {
			if (age<3) {
			System.out.println("You are a baby");
			}else if (age>=3 && age<5) {
			System.out.println("You are a kid");
			
			}else if(age>=6 && age<12) {
			System.out.println("You are a child");
			}else if(age>=13 && age<19) {
			System.out.println("You are a teenager");
			}else if(age>=20 && age<65) {
			System.out.println("You are an adult");
			}else {
			System.out.println("You are enjoying your life");
			
		
		}
	}
	}
}


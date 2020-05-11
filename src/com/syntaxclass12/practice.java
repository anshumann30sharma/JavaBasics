package com.syntaxclass12;

public class practice {

	public static void main(String[] args) {
		/*Validate if the string ends with "u" prints the boolean value accordingly.
Validate if the string ends with "world" prints the boolean value accordingly.
Validate if the string ends with "are" prints the boolean value accordingly.
Validate if the string ends with "you" prints the boolean value accordingly.
			*/
		String s1="hello how are you";
		String expected="hello how are you";
		String actual="hello how are you";
		if(actual.equals(expected)) {
			System.out.println("True");
			}else {System.out.println("False");
			}
		String expected1="hello how are you";
		String actual1="hello how are you world";
		if(actual1.contentEquals(expected1)) {
			System.out.println("True");
		}else {System.out.println("False");
		}
		String expected2="hello how are you";
		String actual2="hello how are ";
		if(actual2.contentEquals(expected2)) {
			System.out.println("True");
		}else {System.out.println("False");
		}
		String expected3="hello how are you";
		String actual3="hello how are you";
		if(actual3.contentEquals(expected3)) {
			System.out.println("True");
		}else {System.out.println("False");
		}
		}
		
	
	}

	



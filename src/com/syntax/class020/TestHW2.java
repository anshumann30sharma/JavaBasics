package com.syntax.class020;

public class TestHW2 {
	/***Home Wokr-2
	Create a class named 'Programming'. 
	While creating an object of the class, if nothing is passed to it, 
	then the message "I love programming languages" should be printed. 
	If some String is passed to it, then in place of "programming languages" the value variable should be printed. 
	Example, if we pass "Java", then "I love Java" should be printed.
	 */

		public static void main(String[] args) {
			Programming tester=new Programming();
			Programming tester1=new Programming("Java");
		}
	}
	class Programming{
		Programming(){
			System.out.println("I love programming languages");
		}
		Programming(String language){
			System.out.println("I love "+language);
		}
	}



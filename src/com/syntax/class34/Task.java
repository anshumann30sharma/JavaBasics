package com.syntax.class34;
/*Create a method to check age eligibility
 *  that will throw a runtime exception. 
 *  Method should throw an exception age is less than 16
 */
public class Task {

	public static void main(String[] args) {
		
eligibility(16);
	}
	public static void eligibility(int age) {
		if(age<16|| age>65) {
			throw new RuntimeException("Your age is less than 16");
			
		}
		System.out.println("end of programme");
	}
}

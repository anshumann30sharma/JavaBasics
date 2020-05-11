package com.syntax.class16;

import javax.management.ObjectName;

public class practice3 {
 /*Declare static variable in class level as below and assign its value:

String ss="Welcome To Syntax Technologies"

Access variable in the main method and print it using three ways you learned so far

Hint:
first way: By calling directly
Second way: By using the className
Third way: By creating the object of the class

Expected Output:
Welcome To Syntax Technologies
Welcome To Syntax Technologies
Welcome To Syntax Technologies
*/
	static String ss="Welcome To Syntax Technologies";
	

	 
	 
 

	
	
	public static void main(String[] args) {
		
		practice3 obj=new practice3();
		System.out.println(ss);
		System.out.println(practice3.ss);
		System.out.println(obj.ss);
		
		
		
	}
	
}

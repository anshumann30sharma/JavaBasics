package com.syntaxclass14;

public class Student {
	/*For you to do:

Declare 3 instance variables to hold: 

year, school name and batch #

Access variables from the main method and assign specific values to them
Print values of your variables in the following format:

Expected Output:
I am a student of batch 6 studying at Syntax in the year of 2020
*/
	int year,batch;
	String schoolName;
	
	void studying() {
		System.out.println("I am a student of batch  "+ batch+" studying at "+schoolName+"  in the year of  "+year);
	}
	public static void main(String[] args) {
		Student student1=new Student();
		student1.year=2020;
		student1.batch=6;
		student1.schoolName="Syntax";
		 
		System.out.println("I am a student of batch  "+ student1.batch+" studying at "+student1.schoolName+"  in the year of  "+student1.year);
	}
	
}
	

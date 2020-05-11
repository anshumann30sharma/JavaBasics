package com.syntax.class020;


public class Employee {
public static String company;
protected int empNumber;
double salary;

 void getPaid() {
	System.out.println("Employee salary is "+salary);
}
 static void work() {
	 System.out.println("Employee work is "+company);
 }
 public class scrumTeam extends Employee{
	//public static String company;
	protected int empNumber;
	 double salary;
	 String ceremonies;
	 
	 void attendMeetings() {
		 System.out.println("Scrum Team has meetings "+ceremonies);
		 
	 }
 }
}
 

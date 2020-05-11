package com.syntax.class17;

public class practice02 {
	/*For you to do 
In main class please declared the variables 
using different access modifiers that will hold value for:
name
city
name of the school
batch number

Create a method to display details in following format:
My name is ___ and I live in ___. I study at ___ in batch ___

Assign values to the variables and execute method display

Expected Output:
My name is John and I live in Miami. I study at Syntax in batch 6
*/
	public static String name;
	public static String city;
	protected  static String nameOfTheSchool;
	private static  int batchNumber;
	
	static void displayGeneralInfo() {
		System.out.println("My name is "+name+"  and I live in  "+city+"  I study at  "+nameOfTheSchool+"  in batch"+batchNumber);
		
	}
	public static void main(String[] args) {
		practice02  emp=new practice02 ();
		emp.name="John";
		emp.city="Miami";
		emp.nameOfTheSchool="Syntax";
		emp.batchNumber=6;
		
        emp.displayGeneralInfo();
       
		
			
		}

	}



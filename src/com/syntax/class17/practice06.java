package com.syntax.class17;

public class practice06 {
/*Include the following class variables:
* name(String)
* lastName(String)
* employeeId(int)
* startDate(String)
* salary(int)


Write two constructors:

* non-argument constructor
* parameterized constructor that will initialize all instance variables

Create two different objects of the Employee class using both constructors and print the values of the properties inline using a print method.


Output:
 
null null 0 null 0
Joe Smith 12345 01/01/1970 35000
*/
	static String name;
	static  String lastName;
	static  int employeeId;
	static  String  startDate;
	static int salary;
	 
	 practice06(){
		 this.name=name;
			this. lastName=lastName;
			this.employeeId=employeeId;
			this.startDate=startDate;
	//		this. salary=startDate;
			
	}
	practice06( String name,String lastName,  int employeeId,String startDate,int salary ){
		this.name=name;
		this. lastName=lastName;
		this.employeeId=employeeId;
		this.startDate=startDate;
	//	this. salary=startDate;
	
}
//
			
		}



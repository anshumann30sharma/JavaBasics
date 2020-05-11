package com.syntax.class15;

public class Google {
//define features such as empID,name,last name,salary
	//define behavior, working,getting paid,attending meetings
	int empId;
	double salary;
	String name,lastName,title;
	//method header
	void working() {
	System.out.println(title+" is working");
	}
	void getPaid() {
		System.out.println(name+ " is getting paid "+salary);
	}
	void attendMeetings() {
		System.out.println(name+" attending meetings");
	}
	public static void main(String[] args) {
	Google emp1=new Google();
	emp1.empId=123;
	emp1.name="John";
	emp1.lastName="Smith";
	emp1.title="CEO";
	emp1.salary=200000;
	
	emp1.working();
	emp1.getPaid();
	emp1.attendMeetings();
	
	emp1.empId=124;
	emp1.name="Seyma";
	emp1.lastName="Atasoy";
	emp1.title="QA Engineer";
	emp1.salary=300000;
	
	emp1.working();
	emp1.getPaid();
	emp1.attendMeetings();
	
}
	
		
	}


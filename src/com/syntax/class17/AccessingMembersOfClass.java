package com.syntax.class17;

public class AccessingMembersOfClass {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.lastName="Faisal";
		emp.lastName="Sakhi";
		emp.salary=100000;
		//emp.ssn=78969;CE field ssn not visible
        emp.method1();
        emp.method2();
        emp.method3();
        //emp.method4();//
        
	}

}

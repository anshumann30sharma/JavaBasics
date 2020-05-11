package com.syntax.class17;

public class Employee {
//create variables to hold:name, last name,ssn;
    public static String title;
    
	public String name;//accessible everywhere to everyone
    protected String lastName;//accessible within same package
	double salary;//accessible within the same package
	private long ssn;//accessible only within same class
	
	public void method1() {
		System.out.println("I am public method");
		
	}
	protected void method2() {
		System.out.println("I am protected method");
	
	}
	void method3() {
		System.out.println("I am default method");
		
	}
	private void method4() {
		System.out.println("I am a private method");
		
	}
	public static void main(String[]args) {
	Employee emp=new Employee()	;
	emp.lastName="John";
	emp.lastName="Smith";
	emp.salary = 90000;
	emp.ssn=898700;
	
	
	emp.method1();
	emp.method2();
	emp.method3();
	emp.method4();
		
	}
}

package com.syntax.class23;

public class Student {
private static final String study = null;
public void study() {
	System.out.println("Student studies");
}
public void doHomework() {
	System.out.println("Student do Homework");
}
class SyntaxStudent extends Student {
	//override
	public void study() {
		System.out.println("SyntaxStudents are coding");
}
}
	public void getJob() {
		System.out.println("SyntaxStudents become QA");
	}
	public void accessParentOverridenMethod() {
	
	}
}
class CollegeStudent extends Student{
	
	
}
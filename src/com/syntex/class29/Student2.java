package com.syntex.class29;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Student2 {

	private String name;
	private int studentID;
	private Object set;
	
	public Student2(String name, int studentID){
		this.name = name;
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public int getstudentID() {
		return studentID;
	}
	


public static void main(String[]args) {
Set <Student2> students = new HashSet<>();

students.add(new Student2("Samir", 101));
students.add(new Student2("Karim", 102));
students.add(new Student2("John", 103));
students.add(new Student2("Jane", 104));
students.add(new Student2("Khan", 105));
students.add(new Student2("Tariq", 106));
students.add(new Student2("Ahmed", 107));

Iterator <Student2> student = students.iterator();

while(student.hasNext()) {
	System.out.print(student.next().getName()+", ");
}
	
Set <Student2> students1 = new LinkedHashSet<>();
//if(student.contains("Samir")) {
System.out.println("WE have Samir");

}
//convert to List
//List<String>List=new ArrayList<>(set);
//String name1=List.get(4);

//convert to array
//object[]arrayset.toArray[];
//to sort Collection




}


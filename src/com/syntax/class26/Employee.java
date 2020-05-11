package com.syntax.class26;

public class Employee {
//define pvt. var.
private String name;
private int age;
private double salary;

//define pub. methods to give an access to pvt. vars.
public void setName(String name) {
if(!name.isEmpty() && name.length()>3) {
	this.name=name;
}
}
public String getName() {
	return name;	
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public double getSalary() {
	return salary;	
}
}


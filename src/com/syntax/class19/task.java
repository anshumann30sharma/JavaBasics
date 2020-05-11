package com.syntax.class19;

public class task {
/*Write program as a Student class   
 * that has instance variables name and address. 
 * Create a constructor that will initialize those variables. 
 * Print name & address of given  student using displayInfo method.

Write program as a Book class  
 that will have 2 Constructors. 
 While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
*/
	String name;
	String address;
	public task(String name,String address){
		this.name=name;
		this.address=address;
	}
	public void displayName() {
		System.out.println(name);
	}
	public void displayAddress() {
		System.out.println(address);
}
	public static void main(String[] args) {
		task obj=new task("Ram","Vienna,USA");
		obj.displayName();
		obj.displayAddress();
}}
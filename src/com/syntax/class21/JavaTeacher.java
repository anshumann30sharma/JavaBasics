package com.syntax.class21;

public class JavaTeacher extends Teacher{
	//compiler will try to create default constructor
	//and make a call insiude to parent class default constructor

//	JavaTeacher(){
	//	super();
String certification;
JavaTeacher(String name,String lastName,String certification){
	super(name,lastName);//should be the firstline under constructor, also "this"
	this.certification=certification;
	
}
JavaTeacher(String name,String lastName){
	super(name,lastName);
	
}
}

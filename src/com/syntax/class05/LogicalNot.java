package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean b=true;
boolean val=false;
System.out.println(b);
System.out.println(val);
	
	boolean iscold=false;
	if (!iscold) {
		System.out.println("hello");
	}else {
		System.out.println("bye");
	}
	String day1="Monday";
	String day2="Friday2";
	//if it is not monday or not friday--> Find me at Syntax
	if(!day1.equals("Monday")|| !day2.equals("Friday")){
		System.out.println("Find me at syntax");
	}if(!(day1.equals("Monday")&&day1.equals("Friday"))) {
		System.out.println("Find me at syntax");
	}

}
}
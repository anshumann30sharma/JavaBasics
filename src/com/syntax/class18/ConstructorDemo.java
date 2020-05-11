package com.syntax.class18;

public class ConstructorDemo {
	static String str="Hello";
	ConstructorDemo(){
		System.out.println("Iam your constructor");
		System.out.println("I am non argument Constructor");
	}
	ConstructorDemo(String str){
		System.out.println("I am a constructor with 1 String parameter"+str);
	}
	ConstructorDemo(int num){
		System.out.println("I am a constructor with 1 integer value"+num);
	}
	ConstructorDemo(String str,int num){
		System.out.println("I am a constructor with 2 parameters"+str+"&"+num);
	}
	void ConstructorDemo() {//now it becomes a method
		System.out.println("I do not know who I am");
	}
	
	public static void main(String[] args) {
		ConstructorDemo obj=new ConstructorDemo("Yes",13);
		System.out.println(str);
		
		ConstructorDemo obj1=new ConstructorDemo(12);
	obj1.ConstructorDemo();
	}
}

package com.syntax.class22;

public class Recap {

	public  void hello() {
		System.out.println("Hello");
	}
	public  void hello1(String name) {
		System.out.println("Hello"+name);//overloaded

	}
	public  void hello1(int num) {
		System.out.println("Hello"+num);//overloaded
	}
	private  void hello(String str) {
		System.out.println(str);//not overloaded--access modifier doesnot overload
		
}
}

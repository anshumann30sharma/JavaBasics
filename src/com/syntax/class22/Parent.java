package com.syntax.class22;

public class Parent {
private void hello() {
	System.out.println("hello fro parent class");
}
}
class Child extends Parent{
	//not override here, just declaring child class method
	private void hello() {
		System.out.println("hello form child class");
	}

static void bye() {
	System.out.println("Bye from the parents");
}
}

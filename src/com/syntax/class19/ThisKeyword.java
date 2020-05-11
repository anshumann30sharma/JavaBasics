package com.syntax.class19;

public class ThisKeyword {
int a;
int b;
public ThisKeyword() {
	System.out.println("I am non argument Constructor");
}
public ThisKeyword(int a,int b) {
	this.a=a;
	this.b=b;
	
}
public void sum(int a,int b) {
	//sum of which variables am I calculating?
	System.out.println("Sum of local variables "+(a+b));
	System.out.println("Sum of instance variables "+(this.a+this.b));
	
}
public static void main(String[] args) {
	ThisKeyword obj=new ThisKeyword(10,20);
	obj.sum(100,200);
	System.out.println("__________________");
	ThisKeyword obj2=new ThisKeyword();
	obj2.sum(20,40);
}
}

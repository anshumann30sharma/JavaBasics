package com.syntax.class21;

public class Addition {
	//By changing number of parameters
void add(int num,int num1) {
	System.out.println(num+num1);	
}
void add(int num,int num1,int num2) {
	System.out.println(num+num1+num2);	
}
void add(int num,int num1,int num2,int num3) {
	System.out.println(num+num1+num2+num3);	
}
//By changing type of parameter
void add(int num1,double num2) {
	System.out.println(num1+num2);
}
void add(double num1,double num2) {
	System.out.println(num1+num2);
}
}
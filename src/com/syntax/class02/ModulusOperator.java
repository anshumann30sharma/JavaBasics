package com.syntax.class02;

public class ModulusOperator {
public static void main(String[]args) {
	float f=12.50f;
	float f1=2.7f;
	double d=12.50;
	double d1=2.7;
	float result=f/f1;
	double result3=d/d1;
	//double can hold up to 14-15 integers
	System.out.println(result3);
System.out.println(result);

int i=12;
int y=7;
int result2=i/y;//1.0987
System.out.println(result2);
//modulus
int v=16;
int w=7;
int mod=v%w;
System.out.println(mod);
// I would like to divide 12/7
// int num1=12.5;
// int num1=12.5; not possible to store decimals into we can store int into double
double num2=12;
double num3=7;
System.out.println(num2);
System.out.println(num2/num3);


}
}
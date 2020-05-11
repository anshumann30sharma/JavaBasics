package com.syntax.class02;

public class ArithmaticOperationII {
public static void main(String[]args) {
	int num1=30;
	int num2=10;
	double num3=10.99;
	double num4=11.99;
	
	int sum=num1+num2;
	double sum1=num3+num4;
	
	int sub=num1-num2;
	
	int mul=num1*num2;
	int div=num1/num2;
	// 2
	double s=3.9;
	double s2=s*s;
	//3
	int width=5;
	int height=8;
	int area=width*height;
	int perimeter=2*(width+height);
	int num=10+10*10;
	int num5=10*10+20/5;
	
	System.out.println("The result of the division =" +div);
	System.out.println("The square of 3.9 + "+s2);
	System.out.println("The area of two numbers 5 and 8 is "+area);
	System.out.println("The perimeter of rectangle is "+perimeter);
	System.out.println(num1);//110,200
	System.out.println(num2);//101,140
}	
}

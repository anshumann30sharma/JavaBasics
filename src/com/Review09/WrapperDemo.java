package com.Review09;

public class WrapperDemo {
public static void main(String[] args) {
	int int1=5;
	Integer integer1=new Integer(10);//Boxing
	int int2=integer1.intValue();//unboxing
	System.out.println(int2);
	int int3=10;
	//Integer integer3=new Integer(int3);
	Integer integer3=int3;//Auto-boxing, Auto-wrapping,Auto-converting
	//int int4=integer3.intValue();
	int int4=integer3;//Auto-boxing, Auto-wrapping,Auto-converting
//Double Wrapper class
	double d1=3;
	Double d2=d1;//Auto boxing
	//it does not access it in one step
	//Double d3=3;
	Double d4=3.0;//Auto boxing
	double d5=d4.doubleValue();//1st waylong way;unboxing
	double d6=d4;//2nd way short way
	
	
}
}

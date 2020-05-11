package com.syntax.class15;

public class MethodsReturningvalues {

	public static void main(String[] args) {
		//create a String and based on the length of the String
		// we define whether String is short or long
		String str="Hello my friend";
		int length=str.length();
		if(length>10) {
			System.out.println("String is long");
		}else {
			System.out.println("String is short");
		}
		//compare 2 nos and then we will identify whether largest
		//number is even or odd
		//test2 obj=new test2();
	//	int num=obj.islarger(10,20);
	}
	MethodsReturningvalues newObject=new MethodsReturningvalues();
	int num=newObject.largest(12, 13);
	boolean flag=newObject.isOdd(num);
	//System.out.println("largest number "+num+" is odd number"+flag);
	 int largest;
//create the method that returns largest number from two given numbers
	int largest(int a, int b) {
		if(a>b) {
			largest=a;
		}else {
			largest=b;	
		}
		return largest;	
	}
	
	boolean isOdd(int num) {
		boolean isOdd;
		if(num%2==0) {
			isOdd=false;
		}else {
			isOdd=true;		
		}
		return isOdd;
	}
	
}

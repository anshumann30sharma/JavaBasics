package com.syntax.class15;

public class test1 {
	
	//Create a method that will take 2 parameters as a numbers 
	//and prints which number is larger.
	void number(int a,int b) {
		if( a>b) {
			System.out.println(a+"is larger than"+b);
		}if( b>a) {
			System.out.println(b+"is larger than"+a);
		}
		
			
		
	}

	public static void main(String[] args, Object obj) {
		test1 num=new test1();
		num.number(12,23);
		
	}

}

package com.syntax.class020;

public class TestHW3 {
	/*Home Work-3
	Create 1 class with a static method that has 3 overloaded forms. 
	Then call each overloaded method with specific arguments and observe result.
	*/

		public static void main(String[] args) {
			Method mTest=new Method();
			mTest.print();
			mTest.print("Hello Everyone");
			mTest.print("John Smith",38);
		}
	}
	class Method{
		static String MethodName="**print()**";
		static void print() {
			System.out.println("Displaying method "+MethodName+" Without parameter.");
		}
		static void print(String str) {
			System.out.println("Displaying method "+MethodName+" With parameter : ( "+str+")");
		}
		static void print(String str, int num) {
			System.out.println("Displaying method "+MethodName+" With parameter: "+str+" & "+num);
		
	}
	
}

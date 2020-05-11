package com.syntax.class020;

public class TestHW4 {
	/***Home Work-4
	Create 1 class with a private method that has 3 overloaded forms. 
	Then call each overloaded method with specific arguments and observe result.
	***/

		public static void main(String[] args) {
			HomeWork4 hw = new HomeWork4();
//			hw.display();
//			hw.display("Good Morning");
//			hw.display("Syntax Batch",6);
			/**
			 * throwing unresolved compilation problem: 
			 * The method display() from the type HomeWork4 is not visible
			 * The method display(String) from the type HomeWork4 is not visible 
			 * The method display(String, int) from the type HomeWork4 is not 
			 * 
			 */
		}
	}
	class HomeWork4 {
		private void display() {
			System.out.println("I am Private Method without any argument");
		}
		private void display (String str) {
			System.out.println("I am Private Method with argument: " + str);
		}
		private void display(String str, int num) {
			System.out.println("I am Private Method with argument: " + str + " & " + num);
		
	}
	
	


	
}

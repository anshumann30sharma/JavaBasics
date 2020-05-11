package com.syntax.class16;

public class practice4 {
/*For you to do:

Declare a static variable number that will hold an integer value:

Access number from the main method and assign value to it.
Create an Object of the class, access number in a nonstatic way and assing value of 200.

Print out number using class name and using instance

Expected Output:
200
200
*/
		static int i;
		
		public static void main(String[] args) {
			
			practice4 mm= new practice4();
			mm.i=200;
			System.out.println(practice4.i);
			System.out.println(mm.i);
			

	}

}

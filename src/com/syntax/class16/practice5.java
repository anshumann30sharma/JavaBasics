package com.syntax.class16;

public class practice5 {
/*For you to do:

Create a variable that will hold the count of all instances of the Main class

Create 3 Object of the class and print value of the count variable;

Expected Output:
3
 */
	
	
//private int i1;
//private int i2;
static int count;
	
	public static void main(String[] args) {
		practice5 mm=new practice5();
		count++;
		practice5 mm1=new practice5();
		count++;
		practice5 mm2=new practice5();
		count++;
	
		System.out.println(count);
		
		
		
		

	}

}

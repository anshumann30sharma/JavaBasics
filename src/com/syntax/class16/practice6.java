package com.syntax.class16;

public class practice6 {

	
		/*For you to do:

Declare two static variables to hold
country name
continent

Create a method to display the value of static variables in the following format:
 
____ located on ____ continent

In the main method assign values to a static variable and execute method display

Expected Output:
Morocco located on Africa continent
*/
String countryName;
String continent;
	
static void displayValue(String countryName,String continent) {
	System.out.println(countryName+" located on "+continent+" continent");
	
	
}
public static void main(String[] args) {
	practice6 mm=new practice6();
	String countryName="Morocco";
	String continent="Africa";
	mm.displayValue(countryName,continent);
}

	}



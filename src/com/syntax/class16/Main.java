package com.syntax.class16;

public class Main {
	/*For you to do:

Declare 3 instance variables to hold:
name of the country
capital
population size

Create a method to display values of instance variables

Create 2 Object, assign values to instance variables, execute method display;

Expected Output:
The capital of USA is Washington DC and population is 330000000
The capital of Kazakhstan is Astana and population is 18500000
*/
	String nameOftheCountry;
	String capital;
	int populationSize;
	
	String  displayValues() {
		String print="The capital of  "+nameOftheCountry+" is "+
				capital+"  and population is "+
				populationSize;
		return print;
	}
}

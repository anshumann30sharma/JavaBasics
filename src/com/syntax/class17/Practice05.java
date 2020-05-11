package com.syntax.class17;

import com.syntax.class18.ConstructorDemo;

public class Practice05 {


		/* Complete the SyntaxTechnologies class:

Include the following class variables:
* schoolName(String)
* batch(int)
* year(int)
* lastDayOfClass(String)

Write two constructors:
* non-argument constructor
* parameterized constructor

Create method to display values of instance variables.

2. In Main Class:
Create two different objects of the SyntaxTechnologies class
 using both constructors and call display method.

Expected Output:
null 0 0 null
Syntax 6 2020 07/30/2020
*/
		static String	schoolName;
		static int batch;
		static int year;
		static String lastDayOfClass;
	
			Practice05(){
				
				System.out.println(schoolName+" "+ batch+" "+ year+" "+ lastDayOfClass );
			
			
		}
		Practice05( String schoolName,int batch, int year,String lastDayOfClass ){
		
	}

public static void main(String[] args) {
	Practice05 obj=new Practice05();
	System.out.println();
	Practice05 obj1=new Practice05("Syntax",6,2020,"07/30/2020");
	schoolName="Syntax";
	batch=6;
	year=2020;
	lastDayOfClass="07/30/2020";
	
	System.out.println(schoolName+""+ batch+""+ year+""+ lastDayOfClass );
}

		
	}



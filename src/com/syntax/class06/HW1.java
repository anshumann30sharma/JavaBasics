package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
//Variable declaration
Scanner scan1;
String country;
String language;
scan1=new Scanner(System.in);

System.out.println("Please enter your country ");
country=scan1.nextLine();
//operation
switch(country) {
case"Mexico":
	language="Spanish";
	break;
case"France":
	language="French";
	break;
case"Japan":
	language="Japanese";
	break;
case"India":
	language="Hindi";
	break;
case"Russia":
language="Russian";
break;
default:
	language="Unknown";
}
System.out.println("Your language is  "+language);


}



	}



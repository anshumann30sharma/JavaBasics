package com.syntax.class06;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
Scanner input=new Scanner(System.in);
String carMake;
String carOrigin;
System.out.println("Please enter your favourite car make");
carMake=input.nextLine();
switch (carMake ){
  case "BMW":
    carOrigin="german car";
    break;
  case "Toyota":
    carOrigin="japanese car";
    break;
  case "Maserati":
    carOrigin="italian car";
    break;
  default :
    carOrigin="unknown";
    

System.out.println("Your favorite car is   "+carOrigin);
}
	}
}
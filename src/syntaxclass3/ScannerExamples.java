package syntaxclass3;

import java.util.Scanner;

public class ScannerExamples {
public static void main(String[] args) {
	//Capture name from a user and
		//print in the format
		//My Name is---
	//bring scanner class into a programm
	//system.in-->identifies keyboard
	Scanner scan=new Scanner(System.in);
	System.out.println("Please enter your name ");
	//capture line of Strings from a user
	String name=scan.nextLine();
	
	
	System.out.println("My name is "+name);
	//Instruct user of what program expects
	
	System.out.println("How old are you");
	//capture number from a user
			 int age=scan.nextInt();
	System.out.println("Your name is "+name+" your age is "+age);
		
}
}
//capture 2 number from a user
//compare and identify which is larger
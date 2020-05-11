package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//import scanner
		Scanner scan=new Scanner(System.in);
		String grade;
		
		System.out.println("Enter your grade ");
		grade=scan.nextLine();
		
		switch(grade) {
		case "A":
			grade="Excellent";
			break;
		case "B":
			grade="Good";
			break;
		case "C":
			grade="Average";
			break;
		case "D" :
			grade="Poor";
			break;
		}
		System.out.println("Your grade is "+grade);
		
			
			
		}
		
			
		// TODO Auto-generated method stub
		
	}



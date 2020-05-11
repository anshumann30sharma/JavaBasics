package com.syntax.class7;

import java.util.Scanner;

public class loopsAndScanner {

	public static void main(String[] args) {
		//we want to ask user's name and print Good Afternoon---;
		Scanner input;
		String name;
		int num=1;
		
		input=new Scanner(System.in);
		while(num<=5) {
		System.out.println("What is your name");
		name=input.nextLine();
		System.out.println("Good Afternoon"+name);
		num++;
		}
		
		//we are playing lottery and a lucky number is 17;
		//we want to keep asking user any number from 1-20 
		//untill he gets the lucky number
		//then the output should be--congratulation
		Scanner in;
		int num1;
		int luckynum=17;
//		luckynum=in.nextInt();
		in=new Scanner(System.in);
		do {
			System.out.println("please give any number");
	//		num1++;
			num1=in.nextInt();
		}while  (num1==17);
				
				System.out.println("Congratulation");
				
				
			}
			
		
		

	}


package com.syntax.class13;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		/* Given the following inputs:
String s;

Write a for loop that will print out the reverse of the string.

Sample input/outputs:
In: manhattan
nattahnam

In: processor
rossecorp

In: racecar
racecar
*/
		Scanner inp = new Scanner(System.in);
	 System.out.print("In:");
	 String s = inp.nextLine();
	    //write your code below
	 String rev="";
	    for(int i=s.length()-1; i>=0; i--){
	      rev=rev+s.charAt(i);
	    }
	    System.out.print(rev+" ");
	  }

	    }
	  
	


package com.syntax.class05;

import java.util.Scanner;

public class Practice {
public static void main(String[] args) {
	Scanner birth=new Scanner(System.in);
	System.out.println("Enter your birth month");
	String month=birth.nextLine();
	String season=null;
	
	if(month.equals("January")||month.equals("February")||month.equals("December")){
		season="Winter";
	}else if(month.equals("September")||month.equals("October")||month.equals("November")){
		season="falls";
	}else if (month.equals("June")||month.equals("July")||month.equals("August")){
		season="Summer";
	}else if(month.equals("March")||(month.equals("April")||(month.equals("May")))){
		season="Spring";
		
	}
	System.out.println("You were born in "+season+".");
	}

}

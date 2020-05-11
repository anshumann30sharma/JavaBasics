package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// once i=4--> we want to stop the loop
for(int i=1;i<=10;i++) {
if(i==4) {
	System.out.println("I am stopping the loop");
	break;
}
System.out.println("I am inside the loop"); 
System.out.println(i);
	}
System.out.println("I am outside the loop");


for(int y=1;y<=10;y++) {
	if(y==4) {
		System.out.println("I am skipping iteration");
		continue;
	}
	System.out.println("I am inside the loops");
	System.out.println(y);
}
//write a programme that print numbers from 1-20
//i do not want to print 5,6,7
for(int i=1;i<21;i++) {
	if(i==5 || i==6 || i==7) {
		continue;
	}
	System.out.println(i);
}	
	//35--55 to be skipped
	System.out.println("-----------------continue-------------");
	
	for(int a=1;a<=100;a++) {
		if(a>=35 && a<=55) {
			continue;
		}
		System.out.println(a);
	}
	}
	}


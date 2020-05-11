package com.syntax.class05;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
String grade=null;
System.out.println("Please enter your quizz score");
int quiz=scan.nextInt();
System.out.println("Please enter your midterm score");
int midTerm=scan.nextInt();
System.out.println("Print your last score");
int finals=scan.nextInt();
double av=(quiz+midTerm+finals)/3;
if ((av/3)>=90) {
	grade="A";
}else if ((av/3)>=70 && (av/3)<90) {
	grade="B";
}else if ((av/3)>=50 && (av/3)<70) {
}else if((av/3)<50) {
}System.out.println("Your grade is "+grade);
}

	}
	



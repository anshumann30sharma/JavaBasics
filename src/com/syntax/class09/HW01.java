package com.syntax.class09;

public class HW01 {

	public static void main(String[] args) {
		// Create an array of names 
		//and store all names of your group. 
		//Then print your name from that array. (use 2 different ways of creating an array).
char [] grades= {'A','B','C','D','E','F'};
System.out.println(grades[1]);
//getting all elements
for(int i=0;i<grades.length;i++) {
	
	System.out.println(grades[i]);
}

	
	
	//2nd way
	char [] grade=new char[6];
	grade[0]='A';
	grade[1]='B';
	grade[2]='C';
	grade[3]='D';
	grade[4]='E';
	grade[5]='F';
	System.out.println(grades[2]);
	

// if fruit is apple-->that is your favourite fruit
	//advanced for loop,enhanced for loop
	for(char grade1:grades) {
		System.out.println(grade1);
	}
	String[]fruits= {"Banana","Kiwi","Apple","Mango"};
	for(String fruit:fruits) {
		if(fruit.equals("Apple")) {
		System.out.println(fruit+" is your favorite fruit");
	}else {
		System.out.println(fruit);
	}
	}
}}



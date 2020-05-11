package com.review06;

public class World {

	public static void main(String[] args) {
	Baby baby1;
		baby1=new Baby();
	
		System.out.println(baby1.cry());
		//assign values
		baby1.firstName="John";
		baby1.lastName="Smith";
		baby1.gender='M';
		baby1.weight=7;
		baby1.haircolor="Yellow";
		//reassign value
		baby1.weight=8;
		
		System.out.println("baby1 firstname is " +baby1.firstName);
		String babyLastName=baby1.lastName;
		System.out.println("baby1 lastname is " +baby1.lastName);
	
	
	baby1.cry();
	baby1.talk(3);
System.out.println("\n--Done with baby1---");
	Baby baby2=new Baby();
	System.out.println(baby2.cry());	
	baby2.firstName="Ann";
	baby2.lastName="Atasoy";
	baby2.gender='F';
	baby2.haircolor="Black";
	baby2.weight= 6;
	
	baby1.displayBabyInfo();
	System.out.println();
	baby1.displayBabyInfo();
	System.out.println();
}
}


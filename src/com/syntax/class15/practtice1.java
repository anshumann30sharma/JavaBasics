 package com.syntax.class15;

import com.syntaxclass14.dog1;

public class practtice1{
	// Create a Class Main 

	 /*In this class, you should specify the following attributes: breed, name, color, and following behaviors: bark(), run(), play().
	 Create 3 different objects of it: Husky, Bulldog, Labrador with specific attributes and behaviors.

	 The output of the program should be as following:
	  
	 Husky can bark
	 Husky can run
	 Husky can play
	 Bulldog can bark
	 Bulldog can run
	 Bulldog can play
	 Labrador can bark
	 Labrador can run
	 Labrador can play
	 */
  
	String breed, name, color;
	String bark,run,play;
	

	void name(String bark,String run,String play) {
		System.out.println(name+" can bark");
		System.out.println(name+" can run");
		System.out.println(name+" can play");
		
	}
	
public static void main(String[] args) {	
	practtice1 dog=new practtice1();
	dog.breed="Husky";
	dog.color="brown";
	dog.name="Charlie";
	System.out.println(dog.name+" can bark");
	System.out.println(dog.name+" can run");
	System.out.println(dog.name+" can play");
	
	 
	practtice1 dog1=new practtice1();
		dog1.breed="Bull Dog";
		dog1.color="black";
		dog1.name="Lucy";
		
		System.out.println(dog1.name+" can bark");
		System.out.println(dog1.name+" can run");
		System.out.println(dog1.name+" can play");
		
		 
		practtice1 dog2=new practtice1();
			dog2.breed="labrador";
			dog2.color="black";
			dog2.name="Lucy";
			
			System.out.println(dog2.name+" can bark");
			System.out.println(dog2.name+" can run");
			System.out.println(dog2.name+" can play");
			
			
 }
 }

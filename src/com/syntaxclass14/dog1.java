package com.syntaxclass14;

public class dog1 {
	String breed;
	String color;
	String name;
	
	public static void main(String[] args) {
		dog1 dog=new dog1();
		dog.breed="Husky";
		dog.color="brown";
		dog.name="Charlie";
	
		 dog.bark();
		 dog.runs();
		 dog.play();
		 
		 dog1 dog2=new dog1();
			dog2.breed="Bull Dog";
			dog2.color="black";
			dog2.name="Lucy";
			
			 dog2.bark();
			 dog2.runs();
			 dog2.play();
			 
			 dog1 dog3=new dog1();
				dog3.breed="labrador";
				dog3.color="black";
				dog3.name="Lucy";
				
				 dog3.bark();
				 dog3.runs();
				 dog3.play();
		 
	}
	void play() {
		System.out.println(name+" can eat");
		
	}
	void bark() {
		System.out.println(name+" can bark");
	}		
	void runs() {
		System.out.println(name+" can runs");
	}	
}

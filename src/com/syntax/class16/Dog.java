package com.syntax.class16;

public class Dog {
//instance variables
String name,size;
int age;
//static variables
static String breed="German Shepherd";
static int paws=4;
static int tail=1;
static int eyes=2;

void displayDog() {
	System.out.println("Dog name is  "+name +" and it is "+size+"dog and age is "+age);
	System.out.println("Dogs breed is  "+breed+ " and is has  "+paws+" paws and "+tail+" tail" );
}


public static void main(String[] args) {
	Dog dog1=new Dog();
	dog1.name="Lucy";
	dog1.size="Big";
	dog1.age=5;
	dog1.age=6;
	dog1.displayDog();
	//how to access instance variable--> by creating object and using ref variable
	System.out.println(Dog.breed);
	System.out.println("Dog1 name is  "+dog1.name);
	
	Dog dog2=new Dog();
	dog2.name="Sharik";
	dog2.size="Small";
	dog2.age=2;
	dog2.displayDog();
	System.out.println("Dog2 name is "+dog2.name);
	//how to access static variable belong to the class --> accessed by className
	System.out.println(Dog.breed);
	System.out.println(Dog.paws);
	System.out.println(Dog.breed);
	System.out.println(dog1.breed);
	System.out.println(breed);
	//changing value of static variable
	breed="Bulldog";
	
	Dog dog3=new Dog();
	dog3.name="Pepsi";
	dog3.size="Small";
	dog3.age=4;
	dog3.displayDog();
	System.out.println("Dog3 name is  "+dog3.name);
}
}

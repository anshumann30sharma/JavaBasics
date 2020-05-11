package com.review08;

public class World {

	public static void main(String[] args) {
		human h1=new human("Turker");
		System.out.println("The best student is "+h1.name);
h1.planet="World";
human h2=new human("Gulbahar");
System.out.println(h2.name+" lives in"+h2.planet );
String name = null;
Turkish ti=new Turkish(name);
System.out.println(ti.name +"lives in ");
h1.talk();
h2.talk();
ti.talk();

	}

}

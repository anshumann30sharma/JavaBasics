package com.syntax.class22;

public class Degree {
void getPrerequisite() {
	System.out.println("To get a Degree you need to get a High School Diploma");
}
}
class Bachelors extends Degree{
	
}
class Masters extends Degree{
	void getPrerequisite() {
		System.out.println("To get a Masters you need to get a High School Diploma");
	}
}
package com.review06;

public class Baby {
String firstName;
String lastName;
char gender;
int weight;
String haircolor;


public void walk() {
	System.out.println("crawling..");
	
}
protected String cry() {
	return"Cry every minute..";

}
public void talk(int times) {
	for(int i=1;i<=times;i++) {
	System.out.println("Bla ");
}
}
public void displayBabyInfo() {
	System.out.println("Full name of baby is " +firstName+ ""+lastName);
System.out.println("Gender is "+gender);
if(gender =='M') {
	System.out.println("Boy");
}else if(gender =='F') {
}else {
	System.out.println("Unknown");
		
	}

System.out.println("haircolor");
}
}


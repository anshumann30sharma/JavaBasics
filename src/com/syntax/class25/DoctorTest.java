package com.syntax.class25;

public class DoctorTest {

	public static void main(String[] args) {
	Doctor doc=new Doctor();
	doc.setEmail("");
	doc.setEmail("doctor@gmail.com");
System.out.println(doc.getEmail());
doc.setEmail("doctor@gmail.com");
		System.out.println(doc.getEmail());
	}

}

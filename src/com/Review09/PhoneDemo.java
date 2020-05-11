package com.Review09;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone p1=new Phone("2345678", "iPhone");
	
		p1.price=1200;
		p1.displayInfo();
		//changing Serial number
//		p1.serialNumber="bla bla bla";
		p1.displayInfo();
	}

}

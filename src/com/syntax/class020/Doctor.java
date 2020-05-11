package com.syntax.class020;

public class Doctor {
int doctorId;
String name;
public Doctor(String name,int doctorId) {
	this.name=name;
	this.doctorId=doctorId;
	}
}
class Dentist extends Doctor{
	Dentist(String name,int doctorId){
		//compiler will try to make call to parent constructor super();
		super(name,doctorId);
		//call through the parent class constructor

		
	}

		
	}
	


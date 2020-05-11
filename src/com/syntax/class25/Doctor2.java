package com.syntax.class25;

public class Doctor2 {
private long licenseID;
private long phoneNumber;
private String email;

public void setEmail(String email) {
	if(!email.isEmpty()) {
		if(email.contains("gmail")) {
		this.email=email;
	}else {
		System.out.println("Email must be of gmail type");
	}
}else {
			System.out.println("email cannot be empty");
		}
}
public String getEmail() {
	
	
	return email;
}
}

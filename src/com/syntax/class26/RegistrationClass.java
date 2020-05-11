package com.syntax.class26;

public class RegistrationClass {
private String email;
private String UserName;
private String PassWord;

public void setEmail(String email) {
	if(email.contains("@yahoo.com")) {
	this.email=email;
	}else {
		System.out.println("Email must be of yahoo type");
	}	
}
public String getEmail() {
	return email;
}
public void setUserName(String userName) {
	if(!userName.isEmpty() && userName.length()>6) {
	this.UserName=userName;
}else {
	System.out.println("username cannot be empty and length shouldnot be more than 6 characters ");
}	
}
public String getUserName() {
	return UserName;
}
public void setPassWord(String PassWord) {
	if(!PassWord.isEmpty()){
		if(!(PassWord.length()>(6 ))){
			if(PassWord.contains(UserName)){
	this.PassWord=PassWord;
	}else {
		System.out.println("PassWord cannot contain username");
	}
		}else {
		System.out.println("PassWord length is less than 6");
	}
	}else {
				System.out.println("Password is empty");
			}
		
	}
	
public String getPassWord() {
	return PassWord;
}
}
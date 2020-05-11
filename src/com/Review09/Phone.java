package com.Review09;

public class Phone {
	private String serialNumber;
	private String brand;
	double price;
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String Password) {
		String result="";
	//	if(this.password.equals(password)) {
			result=serialNumber;
//		}else {
			result="Invalid Access!!!";
		}
//		return result;
		
//	}
	public Phone(String serialNumber,String brand) {
		this.serialNumber=serialNumber;
		this.brand=brand;
//		this .password=password;
	}
	public void displayInfo() {
		System.out.println("this a "+ this.brand+"phone with serial number "+serialNumber);
		System.out.println("it costs "+price);
	}
	//getters and setters
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}

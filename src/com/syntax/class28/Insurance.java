package com.syntax.class28;

public abstract class Insurance {
	/*Create a class Insurance that will have an attribute as insuranceName 
	 * and unimplemented behaviour as getQuote and cancelInsurance. 
	 * Create 3 subclasses Car, Pet, Health. 
	 * Car class has it’s own attribute as carModel and Class Pet has petType attribute.
	 *  Create 3 objects of the sub classes and store them in ArrayList. 
	 *  Using for loop/advanced for loop/ iterator access all methods of the class.
	 */
	String insuranceName;
	Insurance(String insuranceName){
		this. insuranceName= insuranceName;	
	}
	public void getInsurance() {
		// TODO Auto-generated method stub
		
	}
	public abstract void getQuote();
	public abstract void cancelInsurance();
}
class Car extends Insurance{
	String carModel;
	double payment;
	Car(String insuranceName,String carModel,double payment){
		super(insuranceName);
		this.carModel=carModel;
		this.payment=payment;	
	}
	@Override
	public void getQuote() {
		System.out.println(insuranceName+" for car model "+carModel+" your monthly payment "+payment);
}
	@Override
	public void getInsurance() {
		System.out.println("You can get "+insuranceName+" Insurance next day");
	}
	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
}
class Pet extends Insurance {
	String petType;
	double payment;
	Pet(String insuranceName,String petType,double payment){
			super(insuranceName);
			this.petType=petType;
			this.payment=payment;	
			// TODO Auto-generated constructor stub
		}
@Override
public void getInsurance() {
	System.out.println(insuranceName+" insurance's quote for the Pet "+petType+ " your monthly payment"+payment);	
}
@Override
public void getQuote() {
	System.out.println("You can get "+insuranceName+" Insurance after you provide us with payment "+payment);
}
@Override
public void cancelInsurance() {
	// TODO Auto-generated method stub
	
}
}
class Health extends Insurance{
	int age;
	double payment;
	Health(String insuranceName,int age,double payment) {
		super(insuranceName);
		this.age=age;
		this.payment=payment;// TODO Auto-generated constructor stub
	}
	@Override
	public void getQuote() {
		System.out.println();	
	}
	@Override
	public void getInsurance() {
		// TODO Auto-generated method stub
		System.out.println();
	}
	@Override
	public void cancelInsurance() {
		// TODO Auto-generated method stub
		
	}
	
}

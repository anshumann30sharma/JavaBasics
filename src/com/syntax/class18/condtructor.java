package com.syntax.class18;

public class condtructor {

	public condtructor(){
		System.out.println("public condtructor");
	}
	 condtructor(int num){
		 System.out.println("Defaultcondtructor");
	 }
	 protected condtructor(int num,int num1) {
		 
	 }
	 private  condtructor(String str) {
		 System.out.println("private condtructor");
	 }
	 public static void main(String[] args) {
		condtructor obj=new condtructor();
		condtructor obj1=new condtructor(12);
		condtructor obj2=new condtructor(12,13);
		condtructor obj3=new condtructor("Hi");
		
		
	}
}

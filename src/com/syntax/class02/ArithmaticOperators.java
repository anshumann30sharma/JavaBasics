package com.syntax.class02;

public class ArithmaticOperators {
public static void main(String[]args) {
	//Write a Java program to add, subtract, multiply and divide 2 decimal values. 
	//Your program should say. “The _______ of 2 numbers ___ and ___ is equal to _____”
	double n1,n2,add,sub,mul,div;
	
	
	n1 =10.56;
	n2 =20.66;
	
	add=n1+n2;
	sub= n1-n2;
	mul=n1*n2;
    div=n1/n2;
		
	System.out.println("The total of 2 numbers "+n1+" and "+n2+" is equql to "+add);
	System.out.println("The sub of 2 numbers " +n1+" and "+n2+" is equql to "+sub);
	System.out.println("The mul of 2 numbers "+n1+" and "+n2+" is equql to "+mul);
	System.out.println("The div of 2 numbers "+n1+" and "+n2+" is equql to "+div);
	
	
			
}
}

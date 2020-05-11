package com.syntax.class22;

import javax.swing.text.View;

public class CreditCardTest {
	/***
	Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance. 
	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
	Call the method by creating an object of each of the three classes.
	***/
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			CreditCard c=new CreditCard();
			c.calculateInterest(800);
			Visa v=new Visa();
			v.calculateInterest(800);
			AX a= new AX();
			a.calculateInterest(800);
		}
	}



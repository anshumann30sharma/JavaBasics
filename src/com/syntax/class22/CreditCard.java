package com.syntax.class22;

public class CreditCard {
		double balance, interest;
//		Creditcard(double balance,double interest){
//			this.balance=balance;
//			this.interest=interest;
//		}
		void calculateInterest(double balance) {
			this.balance=balance;
			if (balance<1000) {
				interest=balance*0.1;
			}else {
				interest+=0;
			}
			System.out.println("You interest on current "+balance+" is "+interest);
		}
	}
	class Visa extends CreditCard {
	}
	class AX extends CreditCard {
		@Override
		void calculateInterest(double balance) {
			this.balance=balance;
			if (balance<1000) {
				interest=balance*0.2;
			}else {
				interest+=0;
			}
			System.out.println("You interest on current "+balance+" is "+interest);
		}
	}

		
	


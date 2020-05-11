package com.syntax.class25;

public interface Trustable {
	//by default compiler shall add it
void trust();
}
interface Bank extends Trustable{
	void deposit();
	void withdraw();
}
class BOA extends Finance implements Bank, CreditUnion{
	public void trust() {
		System.out.println("BOA is trustable");
	}	
	public void deposit() {
		System.out.println("You can make a deposit inBOA");
	}
	public void withdraw() {
		System.out.println("you can withdraw from BOA");
	}
	public void giveCredit() {
		System.out.println("BOA gives Credit");
}
}
interface CreditUnion{
	public void giveCredit();
}
class Finance{
	public void financing() {
		System.out.println("Dealing with financing");
	}
}

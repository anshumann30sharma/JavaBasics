package com.syntax.class17;

public class StaticKeywoedTest {

	public static void main(String[] args) {
		//access static members of another class
		StaticKeyword.brand="Androids";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGeneralInfo();
		//access instance members of another class
		StaticKeyword sk=new StaticKeyword();
sk.color="red";
sk.memory=128;
sk.displaySpecifications();
StaticKeyword sk1=new StaticKeyword();
sk1.color="red";
sk1.memory=128;
sk1.displaySpecifications();
StaticKeyword sk2=new StaticKeyword();
sk2.color="red";
sk2.memory=128;
sk2.displaySpecifications();
sk2.brand="Nokia";
//not the right way to access static methods
sk2.displaySpecifications();
sk1.displaySpecifications();
sk.displaySpecifications();
	}

}

package com.syntaxclass14;

public class Store {

	public static void main(String[] args) {
		// create an object-instantiate
		//iphone a reference variable
		phone iphone=new phone();
		iphone.brand="iPhone";
		iphone.color="Black";
		iphone.model="Xmax";
		iphone. year= 2020;
		iphone.dial();
		iphone.text();
		iphone.pics();
		
		phone andriod=new phone();
		andriod.brand="Samsung";
		andriod.color="Grey";
		andriod.model="Note10";
		andriod. year= 2019;
		andriod.dial();
		andriod.text();
		andriod.pics();
		
	}

}

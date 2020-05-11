package com.syntax.class020;

public class CarObjects {
	 String model;
	  double price;
	  int quantity;
	
	   CarObjects(String model,String string,double d){
	     this.model=model;
	 //    this.price=string;
	  //   this.quantity=d;
	     System.out.println( "model"+""+ string+""+ d);
	   }
	   void carStockValue(double totalValue){
	//    double  totalValue1=price*quantity;
	
	 //   "Parent Constructor without argument"
	   }
	   void displayInfo(double totalValue1) {
		   System.out.println("Result "+totalValue1);
	   }
	}


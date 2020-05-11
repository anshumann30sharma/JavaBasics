package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceArrayList {

	public static void main(String[] args) {
		ArrayList<Insurance>insurance=new  ArrayList<>();
		insurance.add(new Car("Maruti","XL",303.33));
		insurance.add(new Pet("Pet's Health","Dog",30.03));
		insurance.add(new Health("Naveen",40,54));
		System.out.println("----Using for loop---");
				System.out.println();
				
for(int i=0;i<insurance.size();i++) {
insurance.get(i).getQuote();
insurance.get(i).getInsurance();
System.out.println();
}
System.out.println("----Using advance for loop---");
for(Insurance i:insurance) {
	i.getQuote();
	i.getInsurance();
	System.out.println();
}
System.out.println("----Using iterator---");
Iterator <Insurance> it=insurance. iterator();
while(it.hasNext()) {
	Insurance ins=it.next();
	ins.getQuote();
	ins.getInsurance();
	System.out.println();
	
}
}
}
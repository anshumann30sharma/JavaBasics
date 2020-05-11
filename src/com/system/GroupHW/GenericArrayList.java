package com.system.GroupHW;

import java.util.ArrayList;

public class GenericArrayList {
	/* HW-April-11-2020:
	Create a generic ArrayList that will store 5 names into it. 
	Find out whether the given ArrayList is empty or not? 
	Check whether the specific name is present in an ArrayList or not?
	Find the size of your arrayList and print all values from that
*/

	public static void main(String[] args) {
		ArrayList<String> name=new ArrayList<>();
		name.add("Ahmet");
		name.add("Hafiz");
		name.add("Anshuman");
		name.add("Ilkhomdzhon");		
		name.add("Umedchon");
		//Checking ArrayList is empty or not?
		System.out.println("ArrayList name is empty?==> "+name.isEmpty());
		System.out.println("=========================================");
		//Checking iff ArrayList Contains Specific name or not?
		System.out.println("is name ArrayList contains Ahmet? : "+name.contains("Ahmet"));
		System.out.println("=========================================");
		//printing ArrayList Size
		System.out.println("Size of ArrayList, name is: "+name.size());
		System.out.println("=========================================");
		//Printing all value from of the ArrayList
		System.out.println("The value of ArrayList are: "+name);
	}
}


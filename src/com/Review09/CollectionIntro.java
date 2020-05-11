package com.Review09;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIntro {

	public static void main(String[] args) {
		ArrayList<String> europe=new ArrayList<String>();//empty arraylist
		//ArrayList<String> asia=null;//we dont have an object yet	
		//null pointer exception
		ArrayList<String>asia=new ArrayList<>();
		asia.add("China");
		asia.add("India");
		asia.add("Japan");
		asia.add("SriLanka");
		asia.add("Japan");
		asia.add("Afganistan");
		System.out.println(asia);
		System.out.println("Europe size is "+europe.isEmpty());
		europe.add("Albania");
		europe.add("France");
		europe.add("Spain");
		europe.add("Portugal");
		europe.add("Turkey");
		europe.add("Deutschland")
;		System.out.println("Europe size is "+europe.size());
		europe.remove("Turkey");
		//europe.remove(4);
		System.out.println("Europe size is "+europe.size());	
		System.out.println(europe);
		//europe.clear();
		//Ist way
		for(int i=0;i<europe.size();i++) {
			String country=europe.get(i);
			System.out.print(country+" ");
			
		}
		System.out.println();
		//2nd way
		for(String country:europe) {
			System.out.print(country+ " ");
		}
		//3rd way
		Iterator<String> it=europe.iterator();
		//it.next();//will return the next element from the collection. Will move the cursor
		//it.hasNext();//will return true/false
	//it.remove();// will remove the element while iterating

		String country1=it.next();
String country2=it.next();
if(it.hasNext()) {
String country3=it.next();
System.out.println(country1+" "+country2+" "+country3);
	}
Iterator<String> it2=europe.iterator();
while(it.hasNext()) {//as long as there is next element.This will not move the cursor
String country=it.next();
System.out.println(country+" ");
}
System.out.println();
	}}
//HW-add countries into Asia, add duplicates
//iterate the Asia list and remove duplicates.
//copy from Asia into new list, but first check if the list CONTAINS the country


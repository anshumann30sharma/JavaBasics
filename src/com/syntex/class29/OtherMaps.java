package com.syntex.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		//store student Id and corresponding name
		//Linked HashMap preserves insertion order
		Map<Integer,String>lmap=new LinkedHashMap<>();
		lmap.put(1000,"John Smith");
		lmap.put(1001,"Jane Smith");
		lmap.put(1002,"Faisal Sakhi");
		lmap.put(102,"Ali Tarlaci");
		
		System.out.println(lmap);
		//store objects in form of K and V and you want to sort keys in ascending order
		Map<Integer,String>tmap=new TreeMap<>();
		tmap.put(1000,"John Smith");
		tmap.put(1001,"Jane Smith");
		tmap.put(1002,"Faisal Sakhi");
		tmap.put(102,"Ali Tarlaci");
		System.out.println(tmap);
		//keys are sorted
		
		//create a map of country and population and sort countries in alphabetical order
		Map<String,Integer>population=new TreeMap<>();
		population.put("USA",3300000);
		population.put("Kajakistan",1800000);
		population.put("India",1326000000);
		population.put("Afganistan",370000);
		System.out.println(population);
	}
}


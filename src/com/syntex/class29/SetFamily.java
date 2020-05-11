package com.syntex.class29;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetFamily {

	public static void main(String[] args) {
		//HashSet doesn't guarantee insertion order
		Set<String>veggies=new HashSet<>();
		veggies.add("carrot");
		veggies.add("potatoes");
		veggies.add("cucumbers");
		veggies.add("eggplant");
		veggies.add("carrot");
		veggies.add("cucumbers");
		
		System.out.println(veggies);
		//LinkedHashSet guarantee insertion order
		Set<String>fruits=new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("apple");
		
		System.out.println(fruits);
		//tree stores objects in ascending order
				
		Set<String>food=new TreeSet<>(veggies);
		//adding duplicates from veggies collection not implemented
		food.addAll(veggies);
		food.addAll(fruits);
		System.out.println(food);
	}

}

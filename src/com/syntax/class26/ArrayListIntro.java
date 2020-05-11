package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
//create an arrayList to store numbers
		ArrayList<Integer>numbers=new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(20);
		numbers.add(30);
		
		System.out.println(numbers.contains(30));
;		for(int i=0; i<numbers.size(); i++) {
			int num=numbers.get(i);	
			System.out.println(i);
		}
		for(Integer num:numbers) {
			System.out.println(num);
		}
	}
}

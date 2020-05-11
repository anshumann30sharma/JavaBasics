package com.syntax.class26;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<>();
		//adding String Objects into arrayList
		arrayList.add("John");
		arrayList.add("Gilbahar");
		//access element from arrayList
		String secondElement=arrayList.get(1);
		System.out.println(secondElement);
		// how to get number of elements inside list
		int size=arrayList.size();
		System.out.println(size);
		
		arrayList.remove("John")
;			System.out.println(arrayList.size());

arrayList.add("Hichem");
System.out.println(arrayList);

arrayList.add("Ahmad");
System.out.println(arrayList);


arrayList.set(1,"Hichem");
System.out.println(arrayList);
		
		// how to retrieve values from arrayList 1 by 1?
for(int i=0;i<arrayList.size();i++) {
	String element=arrayList.get(i);
	System.out.println(element);
}
	System.out.println("______________");	
	for(String str:arrayList) {
		System.out.println(str);
	}
	}

}

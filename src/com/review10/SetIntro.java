package com.review10;

import java.util.*;

public class SetIntro {

	public static void main(String[] args) {
	//                                              Collection
		//List                |                     Set                        |            Queue
		//ArrayList     LinkedList     |    HashSet    LinkedHashSet        TreeSet
		
		
		Set<String>africa=new HashSet<>();
		africa.add("Tunisia");
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Algeria");
		//you cannot add with an index !!!
		//africa.add(2,"Egypt");No duplicates in Set
		System.out.println(africa);
		
		 Set<String>africa2=new LinkedHashSet<>();
		
		int size= africa.size();
		boolean contains= africa.contains("Kenya");
		 boolean isEmpty=africa.isEmpty();
		boolean ableToRemove= africa.remove("Algeria");
		
	//	for regular doesnot work because set has no index
		//advanced for loop
		for(String country : africa) {
			System.out.println(country +" ");
		}
		System.out.println();
		 //iterator
		Iterator<String> it=africa.iterator();
		if (it.hasNext()) {//while can be used in place of if
		String country=it.next();	
		System.out.println(country + " ");
	}
// List preserves insertion order, set doesnot
		//List contains duplicates, set doesnot
		Set<String>europe=new HashSet<>();
		europe.add("Albania");
		europe.add("France");
		europe.add(null);
		europe.add("Spain");
		europe.add(null);
		//TreeSet doesnot allow null
		System.out.println(europe);
		
		//Collection Framework
		//Collection is class
		//Collection interface
		//Collections,
		String minimum=Collections.min(africa);
		System.out.println(minimum);
		Set<Integer> numbers=new HashSet<>();
		numbers.add(56);
		numbers.add(23);
		numbers.add(4);
		for(Object obj :numbers) {
			System.out.println(obj);
		}
		Integer minInt=Collections.min(numbers);
		Integer maxInt=Collections.max(numbers);
		System.out.println("Numbers from " +minInt+" to "+ maxInt);
}
}

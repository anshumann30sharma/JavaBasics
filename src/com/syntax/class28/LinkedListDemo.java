package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

import com.system.GroupHW.Food;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist=new LinkedList<>();
		llist.add("Yunus");//comes from Collection
		llist.add(0,"Rehan");// adding at specified index--comes from List
		llist.add("Pavel");
		llist.add("Pavel");
		
		int size=llist.size();
		System.out.println(size);
			//get all elements 1 by 1,3 different ways
		for ( String a:llist) {	
//System.out.println(llist.get(a));
}
	Iterator<String> it=llist.iterator();
while(it.hasNext()) {
	String s=it.next();
}
System.out.println();
	
	for(int i=0;i<llist.size();i++) {
}
	}
	
}
//	System.out.println(llist.get(i));
package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store{
	String type,name;
	Store(String type,String name){
		this.name=name;
		this.type=type;
		
	}
	public void display() {
		System.out.println("This is store "+name);
	}
	public abstract void workingHours();
}
class Nike extends Store{

	public Nike(String type, String name) {
		super(type, name);
		
	}

	@Override
	public void workingHours() {		
		System.out.println(name+"works from 10 am till 6 pm");
	}
	
}
class Costco extends Store{

	Costco(String type, String name) {
		super(type, name);
	
	}

	@Override
	public void workingHours() {
		System.out.println(name+"works from 8 am till 8 pm");
		
	}	
}
class Amazon extends Store{

	Amazon(String type, String name) {
		super(type, name);	
	}

	@Override
	public void workingHours() {
		System.out.println(name+"works 24/7");	
	}
}
public class UserDefinedClassesMap {
	public static void main(String[] args) {
		//we want to store stores in form1-Amazon,2-Costco,3--Nike
		Map<Integer,Store>storeMap=new LinkedHashMap<>();
		storeMap.put(1,new Amazon("online","Amazon"));
		storeMap.put(2,new Costco("wholesale","Costco"));
		storeMap.put(3,new Nike("retail","Nike"));
		System.out.println(storeMap);
		
	//to get an access to all methods of store methods: .values(), keySet(), entrySet()
//1.way--get all value objects
		Collection<Store>col=storeMap.values();
		for(Store store:col) {
			store.workingHours();
			store.display();
			System.out.println("_______________________");		
		}
	//2.way----get all Entry Objects---get value
		Set<Entry<Integer,Store>>storeSet=storeMap.entrySet();
		for(Entry<Integer,Store>entry:storeSet) {
		entry.getValue().workingHours();
		entry.getValue().display();
		System.out.println("_____________");
			
		}
	//	3.Way--get all Keys---get value of specified key
		Set<Integer>keys=storeMap.keySet();
		for(Integer key:keys) {		
			Store obj=storeMap.get(key);
			obj.display();
			obj.workingHours();
			System.out.println("__________________");
			
		}	
	}
	}



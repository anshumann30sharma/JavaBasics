package com.syntax.class28;

import java.util.HashSet;
import java.util.Iterator;

public class StoringDifferentObjects {

	public static void main(String[] args) {
		HashSet<Insurance>hset=new HashSet<>();
		hset.add(new Car("Comprehensive Insurance","BMW",800));
		hset.add(new Pet("Progressive Insurance","Dog",444));
		hset.add(new Health("Life Insurance ",4,4.40));
		
		System.out.println(hset.size());
		
		Iterator<Insurance>it=hset.iterator();
		while(it.hasNext()) {
			//System.out.println(it.next());
	Insurance obj=it.next() ;
	obj.getQuote();
	obj.cancelInsurance();
	obj.getInsurance();
	System.out.println("______");
			//obj.display not available to insurance type
		
	
		}
	}

}

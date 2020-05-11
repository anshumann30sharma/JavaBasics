package com.syntax.class27;
import java.util.ArrayList;
import java.util.Iterator;
public class FlowerTest {
	public static void main(String[] args) {
		System.out.println("=====Home work-1=========================");
		Flower tulip = new Tulip("Tulip");
		Flower rose = new Rose("Rose");
		Flower sunflower = new Sunflower("sunflower");
		Flower[] flr = { tulip, rose, sunflower };
		ArrayList<Flower> flower = new ArrayList<>();
		flower.add(new Tulip("Tulip"));
		flower.add(new Rose("Rose"));
		flower.add(new Sunflower("Sunflower"));
		System.out.println("=======Advanced for loop===========");
		for (Flower a : flower) {
			a.bloom();
		}
		System.out.println("=====Using For Loop========");
		for (int i = 0; i < flower.size(); i++) {
			flower.get(i).bloom();
		}
		System.out.println("=====Using Iterator========");
		Iterator<Flower> flower1 = flower.iterator();
		while (flower1.hasNext()) {
			flower1.next().bloom();
		}
	}
}
		

package com.system.GroupHW; 
	import java.util.ArrayList;
	import java.util.Iterator;
	public class FoodTest {
		public static void main(String[] args) {
			ArrayList<Food> food=new ArrayList<>();
			food.add(new Apricots("Apricots"));
			food.add(new SeaFood("SeaFood"));
			food.add(new Strawberries("Strawberries"));
			food.add(new Asparagus("Asparagus"));
			System.out.println("====Using For each Loop(1st Way)===========");
			for (Food a:food) {
				a.eat();
				a.vitamin();
				a.availablility();
				System.out.println("================================");
			}
			System.out.println("====Using Iterator(2nd way)===========");
			Iterator<Food> food1=food.iterator();
			while(food1.hasNext()) {
				Food s=food1.next();
				s.eat();
				s.vitamin();
				s.availablility();
				System.out.println("================================");
			}
			System.out.println("====Using Regular for loops(3rd way)===========");
			for(int i=0;i<food.size();i++) {
				food.get(i).eat();
				food.get(i).vitamin();;
				food.get(i).availablility();;
				System.out.println("================================");
			}
		}
	}

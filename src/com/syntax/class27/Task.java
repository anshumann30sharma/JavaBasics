package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
	
		public static void main(String[] args) {
			//Create an arraylist of cars and retrieve all the values using 3 different ways.
			
			ArrayList <String> cars = new ArrayList<>();
			
			cars.add("Toyota");
			cars.add("Mercedes");
			cars.add("BMW");
			cars.add("Mazda");
			cars.add("Chevy");
			cars.add("Ford");
			cars.add("GM");
			cars.add("Reno");
			
			// 1. for loop
			for (int i =0; i < cars.size(); i++) {
				System.out.print(cars.get(i)+", ");
			}
			
			System.out.println();
			System.out.println("-----------------------------");
			//2. Advance for loop
			for (String car : cars) {
				System.out.print(car+", ");
			}
			
			System.out.println();
			System.out.println("-----------------------------");
			//3. iterator
			Iterator<String> car = cars.iterator();
			while(car.hasNext()) {
				System.out.print(car.next() + ", ");
			}
			
			System.out.println();
			System.out.println("*******************************************");
			
		}
}


			
			
package com.syntaxclass10;

public class Recap {
	public static void main(String[] args) {
		int[] grades = new int[4];
		grades[0] = 90;
		grades[1] = 67;
		grades[2] = 89;
		grades[3] = 78;
		// what is average
		int average = (grades[0] + grades[1] + grades[2] + grades[3]) / 4;
		System.out.println("Average grade is " + average);
		// -------------------------
		System.out.println("---------Creating an array of cities");
		String[] cities = { "washington dc ", "Paris", "New York", "Miami", "LA", "Dallas", "Chantilly" };
		System.out.println("I live in " + cities[2]);

		// how many elements stored inside array
		int arraySize = cities.length;// 7

		System.out.println("Total elements " + arraySize);
//how can we access last element from an array
		System.out.println(cities[arraySize - 1]);
// access all elements from an array
		for (int i = 0; i < arraySize; i++) {
			System.out.println(cities[i]);

		}
	}

}

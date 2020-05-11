package com.syntaxclass10;

public class Task {
	public static void main(String[] args) {
		// array of animals
		// store 6 elements into it
		// using 2 different loops print all elements from the array
		String[] animals = { "Elephant", "Tiger", "Dog", "Cat", "Horse", "Cow" };
		int allAnimals = animals.length;
		for (int i = 0; i < allAnimals; i++) {
			System.out.println(animals[i]);
		}
		//second method
		for(String animal:animals) {
			System.out.println(animal);
		}
	}
}

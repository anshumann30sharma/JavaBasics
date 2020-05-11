package com.syntaxclass10;

public class task2 {

	public static void main(String[] args) {
		// create a string of countries
		// create a string of capitals of these countries
		String[] country = { "USA", "UK", "India", "France" };

		for (String countries : country) {
			if (countries.equals("USA")) {
				System.out.println("The capital of " + countries + " is Washington");
			} else if (countries.equals("UK")) {
				System.out.println("The capital of " + countries + " is London");
			} else if (countries.equals("India")) {
				System.out.println("The capital of " + countries + " is New Delhi");
			} else if (countries.equals("France")) {
				System.out.println("The capital of " + countries + "is Paris");
			}

		}
		for (int y = 0; y < country.length; y++) {
			switch (country[y]) {
			case "USA":
				System.out.println("The capital is New York");
				break;
			case "UK":
				System.out.println("The capital is London");
				break;
			case "India":
				System.out.println("The capital is New Delhi");
				break;
			case "France":
				System.out.println("The capital is Paris");
				break;

			}
		}

	}

}

package com.syntax.class11;

public class task1 {

	public static void main(String[] args) {
		/*
		 * Create an array of cars : american, german, korean, italian. Then retrieve
		 * all values from that array using 2 different loops
		 */
		String[][] cars= {
				{"Ford", "Chevrolet","Chrysler","Cadillac"}, 
				{"BMW", "Audi", "Mercedes-Benz", "Porsche"}, 
				{"Hyundai", "Kia", "Daewoo"}, 
				{"Ferrari","Fiat", "Lamborghini", "Maserati" }
				};
		for (String[] car:cars) {
			for (String car1:car) {
				System.out.print(car1+", ");
			}
		System.out.println();
		}
		System.out.println("===Class task-1======2nd way=========");
		for (int i=0;i<cars.length;i++) {
			for (int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+",  ");
		}
		System.out.println();
	}

	}

}

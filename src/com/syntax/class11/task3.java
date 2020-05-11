package com.syntax.class11;

public class task3 {

	public static void main(String[] args) {
		String [][] countries= {
				{"USA", "Canada", "Mexico"},
				{"Brazil", "Columbia", "Cuba", "Chile"},
				{"Germany", "France", "Italy", "UK"},
				{"Japan", "China", "Korea"},
				{"Zimbabwe", "Kenya", "Uganda"},
		};
		for (int r=0; r<countries.length; r++) {
			for (int c=0; c<countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
			}
			System.out.println();
		}
		for (String [] array:countries) {
			for (String state:array) {
				System.out.print(state+ " ");
			}
			System.out.println();
		}

	}

}

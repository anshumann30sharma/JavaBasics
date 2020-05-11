package com.syntax.class06;

import java.util.Scanner;

public class SwitchWITHsTRINGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* ASK THE USER WHERE HE OR SHE IS FROM
 * based on the country we will define favorite food
 * Your favorite food is---
 */
		 Scanner scan;
	        String country;
	        String favoriteFood;
	        scan = new Scanner(System.in);
	        System.out.println("Please enter your country");
	        country = scan.nextLine();
	        switch (country) {
	        case "Morocco":
	            favoriteFood = "couscous";
	            break;
	        case "Belarus":
	            favoriteFood = "Potato";
	            break;
	        case "Tajikistan":
	            favoriteFood = "Osh";
	            break;
	        case "Turkey":
	            favoriteFood = "Baklava";
	            break;
	        case "Afghanistan":
	            favoriteFood = "Mantu";
	            break;
	        case "Kazakhstan":
	            favoriteFood = "Beshparmak";
	            break;
	        default:
	            favoriteFood = "Unknown";
	        }
	        
	        System.out.println("Your favorite food is "+favoriteFood);
	    }
	}

	



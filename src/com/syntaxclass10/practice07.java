package com.syntaxclass10;

import java.util.Scanner;

public class practice07 {

	public static void main(String[] args) {
		/*Write a program that creates a String array with size 7. 
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array

Example:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday etc

Example Output:
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
*/

		Scanner input=new Scanner(System.in);
		System.out.println("Please enter day number of the week");
		
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		
		for(int s=0; s<days.length; s++){
        	System.out.println(days[s]);
        	days[s] = input.nextLine();

        		System.out.println("Sunday");
        		
        	}
		System.out.println();
		
		for(int s=1; s<days.length; s++){
        	System.out.println(days[s]);
        	days[s] = input.nextLine();

        		System.out.println("Monday");
        		
	}

}
}

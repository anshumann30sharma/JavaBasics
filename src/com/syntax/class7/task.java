package com.syntax.class7;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create boolean variable
		// assign true 
		//create int varaible day
		//assign it to 1
		//as long as it is workday print"I need a day off" and increase day
		//Once day is 6 print"I do not need a day off any more"
		boolean workday=true;
		int variableday=1;
		while (workday) {
			
			if (variableday<6) {
				System.out.println("I  need a day off ");
			}else {
				System.out.println("I do not need a day off");
				workday=false;
			}
			variableday++;
		}
		
	}

}

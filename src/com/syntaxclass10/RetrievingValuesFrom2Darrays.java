package com.syntaxclass10;

public class RetrievingValuesFrom2Darrays {

	public static void main(String[] args){
		String[][] month= {{"dec,jan,feb"},{"march,april,may"},
		           {"june,july,august"},{"sept,oct,nov"}};
int rows=month.length;//how many arrays
int firstArray=month[3].length;
System.out.println(month.length);
System.out.println(firstArray);
for(int i=0;i<month.length;i++) {//iterates rows
	for(int j=0;j<month[i].length;j++) {//iterates columns
		System.out.println(month[i][j]+" ");
	}
	System.out.println();
}
	}

}

package com.syntax.class17;

public class practice03 {

	public static void main(String[] args) {
	String[] names= {"hey","yolo","hi","this is long"};
	String maxLength=getmaxLength(names);
	System.out.println("maxLength string : "+maxLength);
	
	
	}
public static String getmaxLength(String[] array) {
	int index=0;
	int element=array[0].length();
	for(int i=1;i<array.length;i++) {
		if(array[i].length()>element) {
			index=i;
			element=array[i].length();
			
		}
	}
	return array[index];
}
}

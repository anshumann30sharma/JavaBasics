package com.syntax.class23;

public class FinalKeyword {

public static String str="Hello";
 static final String str1="Bye";//final variable=constant variable

public static final String APPLICATION_URl="https://syntaxtechs.com";
 final char GRADE='A';


public static void main(String[] args) {
	str="Hi";
	//str1="Good bye";CE
	//APPLICATION_URl="https://syntaxtechs.com"
}

public final void hello() {
	System.out.println("I am a final Method");
}
public final void hello(String name) {
	System.out.println("Hello"+name);
}
}
class SubClass extends FinalKeyword{
	//public void hello( { CE :cannot override final method
	
	public void hello(int num) {
		System.out.println("hello of child class");
	}
}




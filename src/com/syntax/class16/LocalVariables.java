package com.syntax.class16;

public class LocalVariables {
	
void nameInside() {
	
	String name="John";
}
void anotherName() {
	String name="John";
	
}

public static void main(String[]args) {
	
	//System.out.println(name);CE:name won't be visible to another method
	// since its scope only within nameInside method
	
	LocalVariables obj=new LocalVariables();
	obj.nameInside();
	boolean flag=true;
	if(flag) {
		String answer="Yes";
		
	}
			
			//System.out.println(answer);//CE:scope of variable not visible outside if block
	
	for(int i=1;i<=5;i++) {
		System.out.println(i);
	}
	for(int i=1;i<=5;i++) {
		System.out.println(i);
}
	String name="Gulbahar";
}
}



package com.review11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		String projectPath=System.getProperty("user.dir");
		System.out.println(projectPath);
		
		String filePath=projectPath+"/Extra/demoProperties";
		System.out.println(filePath);
		
		FileInputStream filesIS=new FileInputStream(filePath);
		
		Properties proper=new Properties();
		proper.load(filesIS);
		System.out.println(proper);
		//ist way.Get the value as Object and downcast into a Str
		String lastname=(String)proper.get("LastName");
		System.out.println("LastName--> " +lastname);
		//2nd way.Get the value as a String
		String firstname=proper.getProperty("FirstName");
		System.out.println("FirstName--> " +firstname);
		
		String school=proper.getProperty("School|Syntax");
		System.out.println("School|Syntax--> " +school);
		//1st way  Use getProperty to age as a String
		String age1=proper.getProperty("Age");//get.property returns string only
		System.out.println("age1  "+age1);
		//2nd way Use method to get age as an Object
		String  age2=(String) proper.get("Age");
		System.out.println("age2 " +age2);
		//Add more key--->value pairs
			proper.setProperty("StudentNumber","123" );
			System.out.println(proper);
			//or we can reassign
			proper.setProperty("FirstName","Omar");
			System.out.println(proper);
			
			//Let's write back into properties file
			//FileOutputStream fileOS=new FileOutputStream(filePath);
		//	proper.store(fileOS,"HI there");
			//System.out.println("Done");
			
	

}
}
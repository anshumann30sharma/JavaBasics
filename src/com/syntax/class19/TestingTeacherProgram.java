package com.syntax.class19;

public class TestingTeacherProgram {
	public static void main(String[] args) {
		System.out.println("==Parent class--Testing========================");
		//TeacherParentClass teacher=new TeacherParentClass();
	//	teacher.displayParent();
		System.out.println("\n==MathTeacher Sub Class--Testing=======================");
	//	MathTeacherSubClass teacher1=new MathTeacherSubClass();
//		teacher1.displayParent();
//		teacher1.print("Math");
		System.out.println("\n==ChemistryTeacher Sub Class--Testing=======================");
	//	ChemistryTeacherSubClass teacher2=new ChemistryTeacherSubClass();
	//	teacher2.displayParent();
		//teacher2.print("Chemistry");//can't inherit
	//	teacher2.testing();
		System.out.println("\n==PianoTeacher Sub Class--Testing=======================");
	//	PianoTeacherSubClass teacher3=new PianoTeacherSubClass();
		//teacher3.displayParent();
		//teacher3.play();
	}
//}

	

	//	System.out.println("this constructor is from Parent class(TeacherParentClass)");
	//}
	void displayParent() {
	//	schoolName = "Syntax technologies.";
	//	address = "14120 Newbrook Dr Suite 210, Chantilly, VA 20151";
		System.out.println("\nthis is from TeacherParentClass\n==================");
	//	System.out.println("School Name= " + schoolName + "\n" + "Address is: " + address);
	}
//}
//public class MathTeacherSubClass extends TeacherParentClass {
//	String name, courseName;
//	void print(String courseName) {
//		this.courseName=courseName;
	//	System.out.println("============\nI teach "+courseName+"// (Method from 'MathteacherSubClass'.)");
	//}
	//MathTeacherSubClass(){
	//	System.out.println("This constructor is from MathTeacherSubClass. ");
//	}
//}
//public class ChemistryTeacherSubClass extends TeacherParentClass {
	//String lab;
	void testing() {
	//	lab="Chemistry";
//		System.out.println("============\nThis method is from "+lab+" Teacher Sub Class.");
	}
	//ChemistryTeacherSubClass(){
	//	System.out.println("This constructor is from ChemistryTeacherSubClass. ");
//	}
//}
//public class PianoTeacherSubClass extends TeacherParentClass {
	String instrument;
	void play() {
		instrument="Piano";
		System.out.println("============\nWe play "+instrument+" \\ this is from PianoTeacherSubClass\\");
	}
	//PianoTeacherSubClass(){
	//	System.out.println("This constructor is from PianoTeacherSubClass. ");
	}
//}


package com.syntax.class09;

public class MoreArrays {

	public static void main(String[] args) {
		//arrays are fixed in size
		String[]students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron";during run time java machine machine will give
		//array IndexOutOfBoundException
		//System.out.println(students[3]);
		
		String[] inClassStudents=new String[5];
		inClassStudents[1]="Hichem";
		inClassStudents[2]="Tetteh";
		//compiler adds default value:null
		System.out.println(inClassStudents[0]);
		

	}

}

package com.syntax.class15;

public class CreatingMethods {
//we want to create a method that will accept marks
	//based on the marks it will return grade9A,B,C)
	//if grade is more than 90, if grade is more than 80_->B,if more than 80<70--C
	void getGrade(int a) {
		char grade;
			
	if (a>90) {
		grade= 'A';
	}else if(a>80 && a <90) {
		grade=('B');
	}else if(a>70 && a<80) {
			grade ='C';	
		

	}
}
}


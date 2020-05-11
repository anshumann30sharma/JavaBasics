package syntaxclass3;

public class CompareNumbers {
public static void main(String[] args) {
	double numberOne=10;
	double numberTwo=10;
	if (numberOne>numberTwo) {
		System.out.println("number One is larger than number 2");
	}else  if(numberOne<numberTwo){
		System.out.println("number One smaller than number 2");
	}else {
 
		System.out.println("Numbers are equal");
	}
	System.out.println("----------------------------");
	//declare variable for a day and then based on the value we will be
	//output
	int day=6;
	if(day==1) {
		System.out.println("it is Monday, no class today");
	}else if (day==2) {
		System.out.println("It is Tuesday, we have SDLC Class");
	}else if(day==3) {
		System.out.println("It is Wednesday, we have SDLC Class");
	}else if(day==4) {
		System.out.println("It is Thursday, we have review class");
	}else if(day==5) {
		System.out.println("It is Friday, no class");
	}else if(day==6) {
		System.out.println("it is Saturday, we have Java Class");
	}else if(day==7) {
		System.out.println("It is Sunday, we have Java Class");
	}
			
		
	}
}


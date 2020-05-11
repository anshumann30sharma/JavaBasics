package syntaxclass3;

public class Task16 {
	public static void main(String[] args) {
		// boolean value whether user has diploma or not
		// if yes, say congratulations
		// otherwise suggest to get a degree
		// degree, check gpa score
		// if gpa>3.5 say you are eligible for scholarship
		// otherwise you should have studied harder

		boolean diploma = true;
		double gpa = 3.5;
		if (diploma) {
			System.out.println("Congratulations");
			if (gpa > 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("Get a Degree");

				}

		}
	}

package syntaxclass3;

public class nestedif {
	public static void main(String[] args) {
		boolean classToday = true;
		boolean flag = false;
		if (flag) {
			System.out.println("Hello");
			if (classToday) {
				System.out.println("Hello friends");
			} else {
				System.out.println("Hello family");
			}
		} else {
			System.out.println("Bye");
		}
		System.out.println("I am outside of if condition");

	}

}

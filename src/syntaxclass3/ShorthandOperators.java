package syntaxclass3;

public class ShorthandOperators {
	public static void main(String[] args) {
		int num=200;
		num=num+300;
		System.out.println(num);
		num=num-100;
		System.out.println(num);
		num-=100;//num=num-100;
		System.out.println(num);//300
		
		num+=50;//num=num+50
				System.out.println(num);//350
	}

}

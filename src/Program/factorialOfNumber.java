package Program;

public class factorialOfNumber {

	public static void main(String[] args) {

//factorial of number : 5*4*3*2*1
		int num = 6;
		int fact = 1;
		while (num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println(fact);

	}

}

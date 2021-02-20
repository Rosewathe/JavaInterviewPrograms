package Program;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Here is a longer list: 0, 1, 1, 2, 3, 5, 8,13,21,34
		//fibonacci series start with zero and it will grow with addtion on last 2 number
		//start loop with 2 as n1 nd n2 is printed and inside loop write logic
		
		int n1 = 0;
		int n2 = 1;
		int n3 = 0;
		int count = 2;
		System.out.print(n1 + " " + n2 + " ");
		while (count < 10) {

			n3 = n1 + n2;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
			count++;
		}
	}

}

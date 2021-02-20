package Program;

public class PrintTringleOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// print tringle of number
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		for (int i = 1; i <= 4; i++) {
			int num = 1;
			System.out.println();
			for (int j = 1; j <= i; j++) {
				System.out.print(num++);
			}
		}
	}

}

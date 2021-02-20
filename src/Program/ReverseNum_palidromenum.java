package Program;

public class ReverseNum_palidromenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 153 ;
		int temp = num;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = sum * 10 + rem;
			num = num / 10;
		}

		System.out.println(sum);
		if (sum == temp)

		{
			System.out.println(temp + "number is palidrome");
		}
	}

}

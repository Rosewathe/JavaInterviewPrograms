package Program;

public class Armstrongnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 370 ;
		int temp = num;
		int sum = 0;

		while (num > 0) {
			int rem = num % 10;
			sum = sum +rem*rem*rem;
			num = num / 10;
		}

		System.out.println(sum);
		if (sum == temp)

		{
			System.out.println(temp + " number is Armstrong");
		}
	}

}

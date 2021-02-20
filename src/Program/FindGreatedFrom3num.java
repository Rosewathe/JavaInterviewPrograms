package Program;

public class FindGreatedFrom3num {

	public static void main(String[] args) {
		
		
		//to find greatest number out of 3
		//compare a>b and a>c in 1st if and print a is greater
		// in slse if compare b>c and print b is greter
		// in else print c is greater
		
		int a = 109;
		int b = 80;
		int c = 91;

		if (a > b && a > c) 
		{
			System.out.println(" a is greater");
		}
		else if (b > c) 
		{
			System.out.println(" b is greater");
		} 
		else 
		{
			System.out.println("c is greater");
		}
	}

}

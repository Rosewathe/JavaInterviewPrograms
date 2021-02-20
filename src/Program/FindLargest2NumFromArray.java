package Program;

public class FindLargest2NumFromArray {

	public static void main(String[] args) {
		// find largest 2 number from array
		// sort string and print 1 and 1 index
		
		int[] ar = { 2, 4, 81, 5, 6, 3, 8, 9, 14 };

		int temp = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = i + 1; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		System.out.println(ar[0] + " 1st largest number");
		System.out.println(ar[1] + " 2nd largest number");
	}

}

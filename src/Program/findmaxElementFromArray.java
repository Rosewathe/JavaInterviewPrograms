package Program;

public class findmaxElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int array[] = { 2, 5, 6, 7, 39, 1, 4, 1 };
		for (int i = 0; i < array.length; i++) {

			if (max < array[i]) 
			{
				max = array[i];
			}
		}
		System.out.println(max);
	}

}

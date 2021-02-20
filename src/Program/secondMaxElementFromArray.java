package Program;

public class secondMaxElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 2, 5, 6, 7, 39, 1, 4, 40 };
		for (int i = 0; i < a.length; i++) 
		{
			for (int k = i+1; k < a.length; k++) {
				int temp = 0;
				if (a[i] < a[k])
				{
					temp = a[i];
					a[i] = a[k];
					a[k] = temp;
				}
			}
			System.out.println(a[i]);
		}
		//System.out.println(a[2]);
	}
}

package Program;

public class RemoveDuplicateElementFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hahahi";
		// Remove h and replace by space

		int count = 0;
		char[] chars = s.toCharArray();
		System.out.println("Duplicate characters are:");
		for (int i = 0; i < s.length(); i++) {

			for (int j = i + 1; i < s.length()-1; j++) {

				if (chars[i] == chars[j]) {

					System.out.println(chars[j]);

					count++;
				}
				//HashMap<> se= new HashMap<>
				
			}
		}
	}
}

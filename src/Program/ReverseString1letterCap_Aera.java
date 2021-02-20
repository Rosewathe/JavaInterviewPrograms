package Program;

public class ReverseString1letterCap_Aera {

	public static void main(String[] args) {
		// reverse the string and make

		String s = "bangolore";
		String s2 = s.substring(1, 9);
		String s3 = s.substring(0, 7).toUpperCase();

		System.out.print(s3);

		char[] sarray = s2.toCharArray();

		for (int i = sarray.length - 1; i >= 0; i--) {
			System.out.print(sarray[i]);
		}

		//using string builder
		String originalString = "abc def ghi";
		
		StringBuilder resultBuilder = new StringBuilder();
		
		for (String string : originalString.split(" ")) {
			
			String revStr = new StringBuilder(string).reverse().toString();
			revStr = Character.toUpperCase(revStr.charAt(0)) + revStr.substring(1);
			resultBuilder.append(revStr).append(" ");
		}
		System.out.println(resultBuilder.toString());
	}

}

package Program;

import java.util.HashSet;

public class DuplicateStringInStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Duplicate string from statement and remove them

		String[] strarr = { "java", "test", "java", "Test", "Sele" };

		HashSet<String> sh = new HashSet<>();
		for (int i = 0; i < strarr.length; i++) {
			sh.add(strarr[i]);
		}
		for (String s : sh) {
			System.out.println(s);
		}
	}
}

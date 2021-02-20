package Program;

import java.util.HashMap;

public class OccuranceOfEachChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is my life style";
		String s2 = s.replaceAll(" ", "");
		HashMap<Character, Integer> sh = new HashMap<Character, Integer>();
		for (int i = 0; i < s2.length(); i++) 
		{
			if (sh.containsKey(s2.charAt(i)))
			{
				int count = sh.get(s2.charAt(i));
				sh.put(s2.charAt(i), ++count);
			}
			else {
				sh.put(s2.charAt(i), 1 );
			}
		}
		sh.forEach((key, value) -> System.out.println(key + " : " + value));

	}

}

package Program;

public class StringCoomplexProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String given to remove white spaces and reverse it and only print odd
		// position character

		String s = "India is my Country";
		// to remove spaces
		String s1 = s.replaceAll(" ", "");
		StringBuilder s2 = new StringBuilder(s1);
		System.out.println(s2.reverse());
		int i=1;
		while(i<s2.length()) {
			System.out.print(s2.charAt(i));
			i=i+2;
		}

	}

}

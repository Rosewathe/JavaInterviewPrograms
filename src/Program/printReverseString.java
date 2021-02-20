package Program;

public class printReverseString {

	public static void main(String[] args) {
		String s="bangolore";
		
		//outpu : Ber
		char[] sarray= s.toCharArray();
		
		for(int i=sarray.length-1;i>=0;i--) 
		{
			System.out.print(sarray[i]);
				
			}
		
	}

}

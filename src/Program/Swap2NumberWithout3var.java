package Program;

public class Swap2NumberWithout3var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3;
		int y=5;
		
		System.out.println("before swap x="+ x+ "  y="+y);
		x=x+y;//x=8
		y=x-y; //y=5
		x=x-y; //3

		System.out.println("After swap x="+ x+ "  y="+y);
		

	}

}

package Program;

public class methodOverloading_Aera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	//Its will give compile time error --> duplicate method name
	public String Test1(String a,String b)
	{
		String s="New";
		return s;
	}
	public void Test1(String a,String b)
	{
		System.out.println("inside test1");
	}
	
	public String test1(int a, int b) {
		return null;
		
	}
	
}

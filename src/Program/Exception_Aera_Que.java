package Program;

public class Exception_Aera_Que {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// in given program - return statement was missing

	public boolean exampleTest() {
		try {
			System.out.println("inside try");
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Hello");
		}

	}

}

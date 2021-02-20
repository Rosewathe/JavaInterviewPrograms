package Program;

public class outputprog {
static String c;
	public static void main(String[] args) {
		//Car c = new Car();
		vehicle1 v= new FourWheeler();
		//vehicle1 v=null;
		v.print();
		//v.print();
		int i=0;
		for(;i<10;i++)
		{
		}
		System.out.println();
	}
}
class vehicle1 {

	public vehicle1() {
		System.out.println("I am the super vehicle");
	}
	public void print() {
		System.out.println("Vehivle print");
	}
}

class FourWheeler extends vehicle1 {
	public FourWheeler() {
		System.out.println("I am a car or a truck or whatever 4 wheel has");
	}
	public void print() {
		System.out.println("four wheeler print");
	}
}

class Car extends FourWheeler {
	public Car() {
		System.out.println("I am a car");
	}
	public void print() {
		System.out.println("car print");
	}
}

package oops;

class Vehicle2{
	public Vehicle2(int speed) {
		// TODO Auto-generated constructor stub
		System.out.println("Speed= " +speed);
	}
}

	//public Vehicles(int speed) {
		//System.out.println("Speed= " +speed);
		
	//}
//}

class Cars extends Vehicle2{
	public Cars() {
		super(120);
		System.out.println("Speed = 140");
	}
	
}

public class SuperConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cars ob = new Cars();

	}

}

package oops;
abstract class Vehicle8{
	public abstract void starts();
	public void sound() {
		System.out.println("beep....beep");
	}
	
}

class Bike extends Vehicle8{

	@Override
	public void starts() {
		// TODO Auto-generated method stub
		System.out.println("Kick start");
		
	}
	
}

class Train extends Vehicle8{

	@Override
	public void starts() {
		// TODO Auto-generated method stub
		System.out.println("button start");
		
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Bike();
		b.starts();
		
		Train t = new Train();
		t.sound();
		t.starts();

	}

}

package oops;

class Vehicles{
	int speed = 120;
}

class Car extends Vehicles{
	int speed = 140;
	
	public void display() {
		System.out.println(super.speed);
		System.out.println(speed);
		//System.out.println(super.speed);
	}
}

public class SuperKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car ob = new Car();
		ob.display();

	}

}

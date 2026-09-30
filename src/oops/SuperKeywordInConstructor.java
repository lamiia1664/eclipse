package oops;

class  Vehicle{
	public void speed() {
		System.out.println(120);
	}
}

class Car1 extends Vehicle{
	public void speed() {
		super.speed();
		System.out.println(140);
	}

}

public class SuperKeywordInConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 ob = new Car1();
		ob.speed();

	}

}

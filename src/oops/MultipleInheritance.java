package oops;

class Animals{
	String color;
	
	public void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dogs extends Animals{
	int age;
	
	public void sound() {
		System.out.println("Dog is barking...");
	}
}

class Cats extends Animals{
	String name="Kitty";
	
	public void play() {
		System.out.println("Kitty is playing");
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dogs ob = new Dogs();
		System.out.println("Color : "+(ob.color="Grey"));
		System.out.println("Age : "+(ob.age=1));
		ob.sound();
		ob.eat();
		
		Cats ob1 = new Cats();
		System.out.println("Color : "+(ob1.color="White"));
		System.out.println("Age : "+(ob1.name));
		ob1.play();
		ob1.eat();



	}

}

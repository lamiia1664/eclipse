package oops;

class Animal{
	String color;
	
	public void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dog extends Animal{
	int age;
	
	public void sound() {
		System.out.println("Dog is barking...");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog ob = new Dog();
		System.out.println("Color : "+(ob.color="Grey"));
		System.out.println("Age : "+(ob.age=1));
		
		ob.sound();
		ob.eat();

	}

}

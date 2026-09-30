package oops;

class Animal1{
	String color;
	
	public void eat() {
		System.out.println("Animal is eating...");
	}
}

class Dog1 extends Animal1{
	int age;
	
	public void sound() {
		System.out.println("Dog is barking...");
	}
}

class Puppy extends Dog1{
	String breed = "Pug";
	
	public void play() {
		System.out.println("Puppy is playing...");
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Puppy ob = new Puppy();
		System.out.println("Color : "+(ob.color="Grey"));
		System.out.println("Age : "+(ob.age=1));
		System.out.println("Breed : "+(ob.breed));
		
		ob.play();
		ob.eat();
		ob.sound();
		

	}

}

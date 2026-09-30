package oops;

class Birds1{
	public void sound() {
		System.out.println("tweet.....tweet");
	}
}

class Ducks extends Birds1{
	public void sound() {
		System.out.println("quack...quack");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ducks d=new Ducks();
		d.sound();
		
		Birds1 b=new Ducks();//Dynamic binding
		b.sound();

	}

}

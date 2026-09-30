package oops;

public class BirdsDisplay implements Birds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Birds b = new BirdsDisplay();
		b.sound();
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Tweet..Tweet");
		
	}
	

}

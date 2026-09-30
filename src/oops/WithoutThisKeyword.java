package oops;

public class WithoutThisKeyword {
	
	String name;
	int age;
	
	public WithoutThisKeyword(String n, int a) {
		name=n;
		age=a;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WithoutThisKeyword ob = new WithoutThisKeyword("lamiya", 21);
		ob.display();

	}

}

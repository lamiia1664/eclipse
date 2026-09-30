package methodsandconstructor;

public class MethodsPro {
	
	public void sum() {
		int a=23;
		float b=10.90f;
		float sum =a+b;
		System.out.println("Sum is: " +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=100;
		System.out.println("Maximum is : "+(Math.max(a,b)));
		
		MethodsPro ob = new MethodsPro();
		ob.sum();
	

	}

}

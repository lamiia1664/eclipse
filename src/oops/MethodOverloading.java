package oops;

public class MethodOverloading {
	
	public void add() {
		int num1=10,num2=10,sum;
		sum=num1+num2;
		System.out.println(sum);
	}
	
	public void add(int num1,int num2) {
		System.out.println("sum = " +(num1+num2));	
	}
	
	public void add(int num1,int num2,int num3) {
		System.out.println("sum = " +(num1+num2+num3));	
	}
	
	public void add(float num1,int num2) {
		System.out.println("sum = " +(num1+num2));	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading ob= new MethodOverloading();
		ob.add();
		ob.add(20, 20);
		ob.add(34, 20, 80);
		ob.add(30.5f, 10);
	}

}

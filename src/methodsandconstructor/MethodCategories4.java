package methodsandconstructor;

import java.util.Scanner;

public class MethodCategories4 {
	
	//4.FUCTION WITH RETURN TYPE AND PARAMETER
	
		public int add(int num1,int num2) {
			return num1+num2;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categories ob = new Categories();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scan.nextInt();
		System.out.println("Enter second number : ");
		int b = scan.nextInt();
		int Sum = ob.add(a,b);
		System.out.println("Sum = "+Sum);

	}

}

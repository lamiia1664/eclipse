package methodsandconstructor;

import java.util.Scanner;

public class MethodCategories2 {
	
	//2.FUCTION WITH NO RETURN TYPE AND WITH PARAMETER
	
		public void add(int num1,int num2) {
			System.out.println("Sum = "+(num1+num2));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categories ob = new Categories();
		ob.add(25, 30);
		//using scanner
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scan.nextInt();
		System.out.println("Enter second number : ");
		int b = scan.nextInt();
		ob.add(a,b);

	}

}

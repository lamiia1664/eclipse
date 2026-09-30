package methodsandconstructor;

import java.util.Scanner;

public class MethodCategories1 {
	
	//1.FUCTION WITH NO RETURN TYPE AND NO PARAMETER
	
		public void add() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			int num1=scan.nextInt();
			System.out.println("Enter the second number : ");
			int num2=scan.nextInt();
			System.out.println("Sum = "+(num1+num2));
			
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodCategories1 ob = new MethodCategories1();
		ob.add();

	}

}

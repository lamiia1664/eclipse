package methodsandconstructor;

import java.util.Scanner;

public class MethodCategories3 {
	
	//3.FUCTION WITH RETURN TYPE AND NO PARAMETER
	
		public int add() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the first number : ");
			int num1=scan.nextInt();
			System.out.println("Enter the second number : ");
			int num2=scan.nextInt();
			return num1+num2;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categories ob = new Categories();
		//System.out.println(ob.add());
		int Sum = ob.add(1, 2);
		System.out.println(Sum);


	}

}

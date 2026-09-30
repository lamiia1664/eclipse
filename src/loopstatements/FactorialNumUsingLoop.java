package loopstatements;

import java.util.Scanner;

public class FactorialNumUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		long factorial = 1;
		
		for(int i=1;i<=num;i++) {
			factorial *= i;
			
		}
		System.out.println("The factorial of " + num + " is: " + factorial);

	}

}

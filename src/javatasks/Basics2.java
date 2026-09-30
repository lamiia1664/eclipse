package javatasks;

import java.util.Scanner;

public class Basics2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		float num1;
		float num2;
		
		System.out.println("Enter the first float number : ");
		num1=sc.nextFloat();
		System.out.println("Entered integer is :"+num1);
		
		System.out.println("Enter the second float number  : ");
		num2=sc.nextFloat();
		System.out.println("Entered integer is :"+num2);
		
		float mul = num1*num2;
		
		
		System.out.println("Multiplication of these :"+mul);
		
		sc.close();
		

	}

}

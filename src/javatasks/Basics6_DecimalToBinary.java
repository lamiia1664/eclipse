package javatasks;

import java.util.Scanner;

public class Basics6_DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a decimal number:");
		int decimal=sc.nextInt();
		
		String binary = Integer.toBinaryString(decimal);
		
		System.out.println("Decimal: " + decimal);
		System.out.println("Binary: " + binary);

	}

}

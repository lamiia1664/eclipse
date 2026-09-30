package basics;

import java.util.Scanner;

public class ScannerPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//object creation
		String name;//variable declaration
		System.out.println( "Enter your name : ");
		name= scan.nextLine();
		System.out.println("My name is "+name) ;

	}

}

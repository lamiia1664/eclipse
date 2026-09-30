package operator;

import java.util.Scanner;

public class Arithmetscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value of a=");
		a=s1.nextInt();
		
		Scanner s2=new Scanner(System.in);
		System.out.println("enter the value of b=");
		b=s2.nextInt();
		
		System.out.println("Mod = "+(a%b));
	}

}

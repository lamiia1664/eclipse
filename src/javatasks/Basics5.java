package javatasks;

import java.util.Scanner;

public class Basics5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers for (-a + b * c):");
		int a1=sc.nextInt();
		int b1=sc.nextInt();
		int c1=sc.nextInt();
		System.out.println("Result a: "+(-a1 + b1 * c1));
		// -5 + 8 * 6 ->43
		
		System.out.println("Enter three numbers for ((a + b )%c):");
		int a2=sc.nextInt();
		int b2=sc.nextInt();
		int c2=sc.nextInt();
		System.out.println("Result a: "+((a2 + b2 )%c2));
		//(55+9) % 9 ->1
		
		System.out.println("Enter four numbers for (a + -b*c /d) :");
		int a3=sc.nextInt();
		int b3=sc.nextInt();
		int c3=sc.nextInt();
		int d3=sc.nextInt();
		System.out.println("Result a: "+(a3 + -b3*c3 /d3));
		//20 + -3*5 / 8 ->19
		
		System.out.println("Enter four numbers for (a + b / c *d - e % f) :");
		int a4=sc.nextInt();
		int b4=sc.nextInt();
		int c4=sc.nextInt();
		int d4=sc.nextInt();
		int e4=sc.nextInt();
		int f4=sc.nextInt();
		System.out.println("Result a: "+(a4 + b4 / c4 *d4 - e4 % f4));
		// 5 + 15 / 3 * 2 - 8 % 3 ->13
	
	}

}

package methodsandconstructor;

import java.util.Scanner;

public class Categories {
	//1.FUCTION WITH NO RETURN TYPE AND NO PARAMETER
	
	//public void add() {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the first number : ");
		//int num1=scan.nextInt();
		//System.out.println("Enter the second number : ");
		//int num2=scan.nextInt();
		//System.out.println("Sum = "+(num1+num2));
		
	//}
	
	//2.FUCTION WITH NO RETURN TYPE AND WITH PARAMETER
	
	//public void add(int num1,int num2) {
		//System.out.println("Sum = "+(num1+num2));
	//}
	
	//3.FUCTION WITH RETURN TYPE AND NO PARAMETER
	
	//public int add() {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the first number : ");
		//int num1=scan.nextInt();
		//System.out.println("Enter the second number : ");
		//int num2=scan.nextInt();
		//return num1+num2;
		
	//}
	
	//4.FUCTION WITH RETURN TYPE AND PARAMETER
	
	public int add(int num1,int num2) {
		return num1+num2;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)//Categories ob = new Categories();
		//ob.add();
		
		//2)Categories ob = new Categories();
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter first number : ");
		//int a = scan.nextInt();
		//System.out.println("Enter second number : ");
		//int b = scan.nextInt();
		//ob.add(a,b);
		
		//3)Categories ob = new Categories();
		//System.out.println(ob.add());
		//int Sum = ob.add();
		//System.out.println(Sum);
		
		Categories ob = new Categories();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number : ");
		int a = scan.nextInt();
		System.out.println("Enter second number : ");
		int b = scan.nextInt();
		int Sum = ob.add(a,b);
		System.out.println(Sum);
		

	}

}

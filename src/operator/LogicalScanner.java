package operator;

import java.util.Scanner;

public class LogicalScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value boolean 'a' (true/false): "); 
		boolean a = sc.nextBoolean();
		
		System.out.println("Enter value boolean 'b' (true/false): "); 
		boolean b = sc.nextBoolean();
		
		sc.close();
		
		boolean expr1=!(a||b);
		System.out.println("!(a||b) = "+expr1);
		
		boolean expr2=!(a && b);
		System.out.println("!(a&&b) = "+expr2);
		
		boolean expr3=!((a||b) && (a||b));
		System.out.println("!((a||b) && (a||b)) = "+expr3);
		
		boolean expr4=!((a && b) || (a && b));
		System.out.println("!((a && b) || (a && b)) = "+expr4);


	}

}

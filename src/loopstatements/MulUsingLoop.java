package loopstatements;

import java.util.Scanner;

public class MulUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		
		System.out.println("\nMultiplication Table for " + number + ":");
		
		//for(int i=1;i<=10;i++) {
		//	System.out.println(i+"*"+num+"="+(i*num));
		//}
		
		for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " x " + i + " = " + result);
        }
		
		//do {
		//	System.out.println(i+" * "+number+" = "+(i*number));
		//	i++;
		//}while(i<=10);
		

	}

}

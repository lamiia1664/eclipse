package arrayandstrings;

import java.util.Scanner;

public class SingleDimentionalArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("How many numbers do you want to enter? ");
        int size = scanner.nextInt();
        
        System.out.println("\nEnter elements:");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("\nYour numbers are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + arr[i]);
        }

	}

}

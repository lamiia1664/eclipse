package arrayandstrings;

import java.util.Scanner;

public class MultiDimensionalArrayUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter row size: ");
		int r = scan.nextInt();
		
		System.out.println("Enter column size: ");
		int c = scan.nextInt();
		
		System.out.println("Enter elements: ");
		int arr[][] = new int[r][c];
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Elements are: ");
		
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}


	}

}

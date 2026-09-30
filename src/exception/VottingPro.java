package exception;

import java.util.Scanner;

public class VottingPro {

	public static void main(String[] args) throws AgeLimitException {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Age : ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		try {
			if(age<18){
				throw new AgeLimitException("Below 18 is not eligible");
				//System.out.println("below 18 is not eligible");
			}
			else{
				System.out.println("Eligible to vote");
			}
		}
		
		catch(AgeLimitException e) {
			System.out.println(e);
		}
		
		System.out.println("Hai");
			
		
	}

}

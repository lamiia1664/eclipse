package operator;

import java.util.Scanner;

public class TernaryOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan=new Scanner(System.in);		
	    System.out.println("Enter number : ");
	    num=scan.nextInt();
	    String res=(num>0)?"Positive number":"Negative number";
	    System.out.println(res);
	}

}

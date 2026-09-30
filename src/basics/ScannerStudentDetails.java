package basics;

import java.util.Scanner;

public class ScannerStudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String name;
		String gender;
		byte age;
		String DOB;
		String address;
		long phno;
		String quali;
		float marks;
		String grade;
		String institute;
		String course;
		int fees;
		
		System.out.println("Enter your name:");
		name=scan.nextLine();
		System.out.println("Name "+name);
		
		System.out.println("Enter your gender:");
		gender=scan.nextLine();
		System.out.println("Your are "+gender);

		System.out.println("Enter your age:");
		age=scan.nextByte();
		scan.nextLine();
		System.out.println("Your Age is "+age);

		System.out.println("Enter your DOB:");
		DOB=scan.nextLine();
		System.out.println("Your date of birth is "+DOB);
		
		System.out.println("Enter your Address:");
		address=scan.nextLine();
		System.out.println("Your address is "+address);

		System.out.println("Enter your Phno:");
		phno=scan.nextLong();
		System.out.println("Your Phone number is "+phno);

		System.out.println("Enter your Qualification:");
		quali=scan.nextLine();
		scan.nextLine();
		System.out.println("Your Qualification is "+quali);

		System.out.println("Enter your Marks:");
		marks=scan.nextFloat();
		System.out.println("Your Mark is "+marks);

		System.out.println("Enter your Grade:");
		grade=scan.next();
		System.out.println("Your Grade is "+grade);

		System.out.println("Enter your Institute:");
		institute=scan.nextLine();
		scan.nextLine();
		System.out.println("Your institute name is "+institute);

		System.out.println("Enter your Course:");
		course=scan.nextLine();
		System.out.println("Your course is "+course);

		System.out.println("Enter your Fees:");
		fees=scan.nextInt();
		System.out.println("Your address is "+fees);
	
	}

}

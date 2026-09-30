package tasks;

import java.util.Scanner;

public class NestedSwitchWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Select a School:");
        System.out.println("1. School of Computer Science");
        System.out.println("2. School of Business");
        System.out.println("3. School of Engineering");
        System.out.println("Enter school choice (1-3): ");
        int schoolChoice = scanner.nextInt();

        switch (schoolChoice) {
            case 1:
                System.out.println("\n--- School of Computer Science ---");
                System.out.println("1. Department of Informatics");
                System.out.println("2. Department of Machine Learning");
                System.out.print("Enter department choice (1-2): ");
                int csDept = scanner.nextInt();

                switch (csDept) {
                    case 1:
                        System.out.println("Selected: Department of Informatics");
                        break;
                    case 2:
                        System.out.println("Selected: Department of Machine Learning");
                        break;
                    default:
                        System.out.println("Invalid department selection.");
                        break;
                }
                break;

            case 2:
                System.out.println("\n--- School of Business ---");
                System.out.println("1. Department of Commerce");
                System.out.println("2. Department of Purchasing");
                System.out.print("Enter department choice (1-2): ");
                int BuisDept = scanner.nextInt();

                switch (BuisDept) {
                    case 1:
                        System.out.println("Selected: Department of Commerce");
                        break;
                    case 2:
                        System.out.println("Selected: Department of Purchasing");
                        break;
                    default:
                        System.out.println("Invalid department selection.");
                        break;
                }
                break;

            case 3:
                System.out.println("\n--- School of Engineering ---");
                System.out.println("1. Department of Mechanical Engineering");
                System.out.println("2. Department of Mechatronics Engineering");
                System.out.print("Enter department choice (1-2): ");
                int EngiDept = scanner.nextInt();

                switch (EngiDept) {
                    case 1:
                        System.out.println("Selected: Department of Mechanical Engineering");
                        break;
                    case 2:
                        System.out.println("Selected: Department of Mechatronics Engineering");
                        break;
                    default:
                        System.out.println("Invalid department selection.");
                        break;
                }
                break;

            default:
                System.out.println("Invalid school selection.");
                break;
        }

        scanner.close();
    }
}
		

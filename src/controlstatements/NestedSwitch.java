package controlstatements;

public class NestedSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Qualification = 1;
		char Course = 'b';
		
		switch(Qualification) {
		case 1 : System.out.println("1. PG");
		switch(Course) {
		case 'a' : System.out.println("a. MCA");
		break;
		case 'b' : System.out.println("b. MBA");
		break;
		case 'c' : System.out.println("c. Mtech");
		break;
		
		default : System.out.println("Invalid input");
		}
		break;
		
		case 2 : System.out.println("2. UG");
		switch(Course) {
		case 'a' : System.out.println("a. BBA");
		break;
		case 'b' : System.out.println("b. BSC");
		break;
		case 'c' : System.out.println("c. Btech");
		break;
		
		default : System.out.println("Invalid input");
		}
		break;
		
		default : System.out.println("Enter valid input");
		}
	}

}

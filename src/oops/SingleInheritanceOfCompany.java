package oops;

class Employee{
	String worktype;
	
	public void salary() {
		System.out.println("Salary is 30000");
	}
}

class Developer extends Employee{
	String designation;
	
	public void time() {
		System.out.println("3pm");	
	}	
}

public class SingleInheritanceOfCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developer ob = new Developer();
		System.out.println("Worktype : "+(ob.worktype="Permanent staff"));
		System.out.println("Designation : "+(ob.designation="abc"));
		
		ob.salary();
		ob.time();

	}

}

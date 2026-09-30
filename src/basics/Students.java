package basics;

public class Students {
	String name;
	
	static String course="Testing";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		Students stud1 = new Students();
		System.out.println("Name = "+(stud1.name="Anurag")) ;
		System.out.println("Age = "+(age=21)) ;
		System.out.println("Course = "+course) ;
		
		Students stud2 = new Students ();
		System.out.println("Name = "+(stud2.name="Madulika")) ;
		System.out.println("Age = "+ (age=22));
		System.out.println("Course = "+course);
		
		Students stud3 = new Students();
		System.out.println("Name = "+(stud3.name="Lamiya")) ;
		System.out.println("Age = "+(age=21)) ;
		System.out.println("Course = "+(course="Developer")) ;
	
		Students stud4 = new Students();
		System.out.println("Name = "+(stud4.name="Shibiludheen")) ;
		System.out.println("Age = "+ (age=23));
		System.out.println("Course = "+course);

	}

}

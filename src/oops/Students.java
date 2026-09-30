package oops;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_Info ob = new Student_Info();
		ob.setEmailid("Ammu", "Ammu@123");
		
		System.out.println(ob.getEmailid());
		System.out.println(ob.getPassword());
		
		String name=ob.getEmailid();
		String pass=ob.getPassword();
		System.out.println(name+"\n"+pass);
	}

}

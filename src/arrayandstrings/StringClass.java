package arrayandstrings;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char exp[] = {'H','e','l','l','o'};
		System.out.println(exp);
		System.out.println(exp[1]);
	
				
		for(char data : exp) {
		System.out.println(data);
		}
				
		//String array
		String names[] = {"Haritha", "Ashly", "Anurag", "Diya"};
		System.out.println(names [2]);
		
	    for (int i=0;i<names.length;i++) {
	    	System.out.println(names[i]) ;
	    }
	    
		//string literals
		String name = "Athul";
		String name1 = "Athul";
		System.out.println(name==name1);//true

		String name2=new String("Athul");
		String name3=new String("Athul");
		
		System.out.println(name2==name3);
		System.out.println(name == name2);
		
		//string methods
		System.out.println(name2.equals(name3));
		System.out.println(name.equals(name3));
		
		//string immutable
		name=name+"  Thomas";
		System.out.println(name);
		//System.out.println(name+"Thomas");
		
		String newname=name.concat("Santan");
		System.out.println(newname);
		
		//String Buffer and Builder
		//mutable
		StringBuffer nam=new StringBuffer("Kavya");
		StringBuilder nam1=new StringBuilder("Madhavan");
		nam.append(nam1);
		nam.append("Das");
		System.out.println(name);
		
	}

}

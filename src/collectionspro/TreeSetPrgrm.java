package collectionspro;

import java.util.TreeSet;

public class TreeSetPrgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> ob = new TreeSet<String>();
		
		ob.add("Madhulika");
		ob.add("Ashly");
		ob.add("Diya");
		ob.add("Haritha");
		ob.add("Nandhana");
		ob.add("Aishwarya");
		
		System.out.println(ob);
		
		for(String data : ob) {
			System.out.println(data);
		}
		
		ob.add("Diya");
		System.out.println(ob);

	}

}

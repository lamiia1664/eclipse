package collectionspro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new Vector<Integer>();
		
		li.add(10);
		li.add(98);
		li.add(30);
		li.add(89);
		li.add(40);
		li.add(60);
		
		System.out.println(li);
		
		System.out.println("length of the list = "+li.size());
		System.out.println("3rd index value is : "+li.get(3));
		
		for(int i =0;i<li.size();i++) {
			System.out.println(li.get(i));
		}
		
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		li.remove(4);
		System.out.println(li);
		
		List li1 = new ArrayList();
		li1.addAll(li);
		System.out.println(li1);
		
		li1.removeAll(li1);
		System.out.println(li1);
		
		li.add(67);
		li.add(89);
		System.out.println(li);
		
		li.add(null);
		System.out.println(li);
		
		System.out.println(li.contains("Diya"));
		System.out.println(li.contains(60));

	}

}

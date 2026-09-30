package collectionspro;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPrgrm {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		
		HashMap<Integer, String> ob = new HashMap<Integer, String>();
		
		ob.put(100, "Lamiya");
		ob.put(105, "Java");
		ob.put(203, "Hello");
		ob.put(40, "Wwah");
		
		System.out.println(ob);
		
		Set mapset = ob.entrySet();
		Iterator itr = mapset.iterator();
		
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			//System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
			System.out.println(entry.getKey()+"=="+entry.getValue());


	   }

	}	
}

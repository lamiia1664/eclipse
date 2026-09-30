package collectionspro;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class QueueCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PriorityQueue<String> que = new PriorityQueue<String>();
		ArrayDeque<String> que = new ArrayDeque<String>();
		
		que.add("Madhulika");
		que.add("98");
		que.add("Diya");
		que.add("89.6");
		que.add("Nanadhana");
		que.add("89.9");
		
		System.out.println(que);
		que.addFirst("Anurag");
		que.addLast("Lamiya");
		System.out.println(que);
		System.out.println(que.peek());
		que.poll();
		System.out.println(que);
		System.out.println(que.peekFirst());
		que.pollFirst();
		System.out.println(que);
		System.out.println(que.peekLast());
		que.pollLast();
		System.out.println(que);
		
	}

}

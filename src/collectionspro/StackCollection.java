package collectionspro;

import java.util.Stack;

public class StackCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack ob = new Stack();
		ob.push(11);
		ob.push(20);
		ob.push(1);
		ob.push(2);
		
		System.out.println(ob);
		ob.push(20);
		System.out.println("Elements : "+ob);
		
		//top elements
		System.out.println("Top element is : "+ob.peek());
		
		ob.pop();
		System.out.println("Elements : "+ob);
		System.out.println("Top element is : "+ob.peek());

	}

}

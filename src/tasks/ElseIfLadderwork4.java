package tasks;

public class ElseIfLadderwork4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=45, b=39, c=20;
		if (a<b && a<c) {
			System.out.println("a is smallest among them");
		}
		else if(b<a && b<c){
			System.out.println("b is smallest among them");
		}
		else {
			System.out.println("c is smallest");
		}

	}

}

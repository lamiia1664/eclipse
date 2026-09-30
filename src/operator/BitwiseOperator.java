package operator;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10, n2 = 5;
		System.out.println(Integer.toBinaryString(n1));
		System.out.println(Integer.toBinaryString(n2));
		
		System.out.println("Bitwise OR= " +(n1|n2));
		System.out.println("Bitwise AND= " +(n1&n2));
		System.out.println("Bitwise XOR= " +(n1^n2));
		System.out.println("Bitwise Complement of n1= " +~(n1));
		System.out.println("Bitwise Complement of n2= " +~(n2));
		

	}

}

package operator;

public class ShiftOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=2,j=-2;
				System.out.println(i+"\t"+Integer.toBinaryString(1));
				System.out.println(j+"\t"+Integer. toBinaryString(j));
				
				System.out.println("left shift : "+(i<<2));
				System.out.println(Integer.toBinaryString(i<<2));
				System.out.println("Right Shift: "+(i>>2));
				System.out.println(Integer.toBinaryString(i>>2));
				System.out.println("Unsigned Right Shift: "+(i>>>1));
				System.out.println(Integer.toBinaryString(i>>1));
				
				System.out.println("left shift : "+(j<<2));
				System.out.println(Integer.toBinaryString(j<<2));
				System.out.println("Right Shift: "+(j>>2));
				System.out.println(Integer.toBinaryString(j>>2));
				System.out.println("Unsigned Right Shift: "+(j>>>1));
				System.out.println(Integer.toBinaryString(j>>1));
				

	}

}

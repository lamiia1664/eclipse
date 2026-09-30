package exception;

public class ExceptionPro1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
		try {
		System.out.println(a/0);
		int arr[]= null;
		System.out.println(arr[0]);
		}
		
		//catch(ArithmeticException e1) {
			//System.out.println(e1);
		//}
		
		//catch(ArrayIndexOutOfBoundsException e2) {
			//System.out.println(e2);
		//}
		
		//catch(Exception e) {
			//System.out.println(e);
		//}
		
		finally {
			for(int i=0;i<10;i++) {
				System.out.println(i);
			}
		}
		
		//for(int i=0;i<10;i++) {
			//System.out.println(i);
		//}

	}

}

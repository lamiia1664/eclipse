package methodsandconstructor;

public class OddOrEven {
	
	public void oddOrEven() {
		int num=107;
		if (num%2==0) {
			System.out.println("Even Number");
		}
		else {
			System.out.println("Odd Number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OddOrEven ob = new OddOrEven();
		ob.oddOrEven();

	}

}

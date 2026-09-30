package controlstatements;

public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=101;
		if(num%2==0) {
			if(num>0) {
			    System.out.println("Positive even number");
			}
		    else {
			    System.out.println("Negative Even number");
		    }
	   }
	   else {
		   if(num>0) {
			   System.out.println("Positive odd number");
		   }
		   else {
			   System.out.println("Negative odd number");
		   }
	   }
	}	
}


package jumpstatements;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i=1;i<=2;i++) {
			for(int j=1;j<=2;j++) {
				if(i==1 && j==2) {
					continue;
				}
				System.out.println(i+" "+j);
		     }
		
		   }
		
		}

	}



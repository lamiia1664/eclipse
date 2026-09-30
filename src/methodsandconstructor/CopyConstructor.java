package methodsandconstructor;

public class CopyConstructor {
	float l,b;
	float area;
	
	public CopyConstructor() {
		l=2.2f;
		b=2.4f;
		area=l*b;
				
	}
	
	public void display() {
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructor ob= new CopyConstructor();
		ob.display();
		CopyConstructor ob1 = ob;
		ob1.display();
	}

}

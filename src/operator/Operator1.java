package operator;

public class Operator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		a= -a;
		System.out.println(a);
		
		//2. Unary Not(1)
		boolean b = true;
		System.out.println(b);
		
		//3. increment ++
		//post increment I++ -> I= I+1
		int i=5;
		System.out.println(i++);//6
		//pre increment ++I -> I = I+1
		++i;
		System.out.println("++1 = " +1);//7
		
		//4.decrement --
		//post decrement I-- -> I-1
		int j = 10;
	    j--;
		System.out.println("j-- = "+j);
		//pre decrement
		--j;
		System.out.println("--j = "+j);
		//5. Bitwise Complement
		int n = 9;
		System.out.println(~n);
		
		//icremental and decremental
		//incremental postfix
		int k=10;
		int value=k++;
		System.out.println("Value1 ="+value+"\t"+"k = "+k);
		//incremental prefix
		int value1=++k;
		System.out.println("Value2 ="+value1+"\t"+"k = "+k);
		
		//decremental postfix
		int value2=k--;
		System.out.println("Value3 ="+value2+"\t"+"k = "+k);
		
		//decremental prefix
		int value3=--k;
		System.out.println("Value4 ="+value+"\t"+"k = "+k);
		
		//Relational
		int x=50, y=100;
		
		//lessthan/equal to
		boolean val=x<y;
		boolean val1=x<=y;
		System.out.println(val);
		System.out.println(val1);
		
		//greaterthan/equal to
	    boolean val2=x>y;
	    boolean val3=x>=y;
		System.out.println(val2);
		System.out.println(val3);
		
		//equal to/not equal to
		boolean val4=x==y;
		boolean val5=x!=y;
		System.out.println(val);
	    System.out.println(val1);
				
				
		
	}

}

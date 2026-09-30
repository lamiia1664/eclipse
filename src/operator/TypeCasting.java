package operator;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char exp='Z';
		int num=exp;
		float deci=num;
		
		System.out.println("Widening Type Casting");
		System.out.println(exp+"\t"+num+"\t"+deci);
		
		float val=100.0f;
		int n=(int) val;
		char ex=(char) n;
		
		System.out.println("Narrowing Type Casting");
		System.out.println(val+"\t"+n+"\t"+ex);


	}

}

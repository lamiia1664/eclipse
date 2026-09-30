package operator;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 28, num2 =20;
		int add, sub, mul, mod;
		float div;
		add = num1+num2;
		sub = num1-num2;
		mul = num1*num2;
		mod = num1%num2;
		div = num1/num2;
    System.out.println("Add="+add+"\nSub="+sub+"\nMul="+mul+"\nMod="+mod+"\nDiv="+div);
    
    //assignment operators
    System.out.println(num1+=num2); // num1=num1+num2
    System.out.println(num1-=num2); // num1=num1-num2
    System.out.println(num1*=num2); // num1=num1*num2
    System.out.println(num1/=num2); // num1=num1/num2
    System.out.println(num1%=num2); // num1=num1%num2
    
    //logical operator
    boolean a = num1==num2;
    boolean b = num1!=num2;
    //logical not
    System.out.println("logical Not = "+!a); //true
    //logical AND
    System.out.println("logical AND = "+(a&&b)); //false
    //logical OR
    System.out.println("logical OR = "+(a||b)); //true
    
    //Ternary operator
    int x=10, y=20;
    int exp = (x<y)?x-y:x+y;
    System.out.println(exp);
	}

}

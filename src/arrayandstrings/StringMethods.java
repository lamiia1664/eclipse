package arrayandstrings;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//string length
		
		
		//char value
		String s="Encyclopedia";
		char c=s.charAt(7);
		System.out.println(c);
		
		//3.compare To
		String s1="hello";
		String s2="hello";
		String s3="meklo";
		String s4="hemlo";
		String s5="flag";
		
		System.out.println(s1.compareTo(s2));//0
		System.out.println(s1.compareTo(s3));//-5
		System.out.println(s1.compareTo(s4));//-1
		System.out.println(s1.compareTo(s5));//2
		
		//contains
		String charcontain="Java is a highlevel programming language";
		System.out.println(charcontain.contains("highlevel"));//true
		System.out.println(charcontain.contains("programming"));//true
		System.out.println(charcontain.contains("lowlevel"));//false
		
		//7.equals
		String s6="hello";
		String s7="hello";
		String s8="HELLO";
		String s9="go";
	
		System.out.println(s6.equals(s7));//true
		System.out.println(s7.equals(s8));//false
		System.out.println(s8.equals(s9));//false
		
		
		//8.Java String equalIgnoranceCase
		String word1="hello";
		String word2="hello";
		String word3="HELLO";
		String word4="go";
		System.out.println(word1.equalsIgnoreCase(word2));//true
		System.out.println(word2.equalsIgnoreCase(word3));//true
		System.out.println(word3.equalsIgnoreCase(word4));//false
		
		//9.Java String toLowerCase
		String lower="HELLO mY WORLD";
		System.out.println(lower.toLowerCase());
		
		//10.Java String toUpperCase
		String upper="wwah what a view";
		System.out.println(upper.toUpperCase());
		
		
		

	}

}

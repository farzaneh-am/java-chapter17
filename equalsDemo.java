package chapter17;

public class equalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S1="Hello";
		String S2="Hello";
		String S3="Good-bye";
		String S4="HELLO";
		System.out.println(S1+" equals "+S2+" --> "+S1.equals(S2));
		System.out.println(S1+" equals "+S3+" --> "+S1.equals(S3));
		System.out.println(S1+" equals "+S4+" --> "+S1.equals(S4));
		System.out.println(S1+" equalsIgnoreCase "+S4+" --> "+S1.equalsIgnoreCase(S4));
		
		System.out.println(S1.regionMatches(true, 0, S4, 0, 4));
		System.out.println(S1.regionMatches(0, S4, 0, 4));
		System.out.println(S2.regionMatches(0, S3, 0, 4));
		System.out.println(S1.regionMatches(0, S2, 0, 5));
		

	}

}

package chapter17;

public class SubstringCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte ascii[]= {65,66,67,68,69,70};
		String s=new String(ascii);
		String v=new String(ascii,2,3);
		String w="abcd";
		
		
		String age="9";
		String b="He is "+age+" years old";
System.out.println("S is:"+s);

System.out.println("V is:"+v);
System.out.println("lenght S:"+s.length());
System.out.println("lenght w:"+w.length());
System.out.println("lenght w:"+"abcd".length());
System.out.println("b is: "+b);
	}

}

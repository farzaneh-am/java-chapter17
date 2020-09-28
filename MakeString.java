package chapter17;

public class MakeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char s1[]= {'f','a','r','z','a','n','e','h'};
		//various constractors For String class:
		String s0=new String();
		String s2=new String(s1);
		String s3=new String(s1,0,3);
		String s4=new String(s2);
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
	}

}

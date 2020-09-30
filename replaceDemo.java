package chapter17;

public class replaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("this is a test.");
		s.replace(5, 7,"was");
		System.out.println("After replace : "+s);
	
		
		
		String s1=s.substring(4);
		String s2=s.substring(4,8);
		System.out.println("After replace : "+s1);
		System.out.println("After replace : "+s2);

	}

}

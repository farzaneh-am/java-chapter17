package chapter17;

public class deleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("this is a test.");
		s.delete(4, 7);
		System.out.println("After delete : "+s);
		s.deleteCharAt(0);
		System.out.println("After deleteCharAt : "+s);
		
	}

}

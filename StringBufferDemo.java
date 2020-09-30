package chapter17;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s1=new StringBuffer();
		StringBuffer s=new StringBuffer("Hello");
		
		System.out.println("buffer= "+s);
		System.out.println("lenght= "+s.length());
		System.out.println("default capacity is buffer= "+s1.capacity());
		System.out.println("old capacity= "+s.capacity());
		s.ensureCapacity(40);
		System.out.println("new capacity= "+s.capacity());
		
	}

}

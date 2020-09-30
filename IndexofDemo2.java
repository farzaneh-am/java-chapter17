package chapter17;

public class IndexofDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer s=new StringBuffer("one two one");
		int i;
		i=s.indexOf("one");
		System.out.println("First Index: "+i);
		i=s.lastIndexOf("one");
		System.out.println("Last Index: "+i);
	}

}

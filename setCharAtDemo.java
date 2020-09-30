package chapter17;

public class setCharAtDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println("Buffer Before= "+sb);
		System.out.println("CharAt(1) Before= "+sb.charAt(1));
		sb.setCharAt(1, 'i');
		sb.setLength(2);
		System.out.println("Buffer after= "+sb);
		System.out.println("CharAt(1) after= "+sb.charAt(1));
		
	}

}

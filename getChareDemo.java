package chapter17;

public class getChareDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="farzaneh aghamahmoudian";
		int start=3,end=6,start2=9,end2=13,start3=0,end3=23;
		char buf[]=new char[end-start];
		char buf2[]=new char[end2-start2];
		char buf3[]=new char[end3-start3];
		
		s.getChars(start, end, buf, 0);
		s.getChars(start2, end2, buf2, 0);
		s.getChars(start3, end3, buf3, 0);
		
		
		System.out.println(buf);
		System.out.println(buf2);
		System.out.println(buf3);
		
		System.out.println(s.toCharArray());//Example tocharArray Method

	}

}

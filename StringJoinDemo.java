package chapter17;

public class StringJoinDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String result=String.join(" ", "Alpha","Beta","Gamma");
System.out.println(result);
String result2=String.join(" *** ", "Alpha","Beta","Gamma");
System.out.println(result2);
result=String.join(", ", "Farzaneh","ID#:569","E-mail:Farzaneh@gmail.com");
System.out.println(result);
	}

}

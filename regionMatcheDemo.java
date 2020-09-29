package chapter17;

public class regionMatcheDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1="Farzaneh";
String str2="Agha Mahmoudian";
String str3="farzaneh";
String str4="Agha Mahmoudian";
System.out.println(str1.regionMatches(true, 0, str3, 0, 5));
System.out.println(str1.regionMatches(0, str4, 0, 7));
System.out.println(str2.regionMatches(0, str4, 0, 15));
System.out.println(str1.regionMatches(0, str2, 0, 5));

	}
	

}

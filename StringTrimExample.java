package chapter17;

public class StringTrimExample {
public void trimexample1() {
	String s1="  Hello Farzaneh   ";  
	System.out.println(s1+"How are you?");//without trim()  
	System.out.println(s1.trim()+"How are you?");//with trim()  
	
}
public void trimexample2() {
String s2 ="  Hello Farzaneh Jan   ";  
 
System.out.println(s2); //Without trim()  
String tr = s2.trim();  
System.out.println("lenght= "+s2.length()); 
 
System.out.println(tr); //With trim()  
System.out.println("lenght="+tr.length()); 
}
		public static void main(String args[]){  
			StringTrimExample t1=new StringTrimExample();
			t1.trimexample1();
			System.out.println();
			t1.trimexample2();
			
		}
	} 
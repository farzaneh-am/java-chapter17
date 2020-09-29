package chapter17;
class testequals1string1{
	public void teststring1(){
		String s1="Farzaneh";  
		   String s2="Farzaneh";  
		   String s3=new String("Farzaneh");  
		   String s4="Fariba";  
		   System.out.println(s1.equals(s2)); 
		   System.out.println(s1.equals(s3)); 
		   System.out.println(s1.equals(s4));  
		
	}
}
class testequals1string2{
	public void teststring2(){
		 String s1="farzaneh";  
		   String s2="FARZANEH";  
		  
		   System.out.println(s1.equals(s2)); 
		   System.out.println(s1.equalsIgnoreCase(s2));  
		
	}
}
class testequals1string3{
	public void teststring3(){
		 String s1="farzaneh";  
		   String s2="farzaneh";  
		   String s3=new String("farzaneh");  
		   System.out.println(s1==s2); 
		   System.out.println(s1==s3);
		
	}
}
public class Teststringcomparison1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testequals1string1 obj1=new testequals1string1();
		testequals1string2 obj2=new testequals1string2();
		testequals1string3 obj3=new testequals1string3();
		obj1.teststring1();
		obj2.teststring2();
		obj3.teststring3();
		
		
	}

}

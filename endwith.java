package chapter17;

public class endwith {
	public void endwithexample1(){
		   
		String s1="java by javatpoint";  
		System.out.println(s1.endsWith("t"));  
		System.out.println(s1.endsWith("point"));  
	        
	   } 
public void endwithexample2(){
		   
	     String str = "Welcome to Javatpoint.com";  
	     System.out.println(str.endsWith("point")); 
	     if(str.endsWith(".com")) {
	    	 System.out.println("String ends with .com");  
	     }else
	    	 System.out.println("It does not end with .com");        
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		endwith obj1=new endwith();
		System.out.println("example 1 is: ");
		obj1.endwithexample1();
		System.out.println("example 2 is: ");
		obj1.endwithexample2();
	     
	}

}

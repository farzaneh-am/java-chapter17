package chapter17;

 

public class startWith {
	
	public void startwithexample1(){
		   
		String s1="java string split method by javatpoint";  
		System.out.println(s1.startsWith("ja"));  
		System.out.println(s1.startsWith("java string"));  
	        
	   } 
public void startwithexample2(){
		   
	     String str = "Javatpoint";  
	     System.out.println(str.startsWith("J")); 
	     System.out.println(str.startsWith("a")); 
	     System.out.println(str.startsWith("a",1)); 
	         
	    } 

	public static void main(String[] args) {
		startWith obj=new startWith();
		System.out.println("example 1 is: ");
		obj.startwithexample1();
		System.out.println("example 2 is: ");
		obj.startwithexample2();
	     
	        }  
	}



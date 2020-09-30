package chapter17;

public class GetCharStringDemo {
	  
		public static void main(String args[]){  
		 String str = new String("hello javatpoint how r u");  
		      char[] ch = new char[10];  
		      try{  
		         str.getChars(6, 10, ch,5);  
		         System.out.println(ch);  
		      }catch(Exception ex){System.out.println(ex);}  
		}
}
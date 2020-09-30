package chapter17;

import java.util.IllegalFormatException;

public class StringMethods {
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Farzaneh";
		String str2="";
		String str3="Fariba";
		String str5="Fariba is very good";
		
		
		System.out.println(str1.codePointAt(3));
		
		System.out.println(str1.codePointBefore(3));
		
		System.out.println(str1.codePointCount(2,6));
		
		System.out.println(str1.contains("a"));
		System.out.println(str1.contains("g"));
		
		System.out.println(str1.contentEquals("FarZaneh"));
		System.out.println(str1.contentEquals("Fariba"));
		
		
		
	
		try {
			System.out.println(String.format("name is: "+" %s",str1));
			System.out.println(String.format("mellicode is: "+" %d",1281482510));
			System.out.println(String.format("average is: "+"%f","b"));
		}catch(IllegalFormatException e) {
			System.out.println("string Format is illegal");
			
		}
		System.out.println(String.format("%x",50));
		
		System.out.println(str1.isEmpty());//result is false because str1 is full
		System.out.println(str2.isEmpty());//result is true because str2 is null
		
		System.out.println(str1.matches("Farzaneh"));
		System.out.println(str1.matches(str3));
	
		StringBuffer str4=new StringBuffer("Programming");
		System.out.println("String :"+str4);
		System.out.println("index of offset(2,5)is :"+str4.offsetByCodePoints(2,5));
		
		
		System.out.println(str3.replaceFirst("a","o"));
		System.out.println(str1.replaceAll("a","o"));
		System.out.println(str5.replaceAll(" ","*"));
		
		System.out.println(str1.split(str2));
	}

}

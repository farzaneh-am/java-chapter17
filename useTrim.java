package chapter17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class useTrim {

	public static void main(String[] args) 
		// TODO Auto-generated method stub
throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
	String str;
	System.out.println("Enter 'stop' to quit.");
	System.out.println("Enter State:");
	do {
		str=br.readLine();
		str.trim();
		if(str.equals("Illinose"))
			System.out.println("  Capital is Springfield");
		else if(str.equals("Missouri"))
			System.out.println("Capital is Jefferson City.");
		else if(str.equals("Washington"))
			System.out.println("Capital is Olympia.");
   }while(!str.equals("stop"));
  }
}



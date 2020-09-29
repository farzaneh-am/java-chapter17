package chapter17;

public class Sort_String {
	static String str[]= {"ali","mehdi","amir","farzaneh","fariba","hafez","Mohammad","Ezat"};
	void bycompareto() {
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[j].compareTo(str[i])<0) {
					String t;
					t=str[i];
					str[i]=str[j];
					str[j]=t;
				}
			}
			System.out.println(str[i]);
		}
	}
	void bycompareToIgnoreCase() {
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[j].compareToIgnoreCase(str[i])<0) {
					String t;
					t=str[i];
					str[i]=str[j];
					str[j]=t;
				}
			}
			System.out.println(str[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Sort_String name=new  Sort_String();
		 System.out.println("Example for compareTo Method: ");
		 name.bycompareto();
		 System.out.println("Example for compareToIgnoreCase Method: ");
		 name.bycompareToIgnoreCase();
		 
	}

}

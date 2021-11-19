import java.util.*;

public class StringTangleProject {

	public static Scanner input=new Scanner(System.in);
	public static void main(String[] args) {
		int i=1;
		while (i!=0) {
		input.useDelimiter(System.lineSeparator());
		int choice=0;
		System.out.println("1-Print my string backward");
		System.out.println("2-Make a list of words in my string with a given length");
		System.out.println("3-Print out number of vowels in my string");
		System.out.println("4-Inverse Character case of my string");
		System.out.println("5-Compare to a 2nd string for content eqality");
		System.out.println("6-Replace a word in your string with a new word");
		System.out.println("7-Quit");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Input your preferred command");
		System.out.println("----------------------------------------------------------------------------------");
		choice=input.nextInt();

		if (choice==1) {
			System.out.println("You have chosen to print a string backwards;");				//complete
			System.out.println("Please input your string:");
			String tt=input.next();
			System.out.println("Your string backwards is:");
			Reverse(tt);
			System.out.println("----------------------------------------------------------------------------------");
		}
		if (choice==2) {
			System.out.println("You have chosen to make a list of words in a string with a given length;");
			System.out.println("Please input your string:");
			String t=input.next();
			String tt=t+" ";
			System.out.println("What is your desired Length?");
			int ttr=input.nextInt();
			wordsl(tt, ttr);
			System.out.println("----------------------------------------------------------------------------------");
		}
		if (choice==3) {
			System.out.println("You have chosen to print the number of voewls in a string;");	//complete
			System.out.println("Please input your string:");
			String tt=input.next();
			System.out.print("Your string has: ");
			Vowels(tt);
			System.out.println("----------------------------------------------------------------------------------");
		}
		if (choice==4) {
			System.out.println("You have chosen to inverse character case of a string;");		//complete
			System.out.println("Please input your string:");
			String tt=input.next();
			System.out.println("Your string with inverse case is:");
			InvCase(tt);
			System.out.println("----------------------------------------------------------------------------------");
		}
		if (choice==5) {
			System.out.println("You have chosen to compare to a 2nd string for content equality;");	//complete
			System.out.println("Please input your string:");
			String tt=input.next();
			System.out.println("Please input the string you wish to compare:");
			String ttc=input.next();
			Compare(tt,ttc);
			System.out.println("----------------------------------------------------------------------------------");
		}
		if (choice==6) {
			System.out.println("You have chosen to replace a word in a string with a new word;");
			System.out.println("Please input your string:");
			String tt=input.next();
			System.out.println("what word would you like to find?");
			String find;
			find=input.next();
			System.out.println("what word would you like to replace it with?");
			String replace;
			replace=input.next();
			WordRep(tt,find,replace);
			System.out.println("----------------------------------------------------------------------------------");
		}
		if (choice==7) {
			System.out.println("You have chosen to quit");
			System.out.println("----------------------------------------------------------------------------------");
			i=0;
		}
	}
	}
	public static void Reverse(String tt) {
		//Print string backwards
		for (int i=tt.length()-1;i>=0;i--) {
			System.out.print(tt.charAt(i));
		}
		System.out.println(" ");
	}

	public static void InvCase(String tt) {
		//Inverse the case of my String
		for (int i=0; i<tt.length();i++) {
			String tu=tt.toUpperCase();					//make 2 new strings, one upper case and one lower case			
			String tl=tt.toLowerCase();		
			if(tt.charAt(i)==tu.charAt(i)) {		//check for matching (upper case) characters
				System.out.print(tl.charAt(i));		//print upper case from tl string
			}
			else {									//print lower case from tu string
				System.out.print(tu.charAt(i));     
			}
		}
		System.out.println(" ");
	}
	public static void Compare(String tt, String ttc) {
		//Compare to a 2nd string for content equality
		//for (int i=0; i<tt.length();i++) {						//loops through each character, find out how to choose longer string for "tt.lenth" in case ttc>tt
		if (tt.equals(ttc))	{
			System.out.println("These strings are similar");
		}
		else {
			System.out.println("These strings are not similar");
		}
	}
	public static void Vowels(String tt) {
		//Print out number of vowels in a string
		int count=0;
		for (int i=0; i<tt.length();i++) {
			if (tt.charAt(i)=='a'||tt.charAt(i)=='e'||tt.charAt(i)=='i'||tt.charAt(i)=='o'||tt.charAt(i)=='u') {
				count=count+1;
			}
		}
		System.out.print(count);
		System.out.println(" Vowels");
	}
	public static void wordsl(String tt,int tti) {
		int tr=0;
		String ttr=" ";
		for (int i=1;i<tt.length();i++) {
			int wl=i-tr;
			if (tt.charAt(i)==ttr.charAt(0)&&(wl)==tti) {
				System.out.println(tt.substring(tr,i));
				tr=i+1;
			}
			if (tt.charAt(i)==ttr.charAt(0)) {
				tr=i+1;
			}
			if (i==tt.length()) {
				System.out.println(tt.substring(tr,tt.length()-1));
			}
		}
	}
	public static void WordRep(String tt,String find,String replace) {
		int start=0;
		String temp="";
		System.out.println(tt.replace(find,replace));
	}
}	




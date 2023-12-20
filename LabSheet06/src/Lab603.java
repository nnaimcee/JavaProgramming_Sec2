import java.util.*;
public class Lab603 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Please enter your name, separated by a space. \n: ");
		String fullname = scn.nextLine();
		int space = fullname.indexOf(" ");
		String firstName = fullname.substring(0,space);
		System.out.println(abbreviatName(fullname)+firstName);
	}
	
	public static String abbreviatName(String fullname) {
		String shortname = "";
		for(int i = 0;i < fullname.length()-1;i++) {
			if(fullname.charAt(i) == ' ') {
				shortname += fullname.charAt(i+1)+".";	
			}	
		}
		return shortname;		 
	}
}

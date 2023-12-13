import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Full Name : ");
		String fullName = scn.nextLine();
		String firstName = "",lastName = "";
		if(fullName.indexOf(" ") == -1) {
			System.out.println("Incorrect Name");
		}	
		else {
			firstName = fullName.substring(0,fullName.indexOf(" "));
			lastName = fullName.substring(fullName.indexOf(" "),fullName.length());
			System.out.println("First Name : "+firstName.toUpperCase());
			System.out.println("Last Name : " +lastName.toLowerCase());
		}
		
	}

}

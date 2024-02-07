import java.io.*;
import java.util.*;
public class Lab1202 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter e-mail : ");
		String email = scn.nextLine();
		
		BufferedReader read = new BufferedReader(new FileReader("D://txtFile//MemberLogin.txt"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			if(email.equalsIgnoreCase(data[3])) {
				System.out.println("Your password is " + data[2]);
			}		
		}
		read.close();
	}

}

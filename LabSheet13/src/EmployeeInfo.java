import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException{
		Scanner scn = new Scanner(System.in);
		
		String choice,department;
		
		System.out.print("Insert of Read data? : ");
		choice = scn.next().toLowerCase();
		while(!(choice.equals("insert")) && !(choice.equals("read"))) {
			System.out.print("Please type insert of read data? : ");
			choice = scn.next().toLowerCase();
		}
		
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) {
			obj.insert();
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter department : ");
			department = scn.next();
			obj.setDept(department);
			obj.read();
		}
	}

}

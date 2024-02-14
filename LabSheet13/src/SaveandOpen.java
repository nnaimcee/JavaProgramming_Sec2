import java.util.*;
import java.io.*;
public class SaveandOpen extends Employee {
	private String name;
	private String dept;
	
	
	public void insert() throws IOException {
		PrintStream writeFile = new PrintStream(new File("d://txtFile//employee.txt"));
		Scanner scn = new Scanner(System.in);
		String answer;
		
		do{
			header();
			System.out.print("Enter name : ");
			name = scn.next();
			System.out.print("Enter department : ");
			dept = scn.next();
			
			writeFile.println(name + "\t" + dept);
			System.out.print("Enter data, again? : ");
			answer = scn.next().toLowerCase();
			
		}
		while(answer.equals("y"));
	}
	
	public void read() {
		try {
			Scanner readFile = new Scanner(new File("d://txtFile//employee.txt"));
			boolean check = false;
			header();
			int i = 1;
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(i + ") " + name);
					check = true;
					i++;
				}	
			}
			if(check == false) {
				System.out.println("\nSorry, no department : " + super.getDept() + " in File");
			}
			header();
			if(check) {
				System.out.println("Employee in department " + super.getDept() + " is " + (i-1) + " person.");
			}
			readFile.close();
		}
		catch(IOException e) {
			System.out.println("\nSorry file not found . . ");
		}
	}
}

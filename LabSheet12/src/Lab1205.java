import java.io.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D://txtFile//student.txt"));
		String temp = "";
		int i = 1;
		Header();
		while((temp = read.readLine()) != null) {
			String[] data = temp.split(" ");
			double grade = Double.parseDouble(data[4]);
			System.out.println(i + "\t" + data[0] + "\t" + Level(data[0]) + "\t" 
								+ data[2].substring(0,1) + "." + data[3] + "\t" + grade + "\t" + Status(grade));
			i++;
		}
		read.close();	
	}
	
	public static String Level(String id) {
		if(id.startsWith("19")) {
			return "3th";
		}
		else {
			return "4th";
		}		
	}
	
	public static String Status(double grade) {
		if(grade < 1.00) {
			return "Retired";
		}
		else if(grade > 1.00 && grade < 2.00) {
			return "Critical";
		}
		else {
			return "Pass";
		}
	}
		
	
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("*****************************************************************");
	}
	

}

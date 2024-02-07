import java.util.*;
import java.io.*;
public class Example1202 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input Section : ");
		int section = scn.nextInt();
		Header(section);
		showListStudent(section);
		
		

	}
	
	public static void showListStudent(int section) throws IOException {
		BufferedReader read = new BufferedReader(new FileReader("D://txtFile//List107.txt"));
		String temp = "";
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			int sectionData = Integer.parseInt(data[3]);
			double midtermScore = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[5]);
			if(sectionData == section) {
				System.out.println(data[0] + "\t" + data[2] + "\t" + midtermScore + "\t" + finalScore + "\t" + findResult(midtermScore,finalScore));
			}		
		}
		
		read.close();
	}
	
	public static String findResult(double Mid, double Final) {
		double totalScore = Mid+Final;
		/*if(totalScore <= 40) {
			return "Fail";
		}
		else {
			return "Pass";			
		}*/
		return totalScore <= 40?"Fail" : "Pass";
	}
	
	public static void Header(int section) {
		System.out.println("*****************************************************");
		System.out.println("\t\tList of Data for Section " + section);
		System.out.println("*****************************************************");
	}
	

}

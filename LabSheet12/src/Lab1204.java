import java.io.*;
import java.util.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter rating of books : ");
		double Inputrating = scn.nextDouble();
		BufferedReader read = new BufferedReader(new FileReader("D://txtFile//BookData.txt"));
		String temp = "";
		int i = 1, count = 0;
		System.out.println("-------------------------------------------------------------------");
		while((temp = read.readLine()) != null) {
			String[] data = temp.split("\t");
			double BookRating = Double.parseDouble(data[2]);
			if(BookRating >= Inputrating) {
				System.out.println("Book " + i + " : " + data[0] + " write by " + data[1] + " (" + data[3] + ") reviews");
				count++;
			}	
			i++;
		}
		read.close();
		System.out.println("-------------------------------------------------------------------");
		System.out.println("There are " + count + " book get rating more than " + Inputrating);
		
		
	}

}

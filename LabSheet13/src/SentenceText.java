import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException{
		// create object for write(save) data to File using PrinStream Class
		PrintStream writeFile = new PrintStream(new File("d://txtFile//sentence.txt"));
		Scanner scn = new Scanner(System.in);
		int i = 1;
		
		while(true) {
			System.out.print("Sentence : ");
			String word = scn.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			
			writeFile.println(i+" : " + word);
			i++;
		}
		writeFile.close();
		System.out.println("File is saved");
		
	}

}

import java.util.*;
public class Example_503 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		String sentence = scn.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("Input a sentence, again : ");
			sentence = scn.nextLine();		
		}
		int countSpace = 0;
		for(int i = 0 ; i < sentence.length()-1 ; i++ ) {
			if(sentence.charAt(i) == ' ') {
				countSpace++;
			}		
		}
		System.out.println();
		System.out.println("This sentence has " + countSpace + " spacebar.");
		System.out.println("This sentence has " + (countSpace+1) + " word.");
	}

}

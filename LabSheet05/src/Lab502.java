import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String word = scn.nextLine();
		while(!word.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			word = scn.nextLine();	
		}
		for(int i = 0; i < word.length();i++) {
			if(word.charAt(i) == ' ') {
				System.out.println();
			}
			else {
				System.out.print(word.charAt(i));
			}
			
		}
		
	}

}

import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Message : ");
		String word = scn.nextLine();
		int count = 0;
		String message = word;
		word = word.toLowerCase();
		if(word.indexOf("nichi") >= 0){
			count += 1;	
		}
		
		if(count == 0) {
			System.out.print(message);
		}else {
			System.out.print("Nichi is a sentence");
		}
		
	}

}

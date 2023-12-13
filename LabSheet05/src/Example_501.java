import java.util.*;
public class Example_501 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String word,text = "";
		while(true) {
			System.out.print("Enter word: ");
			word = scn.next();
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			text += word+" ";
		}
		System.out.print(text.toUpperCase());
	}

}

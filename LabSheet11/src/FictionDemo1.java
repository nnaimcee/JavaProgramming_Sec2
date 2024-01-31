import java.util.*;
public class FictionDemo1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Input Title : ");
		String title = scn.nextLine();
		
		System.out.print("Input PublishYear : ");
		int publishyear = scn.nextInt();
		FictionBook book = new FictionBook(title,publishyear);
		
		scn.nextLine();// buffer
			
		do {	
			System.out.print("Input Author Name : ");
			book.setAuthorName(scn.nextLine());
		
		}while(!book.checkFormatName());
				
		
		do {
			System.out.print("Input Email : ");
			book.setEmail(scn.nextLine());
		}while(!book.checkEmail());
	
		System.out.println();
		System.out.println(book);

	}

}

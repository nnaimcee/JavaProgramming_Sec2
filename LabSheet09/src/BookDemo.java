import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Book b1 = new Book();
		
		System.out.print("Input book title : ");
		String title = scn.nextLine();
		b1.setTitle(title);

		System.out.print("Input book price : ");
		float price = scn.nextFloat();
		b1.setPrice(price);
		
		System.out.print("Input publish year : ");
		int year = scn.nextInt();
		b1.setPublishyear(year);
		
		
		
		System.out.println();
		System.out.println(b1);
		
		
		
		
	}

}

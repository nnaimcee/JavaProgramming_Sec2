
public class Example1 {

	public static void main(String[] args) {
		String bookIsbn = "IB2-6325-85-4-1";
		String bookTitle = "Basic Java Programming";
		int bookUnit = 5;
		float bookPrice = 225.75f;
		
		
		System.out.println("Book ISBN 	: "+bookIsbn);
		System.out.println("Book Title	: "+bookTitle);
		System.out.println("Book Unit 	: "+bookUnit +" Books.");
		System.out.println("Book Price	: "+bookPrice+" Baht.");
		
		System.out.println("---------------------------------");
		
		float TotalPrice = bookUnit * bookPrice;
		System.out.println("Total Price is " + TotalPrice);
		float Vat = TotalPrice + (TotalPrice * 7/100 );
		System.out.println("Add VAT 7%  is " + Vat);
		
	}

}

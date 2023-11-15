import java.text.*;
import java.util.*;
public class Example3 {

	public static void main(String[] args) {
		
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Input product name 	: ");
		String productName = scn.nextLine();
		
		System.out.print("Input product unit	: ");
		int productUnit = scn.nextInt();
		
		System.out.print("Input price per unit 	: ");
		float priceperUnit = scn.nextFloat();
		
		System.out.println();
		
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is " + frm.format(totalPrice) + "baht.");
		float totalVat = totalPrice + (totalPrice * 7 / 100);
		System.out.println("Add VAT 7%  is " + frm.format(totalVat) + "baht.");
		
		
		
	}

}

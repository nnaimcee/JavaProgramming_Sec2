import java.text.*;
import javax.swing.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input Product Name :");
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input Product Unit :"));
		float productPrice = Float.parseFloat(JOptionPane.showInputDialog("Input Price per unit :"));
		
		float totalPrice = productPrice * productUnit;
		float vatPrice = totalPrice + (totalPrice * 7 / 100);
		
		
		JOptionPane.showMessageDialog(null, "Total Price is " + frm.format(totalPrice) + " baht."
				+ "\nAdd VAT 7% is " + frm.format(vatPrice)+" baht.");
	}

}

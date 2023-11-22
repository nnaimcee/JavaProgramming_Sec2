import java.util.*;
import javax.swing.*;
import java.text.*;
public class Withdrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;		
		int withdraw = Integer.parseInt(JOptionPane.showInputDialog("Your balance : " + frm.format(balance) + "\nInput money to withdraw : "));	
		if(withdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw more than balance","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if(withdraw > 20000) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw mor than 20,000","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw % 100 != 0) {
			JOptionPane.showMessageDialog(null, "Error : Cannot withdraw " + withdraw % 100 + " baht.","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw <= balance) {
			JOptionPane.showMessageDialog(null, "You withdraw " + frm.format(withdraw) + " baht.\n" + "1,000 = " + withdraw / 1000 + "\n500 = " + (withdraw%1000)/500 + "\n100 = " + (withdraw%500)/100);
			
		}
		
	}

}

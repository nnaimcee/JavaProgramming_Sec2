import javax.swing.*;
public class Lab601 {

	public static void main(String[] args) {
		inputEmail();
		

	}
	public static boolean checkEmail(String email) {
		if(email.endsWith("@hotmail.com") || email.endsWith("@gmail.com")) {			
			return true;
		}
		else {
			return false;
		}	
	}
	public static void inputEmail() {
		String inputEmail = JOptionPane.showInputDialog("Input your e-mail: ").toLowerCase();
		
		boolean checkedEmail = checkEmail(inputEmail);
		
		displayEmail(checkedEmail,inputEmail);
		
	}
	public static void displayEmail(boolean checkedEmail, String Email) {
		if(checkedEmail) {
			JOptionPane.showMessageDialog(null, "Your e-mail is " + Email);
		}
		else {
			JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail ");
		}
	}

}

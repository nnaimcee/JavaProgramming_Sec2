import javax.swing.*;
import java.text.*;
public class Example3 {

	public static void main(String[] args) {
		//DecimalFormat frm = new DecimalFormat("#.0");
		float inputWeight = Float.parseFloat(JOptionPane.showInputDialog("Input Weight : "));
		float inputHeight = Float.parseFloat(JOptionPane.showInputDialog("Input Height : "));
		
		inputHeight /= 100;
		float bmi = inputWeight / (inputHeight * inputHeight);
		String bmiCatagory;
		if(bmi < 18.5) {
			bmiCatagory = "Underweight";
		}
		else if (bmi < 25) {
			bmiCatagory = "Normal-weight";
		}
		else if (bmi < 30) {
			bmiCatagory = "Overweight";
		}
		else {
			bmiCatagory = "Obesity";
		}
			
		JOptionPane.showMessageDialog(null, "BMI = " + String.format("%.1f",bmi) + "\nYou're " + bmiCatagory);
		
		
	}

}

import javax.swing.*;
public class RectagleDemo1 {

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input Width : "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input Length : "));
		String color = JOptionPane.showInputDialog("Input Color : ");
		
		Rectangle rec = new Rectangle(width,length,color);
		JOptionPane.showMessageDialog(null, rec.toString() + "\nThe area of Rectangle is " + rec.getArea());
		
	}

}

import javax.swing.*;
public class RectangleDemo2 {

	public static void main(String[] args) {
		double width = Double.parseDouble(JOptionPane.showInputDialog("Input Width : "));
		double length = Double.parseDouble(JOptionPane.showInputDialog("Input Length : "));
		//String color = JOptionPane.showInputDialog("Input Color : ");
		
		Rectangle2 rec = new Rectangle2(width,length);
		JOptionPane.showMessageDialog(null, rec.toString() + "\nThe area of Rectangle is " + rec.getArea());
	}

}

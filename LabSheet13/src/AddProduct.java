import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt",true));
		Scanner scn = new Scanner(System.in);
		
		//System.out.println("");
		
		System.out.print("Input product Id : ");
		String productId = scn.next();
		System.out.print("Input product Name : ");
		String productName = scn.next();
		System.out.print("Input product Unit : ");
		int productUnit = scn.nextInt();
		System.out.print("Input product Price : ");
		float productPrice = scn.nextFloat();
		
		writeFile.println(productId + "," + productName + "," + productUnit + "," + productPrice);
		System.out.println("Save file already . . . ");
		writeFile.close();
	}

}

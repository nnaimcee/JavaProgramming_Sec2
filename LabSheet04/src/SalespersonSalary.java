import java.util.*;
import java.text.*;
public class SalespersonSalary {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat frm = new DecimalFormat("$#,###.00");
		
		final double COMMISSION_RATE = 0.15;
		final int SENTINEL = -1; 
		 
		int sales; 
		double salary; 
		
		
		while(true) {
			System.out.print("Enter sales in dollars (or -1 to end) : ");
			sales = scn.nextInt();
			if(sales > 0) {
				salary = sales * COMMISSION_RATE + 1000;	
				System.out.println("Salary is : " + frm.format(salary));
				System.out.println();
			}
			else {
				System.out.print("bye");
				break;
			}
		}

		
		
		

	}

}

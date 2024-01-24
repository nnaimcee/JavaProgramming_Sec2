import java.util.*;
import java.text.*;
public class EmployeeDemo {
	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Input employee id : ");
		String id = scn.nextLine();
		
		System.out.print("Input employee name : ");
		String name = scn.nextLine();
		
		System.out.print("Input employee salary : ");
		double salary = scn.nextDouble();
		
		System.out.print("Input employee sales : ");
		double sales = scn.nextDouble();
		
		Sales empSale = new Sales(id,name,salary,sales);
		
		System.out.println();
		
		
		System.out.println(empSale);
		System.out.println("Total salary " + frm.format(empSale.getSalary() + empSale.getCommission()) + " baht.");
	}

}

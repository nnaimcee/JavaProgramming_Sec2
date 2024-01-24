import java.text.*;
public class Sales extends Employee{
	
	DecimalFormat frm = new DecimalFormat("#,###.00");
	
	private double sales;
	
	public Sales(String id, String name, double salary, double sales) {
		super(id,name,salary);
		this.sales = sales;
	}
	
	public Sales(String id, String name, double sales) {
		super(id,name);
		this.sales = sales;
	}
	
	public double getCommission() {
		if(sales >= 50000) {
			return (sales - 50000) * 0.15;
		}
		else if(sales >= 10000) {
			return (sales - 10000) * 0.10;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		return super.getName() + " (" + super.getId() + ") get commission " + frm.format(getCommission()) + " baht.";
	}
}

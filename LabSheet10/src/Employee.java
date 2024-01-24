
public class Employee {
	private String id;
	private String name;
	private double salary;
	
	public Employee() {
		id = "";
		name = "";
		salary = 0;
	}
	
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Employee(String id, String name) {
		this.id = id;
		this.name = name;
		this.salary = 0;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
}

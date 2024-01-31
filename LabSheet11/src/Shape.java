
public abstract class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	
	public Shape() {
		this.color = null;
	}
	
	public String toString() {
		return "Color = " + this.color;
	}
	
	public abstract double getArea();

}

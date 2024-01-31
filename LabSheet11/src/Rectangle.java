
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle(double width, double length, String color) {
		super(color);
		this.length = length;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	@Override
	public String toString() {
		return "Rectangle[width= " + this.width + ",length= " + this.length + "," + super.toString() + "]";
	}
	
	@Override
	public double getArea() {
		return this.width * this.length;
	}
}

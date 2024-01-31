
public class Rectangle2 implements Shape2{
	private double width;
	private double length;
	
	public Rectangle2(double width, double length) {
		this.length = length;
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	
	public String toString() {
		return "Rectangle[width= " + this.width + ",length= " + this.length + "]";
	}
	
	
	public double getArea() {
		return this.width * this.length;
	}
}

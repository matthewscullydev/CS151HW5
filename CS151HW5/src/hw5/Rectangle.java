package hw5;

public class Rectangle extends Shape {

	private int length;
	private int width;
	public double area;
	
	@Override
	public double computeArea() {
		
		area = length*width;
		System.out.println("Area of Rectangle is " + area);
		return area;
		
	}
	
	public Rectangle(int length, int width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", area=" + area + "]";
	}

	
	
}

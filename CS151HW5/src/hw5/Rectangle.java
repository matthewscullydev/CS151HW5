package hw5;

public class Rectangle extends Shape {

	private int length;
	private int width;
	public double area;
	
	public double computeArea() {
		
		area = length*width;
		return area;
		
	}
	
	public Rectangle(int length, int width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

}

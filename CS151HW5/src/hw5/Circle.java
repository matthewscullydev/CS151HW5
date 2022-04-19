package hw5;

public class Circle extends Shape {
	
	private int radius;
	public double area;
	double pi = 3.14159;
	
	public double computeArea() {
		
		area = pi * radius * radius;
		return area;
		
	}
	
	public Circle (int radius) {
		super("Circle");
		this.radius = radius;
		
	}

}


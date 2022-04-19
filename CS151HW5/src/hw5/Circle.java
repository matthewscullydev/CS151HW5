package hw5;

public class Circle extends Shape {
	
	private int radius;
	public double area;
	double pi = 3.14159;
	
	@Override
	public double computeArea() {
		
		area = pi * radius * radius;
		System.out.println("Area of Circle is " + area);
		return area;
		
	}
	
	public Circle (int radius) {
		super("Circle");
		this.radius = radius;
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", pi=" + pi + "]";
	}

	
}


package hw5;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	public double area;

	
	public double computeArea() {
		
		area = base*height/2;
		return area;
		
	}
	
	public Triangle (int base, int height) {
		super("Triangle");
		this.base = base;
		this.height= height;
	}

}


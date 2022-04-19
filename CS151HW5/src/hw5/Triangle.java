package hw5;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	public double area;

	@Override
	public double computeArea() {
		
		area = base*height/2;
		System.out.println("Area of Triangle is " + area);
		return area;
		
	}
	
	public Triangle (int base, int height) {
		super("Triangle");
		this.base = base;
		this.height= height;
	}

	@Override
	public String toString() {
		return "Triangle [base=" + base + ", height=" + height + ", area=" + area + "]";
	}

	
	
}


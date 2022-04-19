package hw5;

public class Hexagon extends Shape {
	
	private int sidelength;
	public double area;

	@Override
	public double computeArea() {
		
		area = (6*(sidelength*sidelength))/(4*Math.tan(Math.PI/6));
		System.out.println("Area of Hexagon is " + area);
		return area;
		
	}
	
	public Hexagon (int sidelength) {
		super("Hexagon");
		this.sidelength = sidelength;
		
	}

	@Override
	public String toString() {
		return "Hexagon [sidelength=" + sidelength + ", area=" + area + "]";
	}

	
		
}


package hw5;

public class Hexagon extends Shape {
	
	private int sidelength;
	public double area;

	
	public double computeArea() {
		
		area = (6*(sidelength*sidelength))/(4*Math.tan(Math.PI/6));
		return area;
		
	}
	
	public Hexagon (int sidelength) {
		super("Hexagon");
		this.sidelength = sidelength;
		
	}

}


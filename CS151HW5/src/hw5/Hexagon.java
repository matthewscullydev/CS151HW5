/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the Hexagon class which contains attributes and functionality for a Hexagon shape.
 * 
 * </p>
 * 
 */

package hw5;

public class Hexagon extends Shape {
	
	private int sidelength;
	public double area;

	
	/**
	 * This is the computeArea method for a Hexagon which returns the area of a Hexagon.
	 */
	
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


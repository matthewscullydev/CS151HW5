/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the Circle class which contains attributes and functionality for a Circle shape.
 * 
 * </p>
 * 
 */

package hw5;

public class Circle extends Shape {
	
	private int radius;
	public double area;
	double pi = 3.14159;
	
	/**
	 * This is the computeArea method for a Circle which returns the area of a Circle.
	 */
	
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


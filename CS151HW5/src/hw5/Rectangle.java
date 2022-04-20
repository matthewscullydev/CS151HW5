/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the Rectangle class which contains attributes and functionality for a Rectangle shape.
 * 
 * </p>
 * 
 */

package hw5;

public class Rectangle extends Shape {

	private int length;
	private int width;
	public double area;
	
	
	/**
	 * This is the computeArea method for a Rectangle which returns the area of a rectangle.
	 */
	
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

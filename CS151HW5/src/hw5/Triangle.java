/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the Triangle class which contains attributes and functionality for a triangle shape.
 * 
 * </p>
 * 
 */

package hw5;

public class Triangle extends Shape {
	
	private int base;
	private int height;
	public double area;

	/**
	 * This is the computeArea method for a triangle which returns the area of a triangle.
	 */
	
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


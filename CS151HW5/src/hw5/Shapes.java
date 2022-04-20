/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the Shapes class which contains methods for adding, removing, computing, finding the max of, and finding the min of shapes in the shapelist
 * 
 * </p>
 * 
 */

package hw5;

import java.util.ArrayList;

public class Shapes {

	//initializing shapeList
	
	ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	
	/**
	 * this is the add method which adds a shape to the shapelist.
	 * @param s shape
	 */
	public void add(Shape s) {	
		shapeList.add(s);
	}
	
	/**
	 * this is the remove method which removes a shape to the shapelist.
	 * @param s shape
	 */
	public void remove(Shape s) {	
		shapeList.remove(s);
	}
	
	
	/**
	 * This is the compute method which computes the area of shapes in the shapelist.
	 */
	public synchronized void compute() {
		
			for(Shape s: shapeList)
			{
				s.start();
			}
	}
	
	/**
	 * This is the max method which finds the max of the given shapes in the shapelist
	 * @return this function returns the shape with the max area.
	 */
	
	public Shape max() {
		double maxArea = -1;
		Shape maxShape = null;
		
		for(Shape shape : shapeList)
		{
			if(shape.computeArea() > maxArea) {
				maxArea = shape.computeArea();
				maxShape = shape;
			}
	
		}
		return maxShape;
	}
	
	/**
	 * This is the max method which finds the max of the given shapes in the shapelist
	 * @return this function returns the shape with the max area.
	 */
	
	public Shape min() {
		double minArea = Integer.MAX_VALUE;
		Shape minShape = null;
		
		for(Shape shape : shapeList)
		{
			if(shape.computeArea() < minArea) {
				minArea = shape.computeArea();
				minShape = shape;
			}
	
		}
		return minShape;
	}
	
	public ArrayList<Shape> getShapeList() {
		return shapeList;
	}

	public void setShapeList(ArrayList<Shape> shapeList) {
		this.shapeList = shapeList;
	}

	public Shapes(ArrayList<Shape> shapeList) {
		
		this.shapeList = shapeList;
		
	}

	@Override
	public String toString() {
		return "Shapes [shapeList=" + shapeList + "]";
	}

}

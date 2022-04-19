package hw5;

import java.util.ArrayList;

public class Shapes {

	
	ArrayList<Shape> shapeList = new ArrayList<Shape>();
	
	public void add(Shape s) {	
		shapeList.add(s);
	}
	
	public void remove(Shape s) {	
		shapeList.remove(s);
	}
	
	public synchronized void compute() {
		
			for(Shape s: shapeList)
			{
				s.start();
			}
	}
	
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

}

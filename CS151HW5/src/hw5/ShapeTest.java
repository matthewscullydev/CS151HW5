package hw5;

import java.util.ArrayList;

public class ShapeTest {

	public static void main (String []args) {
		
		Rectangle shape1 = new Rectangle(2, 5);
		Circle shape2 = new Circle(23);
		Triangle shape3 = new Triangle(2,56);
		Hexagon shape4 = new Hexagon(10);
		
		Rectangle shape5 = new Rectangle(8, 12);
		Circle shape6 = new Circle(7);
		Triangle shape7 = new Triangle(12,32);
		Hexagon shape8 = new Hexagon(8);
		
		
		Shapes shapes = new Shapes(new ArrayList<Shape>());
		
		shapes.add(shape1);
		shapes.add(shape2);
		shapes.add(shape3);
		shapes.add(shape4);
		shapes.add(shape5);
		shapes.add(shape6);
		shapes.add(shape7);
		shapes.add(shape8);
		
		
		
		shapes.compute();
	
		/*
		
		System.out.println("Running Calculations..");
		System.out.println();
		
		Shape max = shapes.max();
		
		System.out.println();
		System.out.println();

		
		System.out.println("MAX SHAPE IS " + max);
	
		System.out.println();
		System.out.println();
		
		System.out.println("Running Calculations..");
		System.out.println();
		
		Shape min = shapes.min();
		
		System.out.println();
		System.out.println();

		
		System.out.println("MIN SHAPE IS " + min);
		
		*/
	}
	
	
	
	public ShapeTest() {
		// TODO Auto-generated constructor stub
	}

}

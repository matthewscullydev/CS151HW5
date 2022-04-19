package hw5;

public class ShapeTest {

	public static void main (String []args) {
		
		Rectangle shape1 = new Rectangle(2, 5);
		Circle shape2 = new Circle(23);
		Triangle shape3 = new Triangle(2,56);
		Hexagon shape4 = new Hexagon(10);
		
		shape1.computeArea();
		shape2.computeArea();
		shape3.computeArea();
		shape4.computeArea();
		
		
		System.out.println(shape1.area);
		
		System.out.println(shape1.type);
		
		System.out.println();
		
	System.out.println(shape2.area);
		
		System.out.println(shape2.type);
		
		System.out.println();
		
	System.out.println(shape3.area);
		
		System.out.println(shape3.type);
		
		System.out.println();
		
	System.out.println(shape4.area);
		
		System.out.println(shape4.type);
		
		System.out.println();
	}
	
	public ShapeTest() {
		// TODO Auto-generated constructor stub
	}

}

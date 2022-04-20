/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Course class
 * <p>
 * 
 * This is the Shape class which contains thread functionality and the run function.
 * 
 * </p>
 * 
 */

package hw5;

public class Shape extends Thread {


	public String type;
	
	/**
	 *  This is the run function try catches the run thread event for computing area.
	 */
	
	public void run()
	{
		try {
			computeArea();
			
		}
		
		catch(Exception e){
			System.out.println(e);
		}
	}

	public double computeArea() {
		return 0;}
	
	public Shape(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Shape [type=" + type + "]";
	}

}

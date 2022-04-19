package hw5;

public class Shape extends Thread {


	public String type;
	
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

}

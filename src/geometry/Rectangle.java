package geometry;

public class Rectangle implements Shape {
	private static final String TYPE = "rectangle";
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getwidth() {
		return width;
	}

	public double getlength() {
		return length;
	}
	
	@Override
	public double computeArea() {
		return width * length;
	}
	
	@Override
	public String getType() {
		return TYPE;
	}

}

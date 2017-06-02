package geometry;

public class Triangle implements Shape {
	private static final String TYPE = "triangle";
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(double side1, double side2, double side3) {
		// TODO		 
	}
	
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double computeArea() {
		return 0.5 * base * height;
	}

	@Override
	public String getType() {
		return TYPE;
	}
	
}

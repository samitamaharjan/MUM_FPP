package geometry;

public class Circle implements Shape {
	private static final String TYPE = "circle";
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}

	@Override
	public double computeArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	@Override
	public String getType() {
		return TYPE;
	}

}

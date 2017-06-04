package geometry;

public class Triangle implements Shape {
	private static final String TYPE = "triangle";
	
	private double base;
	private double height;
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public Triangle(double side1, double side2, double side3) {
		// TODO
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
		double p = (side1 + side2 + side3) / 2;
		double area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
		base = Math.max(Math.max(side1, side2), side3);
		height = area / base * 2;
	}
		
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
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

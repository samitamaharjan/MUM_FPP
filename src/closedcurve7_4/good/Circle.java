package closedcurve7_4.good;

import closedcurve.ClosedCurve;

public final class Circle extends ClosedCurve implements Polygon {
	private final double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double computeArea() {
		return (Math.PI * radius * radius);
	}

	@Override
	public String getCurveType() {
		return "Circle";
	}

	@Override
	public int getNumberOfSides() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double computePerimeter() {
		return 2 * Math.PI * radius;
	}
}

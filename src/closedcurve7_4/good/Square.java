package closedcurve7_4.good;

import closedcurve.ClosedCurve;

public final class Square extends ClosedCurve implements Polygon {
	private final double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public double computeArea() {
		return side * side;
	}

	@Override
	public String getCurveType() {
		return "Square";
	}

	@Override
	public int getNumberOfSides() {
		return 4;
	}

	@Override
	public double computePerimeter() {
		return 4 * side;
	}
}

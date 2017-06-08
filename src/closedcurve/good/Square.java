package closedcurve.good;

import closedcurve.ClosedCurve;

public final class Square extends ClosedCurve {
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
}

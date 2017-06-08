package closedcurve7_5.good;

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
	public double[] getArrayOfSides() {
		double[] arr = new double[getNumberOfSides()];
		
		arr[0] = side;
		arr[1] = side;
		arr[2] = side;
		arr[3] = side;
		return arr;
	}

}

package closedcurve.good;

import closedcurve.ClosedCurve;

public class Rectangle extends ClosedCurve {
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	@Override
	public double computeArea() {
		return width * length;
	}

	@Override
	public String getCurveType() {
		return "Rectangle";
	}
}

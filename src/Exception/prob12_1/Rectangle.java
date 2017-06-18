package Exception.prob12_1;

public class Rectangle extends ClosedCurve {

	private double width;
	private double length;
	public Rectangle(double width, double length) throws IllegalClosedCurvedException {
		if (length < 0 || width < 0) {
			throw new IllegalClosedCurvedException("An IllegalClosedCurveException was thrown in a Rectangle instance.");
		}
		this.length = length;
		this.width = width;
	}
	
	double computeArea() {
		return width*length;
	}
	


}

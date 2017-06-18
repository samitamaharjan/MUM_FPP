package Exception.prob12_1;

public class Square extends ClosedCurve {
	double side;
	public Square(Double side) throws IllegalClosedCurvedException {
		this(side.doubleValue());
	}
	public Square(double side) throws IllegalClosedCurvedException {
		if (side < 0) {
			throw new IllegalClosedCurvedException("An IllegalClosedCurveException was thrown in a Square instance");
		}
		this.side = side;
	}
	double computeArea() {
		return(side*side);
	}

}

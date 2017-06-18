package Exception.prob12_1;

public class Circle extends ClosedCurve {
	double radius;
	public Circle(Double radius) throws IllegalClosedCurvedException{
		this(radius.doubleValue());
	}
	public Circle(double radius) throws IllegalClosedCurvedException {
		if (radius < 0) {
			throw new IllegalClosedCurvedException("An IllegalClosedCurveException was thrown in a Circle instance.");
		}
		this.radius = radius;
	}
	double computeArea() {
		return (Math.PI * radius * radius);
	}
}

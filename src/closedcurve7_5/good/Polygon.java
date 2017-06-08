package closedcurve7_5.good;

public interface Polygon {
	public int getNumberOfSides();
	//public double computePerimeter();
	public String getCurveType();
	public double[] getArrayOfSides();
	
	static double sum(double[] arr) {
		return 0;
	}
	
	default double computePerimeter() {
		double perimeter = 0;
		double[] arr = getArrayOfSides();
		for (double peri : arr) {
			perimeter += peri;
		}
		return perimeter;
	}
}

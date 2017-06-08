package closedcurve7_5.good;

public class Test3 {
	
	public static void main(String[] args) {
		Polygon[] objects = {new Square(3),
								new Triangle(4,5,6),
								 new Rectangle(3, 4)};
		//compute areas
		for(Polygon cc : objects) {
			System.out.printf("For this %s%nNumber of sides = %d%nPerimeter = %.1f%n", 
					cc.getCurveType(), cc.getNumberOfSides(), cc.computePerimeter());
		}
	}
}

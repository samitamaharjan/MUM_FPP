package geometry;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Shape triangle = new Triangle(5.0, 3.0);
		Shape triangle1 = new Triangle(5.0, 6.0, 7.0);
		Shape rectangle = new Rectangle(5.0, 4.0);
		Shape circle = new Circle(2.5);
		
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(triangle);
		shapes.add(rectangle);
		shapes.add(circle);
		shapes.add(triangle1);
		
		for (Shape shape : shapes) {
			System.out.printf("Area of %s is %.2f%n", shape.getType(), shape.computeArea());
		}
	}

}

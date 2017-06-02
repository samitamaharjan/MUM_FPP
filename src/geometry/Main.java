package geometry;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Shape triangle = new Triangle(5.0, 3.0);
		Shape rectangle = new Rectangle(5.0, 4.0);
		Shape circle = new Circle(2.5);
		
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(triangle);
		shapes.add(rectangle);
		shapes.add(circle);
		
		for (Shape shape : shapes) {
			System.out.printf("Area of %s is %.2f%n", shape.getType(), shape.computeArea());
		}
	}

}

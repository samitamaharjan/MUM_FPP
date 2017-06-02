package classwork;

public class TankMutable {
	private double radius;
	private double length;
	double volume;
	
	public TankMutable(double radius, double length) {
		this.radius = radius;
		this.length = length;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	public double volumenOfTank() {
		return volume = 2 * Math.PI * getRadius() * getRadius();
	}
	
	public String toString() {
		return "Volume: %0.2f" + volumenOfTank();
	}
}

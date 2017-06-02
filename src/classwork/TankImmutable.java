package classwork;

public class TankImmutable {

		private double radius;
		private double length;
		double volume;
	
		public TankImmutable(double radius, double length) {
			this.radius = radius;
			this.length = length;
		}

		public double getRadius() {
			return radius;
		}

		public double getLength() {
			return length;
		}
		
		public double volumenOfTank() {
			return volume = 2 * Math.PI * getRadius() * getRadius();
		}
		
		public String toString() {
			return "Volume: %0.2f" + volumenOfTank();
		}
	
}

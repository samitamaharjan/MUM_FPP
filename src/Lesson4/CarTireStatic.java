package Lesson4;

public class CarTireStatic {
	public static void main(String[] args) {
		// System.out.println(CarStatic.getRadius());
	}
}

class CarStatic {
	static class Tire {
		static double circumference;
		
		public Tire(double circumference) {
			this.circumference = circumference;
		}
		
		static double getRadius() {
			return circumference / (2 * Math.PI);
		}
	}
	 
}
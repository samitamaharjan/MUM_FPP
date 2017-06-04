package Lesson4;

public class CarStatic {
	private Tire t = new Tire();
	{
		t.circumstance = 5.0;
	}
	
	private void radiusOfTire() {
		double radius = t.getCircumstance() / (2 * Math.PI);
		System.out.println("Radius of tire: " + radius);
	}
	 
	static class Tire {
		private double circumstance;
		
		public double getCircumstance() {
			return circumstance;
		}
	}
	
	public static void main(String[] args) {
		
		(new CarStatic()).radiusOfTire();
	}
}

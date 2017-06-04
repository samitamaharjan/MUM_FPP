package Lesson4;

public class InnerCar {
	private Tire t = new Tire();
	{
		t.circumstance = 5.0;
		System.out.println(t);
	}
	
	class Tire {
		private double circumstance;
		
		public double getCircumstance() {
			return circumstance;
		}
		
		private double radiusOfTire() {
			return t.getCircumstance() / (2 * Math.PI);
		}
		
		public String toString() {
			return String.format("The radius of tire is %.3f", radiusOfTire());
		}
	}
	
	public static void main(String[] args) {
		
		new InnerCar();
	}
}

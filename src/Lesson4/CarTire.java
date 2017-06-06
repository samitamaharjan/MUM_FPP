package Lesson4;

class CarTire {
	public static void main(String[] args) {
		System.out.println(new CarInner().new Tire(5.0).getRadius());
	}
}

class CarInner {
	
	class Tire {
		double circumference;
		
		public Tire(double circumference) {
			this.circumference = circumference;
		}
		
		public double getRadius() {
			return circumference / (2 * Math.PI);
		}
	}
}



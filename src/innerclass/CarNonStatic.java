package innerclass;

public class CarNonStatic {
	public static final double PI=3.14;
	private double radius;
	
	class Tire{
		private double circumference;
		
		Tire(double circumference){
			this.circumference=circumference;
			radius = radiusTire();
			System.out.print(radius);
		}
		
		public double radiusTire(){
			return this.circumference/2*PI;
		}
	}

	public static void main(String[] args) {	
		//as both the clases are non static,we will create the instance of it. 
		//Also, we need to call outer class before refering to inner class as a reference.
		new CarNonStatic().new Tire(10).radiusTire();
	}

}

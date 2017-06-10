package innerclass;


public class CarStatic {
	public static final double PI=3.14;
	private static double radius;		//we can access this variable inside static class only when this variable is static
	
	static class Tire{
		private double circumference;
		
		Tire(double circumference){
				this.circumference=circumference;
				radius = radiusTireMethod();
				System.out.print(radius);
		}
		
		private double radiusTireMethod(){
			return this.circumference/2*PI;		
		}
	}

	public static void main(String[] args) {
		//Inner class is static and therefore we dont need to create instance of static inner class
		new CarStatic.Tire(10).radiusTireMethod();
	}


}

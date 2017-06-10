package innerclass;

import innerclass.CarNonStatic.Tire;

public class CarLocal {
	public static final double PI=3.14;
	private double radius;
	
	//Inserting the class inside method and method returns the value
	public double localInnerMethod(double circum){
		class Tire{
			private double circumference;
			
			Tire(double circumference){
				this.circumference=circumference;
				radius = radiusTire();
				System.out.print(radius);
				
			}
			
			private double radiusTire(){
				return this.circumference/2*PI;
				
			}
		}
		return new Tire(circum).radiusTire();
	}

	public static void main(String[] args) {
		//instantiating the outer class and calling method in outer class and it returns value
		new CarLocal().localInnerMethod(10);
	}
}

package innerclass;

public class CarAnonymus {
	public static final double PI=3.14;
	private double radius;
	
	public interface vehicle{
		public void radiusTire();
	}
	
	public void methdOfAnonymousClass(double circum){
	(new vehicle(){						//calling the anonymous class without name using constructor	
		//no need to mention class name as it is anonymous function
		private double circumference = circum;
		
		/*public void Tire(double circumference){		//no need of constructor as we have already removed the inner class
			//this.circumference=circumference;
			radius = radiusTire();
			System.out.print(radius);
		}*/
		
		public void radiusTire(){
			radius = this.circumference/2*PI;
			System.out.print(radius);
		}

	}).radiusTire();		//self invoking
	}

	public static void main(String[] args) {	
		//instantiate outer class and calling the method which contains inner anonymous class.
		new CarAnonymus().methdOfAnonymousClass(10);
	}

}

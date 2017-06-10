package clone;

public class Enclosing implements Cloneable {
	
	int a;
	
	public void setA(int a) {
		this.a = a;
	}
	public Enclosing clone() throws CloneNotSupportedException {
		System.out.println("Inside Enclosing.clone()");
		return (Enclosing)super.clone();
	}
	class Inner implements Cloneable{
		void innerMethod() throws CloneNotSupportedException {
			Object copy = Enclosing.this.clone();
			Enclosing e = (Enclosing) copy;
			
			System.out.println(e.a);
			
			e.a = 10;
			
			System.out.println(e.a);
		}
	}
	
	public static void main(String[] args){
		Enclosing p1 = new Enclosing();
		p1.setA(8);
		Enclosing.Inner i1 = p1.new Inner();
		try {
			i1.innerMethod();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
	}

}

package clone;

public class CloneShallow {

	public static void main(String[] args) throws CloneNotSupportedException {
		test1 t1 = new test1();
		
		test1 copy = (test1)t1.clone();
		
		System.out.println(t1.a);
		System.out.println(t1.s);
		
		System.out.println(copy.s);
		System.out.println(copy.a);
		
		copy.s = "james";
		copy.a = 6;
		
		System.out.println(t1.s);
		System.out.println(t1.a);
		System.out.println(copy.s);
		System.out.println(copy.a);
	}

}

class test1 implements Cloneable {
	int a = 45;
	String s = "string";
	
	public void method() {
		System.out.println("print method");
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (test1)super.clone();
	}
}

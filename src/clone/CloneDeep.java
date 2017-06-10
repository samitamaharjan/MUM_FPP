package clone;

class CloneDeep {
	public static void main(String[] args) throws CloneNotSupportedException {
		Deep dp = new Deep();
		Deep copy = (Deep) dp.clone();
		
		copy.str = "james";
		copy.tc.s = "copy of s";
		System.out.println(copy.tc.s);
		System.out.println(copy.str);
		System.out.println(dp.tc.i);
		System.out.println(dp.str);
		System.out.println(dp);
	}
}

class Deep implements Cloneable {
	TestClass tc = new TestClass();
	String str = "deep clone";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Deep deep = (Deep) super.clone();
		deep.tc = (TestClass) tc.clone();
		return deep;
	}
}

class TestClass implements Cloneable{
	int i = 8;
	String s = "s";
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (TestClass) super.clone();
	}
	
	@Override
	public String toString() {
		return s;
	}
}
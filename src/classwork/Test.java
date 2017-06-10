package classwork;

class Test {
	public static void main(String[] args) {
		StringBuffer word1, word2;
		word1 = new StringBuffer("Lisa");
		word2 = word1;
		
		word2.insert(0, "Mona");
		System.out.println(word2);
		
		int i = 123;
		String s = "456";
		
		System.out.println((int) i + s);
		
		double x = Math.sqrt(-50);
		double y = x;
		if (x == y);
		System.out.println(y);
		
		System.out.println(new Test1().check());
		System.out.println(new Test1());
		
		int a = 6;
		int b = a;
		a = 9;
		a = b;
		System.out.println(b);
		System.out.println(a);
		System.out.println();
		
		
		Test1 s1 = new Test1();
		s1.x = 8;
		
		Test1 s2 = new Test1();
		System.out.println(s1.check());
		System.out.println(s2.toString());
	}
}

class Test1 {
	int x = 4;
	
	public String check() {
		return ("checking");
	}
	
	/*@Override
	public String toString() {
		return String.format("testing %d", x);
	}*/
}

package classwork;

public class Test {
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
	}
}

package assertion;

public class AssertionDemo2 {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = a + b;
		c = 6;
		
		assert c == 5 : "c should be equals to 5";
	}
}
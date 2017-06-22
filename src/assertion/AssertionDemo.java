package assertion;

public class AssertionDemo {
	public static void main(String[] args) {

		int i;
		int sum = 0;
		for (i = 0; i < 4; i++) {
			sum += i;
		}
		assert sum > 10 : "I am not going to display the sum" + sum;
		System.out.println("Sum : " + sum);

		System.out.println("Before Assert x");

		int x = 5;
		x++;
		assert x < 6 : "x is " + x;

		System.out.println("After Assert" + x);
	}
}
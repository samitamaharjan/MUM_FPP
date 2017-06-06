package recursion;

public class Exponentiation {
	static int counter = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getExponential(2, 10));
	}
	
	public static int getExponential(int x, int n) {
		counter++;
		System.out.println(counter);
		if (n == 1) return x;
		if (n % 2 == 0) return getExponential(x, n / 2) * getExponential(x, n / 2);
		else  return x * getExponential(x, n / 2) * getExponential(x, n / 2);
		
		
	}
}

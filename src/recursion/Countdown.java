package recursion;

public class Countdown {
	public static void main(String[] args) {
		f(6);
	}
	
	public static void f(int n) {
		if (n == 0) return;
		System.out.println(n);
		f(n - 1);
	}
}

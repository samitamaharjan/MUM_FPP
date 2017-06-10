package recursion;

public class Prime {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(prime(n));
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) return false;
		}
		return true;
	}
	
	public static int prime(int n) {
		if (n == 2) return n;
		
		 if (isPrime(n))
			 System.out.println(n);
			 return prime(n - 1);
	}
}

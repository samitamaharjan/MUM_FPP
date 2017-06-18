package Exception;

import java.io.FileNotFoundException;

public class CheckUnchecked {
	
	public static void main(String[] args) {
		print(9);
		System.out.println("Execute if no exception");
	}
	
	/*public static void main(String[] args) throws FileNotFoundException {
		print(9);
		System.out.println("Execute if no exception");
	}*/
	
	/*public static void main(String[] args) {
		try {
			print(9);
			System.out.println("Execute if no exception");
		} catch (FileNotFoundException e) {
			e.printStackTrace(); 
			// System.out.println("File was not found");
		}
		System.out.println("Executed sucessfully!");
	}*/
	
	public static void print(int i) {
		System.out.println("Hello");
		if (i < 10) {
			throw new ArithmeticException();
		}
		System.out.println("World!!");
	}
}

package Exception;

import java.io.IOException;

public class Throwsdemo {
   // Unchecked Exception handled using try-catch, checked exception handled using throws
	public static void main(String[] args) throws  IOException{// Checked Exception
	try{
			int a,b;
			a = Integer.parseInt("2");
			System.out.println(a);
			b = Integer.parseInt("st");
			System.out.println(b);
		}
		catch(NumberFormatException ex){ // Unchecked Exception
			System.out.println(ex.getMessage() + " is not a numeric value.");
					}
	}
}
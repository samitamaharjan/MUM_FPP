package classwork;

import java.util.Random;

public class Format {

	public static void main(String[] args) {
	String str = "";
	str = String.format("%16d %12d %n %n", new Random().nextInt(100), new Random().nextInt(100));
	str += String.format("%13s %2d %9s %2d %n","+", new Random().nextInt(100), "+", new Random().nextInt(100));
	str += String.format("%16s %12s","____", "____");
	
	str += String.format("\n%-5d %5d", 500, 2000);
	System.out.println(str); 
	}
}

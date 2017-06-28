
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
	ReadData() {
		System.out.println("JVM will look for files in here: ");
		System.out.println(System.getProperty("user.dir"));

	}

	// Demo code to read the content from file using Scanner
	public static void main(String[] args) throws FileNotFoundException {
		ReadData r = new ReadData();
		File file = new File("scores.txt");

		// Create a Scanner for the file
		Scanner input = new Scanner(file);

		// Read data from a file
		while (input.hasNext()) {
			String firstName = input.next();
			String lastName = input.next();
			int score = input.nextInt();
			System.out.println(firstName + " " + lastName + " " + score);
		}

		// Close the file
		input.close();

	}

}

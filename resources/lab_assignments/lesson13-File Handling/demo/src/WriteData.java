

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteData {
// Demo code for to write the data in a File using PrintWriter
	WriteData() {
		System.out.println("JVM will look for files in here: ");
		System.out.println(System.getProperty("user.dir"));

	}

	public static void main(String[] args) throws FileNotFoundException {
		WriteData d1=new WriteData();
		 File file = new File("scores.txt");
		    if (file.exists()) {
		      System.out.println("File already exists");
		      System.exit(0);
		    }
		    // Create a file
		    PrintWriter output = new PrintWriter(file);

		    // Write formatted output to the file
		    output.print("Ram Sudhan ");
		    output.println(90);
		    output.print("Jane Smith ");
		    output.println(85);
		    System.out.println("Write Successfully");  
		    // Close the file
		    output.close();

	   

	}

}

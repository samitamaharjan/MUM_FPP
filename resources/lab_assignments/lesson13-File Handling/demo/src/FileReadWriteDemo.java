


import java.io.*;

public class FileReadWriteDemo {
        // Count the number of words, characters and Lines from the file   
		public static void main(String[] args) throws IOException {
			String fileName = "outagain.txt";
			 try {
		            
		            FileWriter fileWriter =
		                new FileWriter(fileName);

		            // Always wrap FileWriter in BufferedWriter.
		            BufferedWriter bufferedWriter =
		                new BufferedWriter(fileWriter);
		            // Note that write() does not automatically
		            // append a newline character.
		            bufferedWriter.write("Hello there,");
		            bufferedWriter.write("here is some text.");
		            bufferedWriter.newLine();
		             bufferedWriter.write("We are writing");
		            bufferedWriter.write(" the text.");
		               bufferedWriter.close();
		            // Always close files.
		           
		            FileReader fr = new FileReader("outagain.txt");
					 BufferedReader br = new BufferedReader(fr); 
				     String s;
					String[] w = null;
				     int x = 0,y=0,z=0;
				    
				     while((s = br.readLine()) != null) {
				    	 System.out.println(s); 
				    	 w = s.split(",| ");
				    	 for(String k: w) {
				 			z=z+1;
				 	}
				    	 y=y+s.length();
				    	 x=x+1;
				       }
				     
				     System.out.println("\nLines= "+ x + "\nCharacters= " + y + "\nWords = "+z);
				     
				     fr.close();
		        }
		        catch(IOException ex) {
		            System.out.println(
		                "Error writing to file '"
		                + fileName + "'");
		      
		        }
		}

}

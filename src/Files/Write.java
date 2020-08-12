package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		// Writes a file
		
		String filename = "C:\\Users\\kjnas\\OneDrive\\Desktop\\Files\\filetowrite.txt";
		String message = "I'm writing this message to a file";
		
		File file = new File(filename);
		
		
		try {
			FileWriter fw;
			fw = new FileWriter(file);
			fw.write(message);
			fw.close();
		} catch (IOException e) {
		
			System.out.println("Could not write");
		} finally {
			
			System.out.println("Done");
		}
		
		
		
	}

}

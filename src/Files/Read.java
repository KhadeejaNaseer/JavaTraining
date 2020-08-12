package Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {

	public static void main(String[] args) {
		String text = null;
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\kjnas\\OneDrive\\Desktop\\Files\\filetoread.txt";
		File file = new File(filename);
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			text = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Not Found");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Couldn't read data");
		} finally {
			System.out.println("Finished");
		}
		System.out.println(text);
		

	}

}

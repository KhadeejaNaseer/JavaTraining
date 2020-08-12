package datastrructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;




public class ReadCSV {

	public static void main(String[] args) {
		// This will read data from a csv file
		List<String[]> data = new ArrayList<String[]>();
		String filename = "C:\\Users\\kjnas\\OneDrive\\Desktop\\Files\\accounts.csv";
		String datarow;
		try {
			//Open file
			BufferedReader br = new BufferedReader(new FileReader(filename));
			
			//Read data as long as its not empty
			while ((datarow = br.readLine()) != null) {
				//Parse the data with commas
				String[] line = datarow.split(",");
				// Add the data to the collection
				data.add(line);
				
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (String[] account : data) {
			for (String field : account) {
				System.out.println(field);
			}
		}
		

	}

}

package datastrructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class creditcard {

	public static void main(String[] args) {
		// Creating a balance variable that calculates the running balance of the user’s account
		double balance = 0;
		
		// Read a credit card CSV statement
		
		// This will read data from a csv file
				List<String[]> data = new ArrayList<String[]>();
				String filename = "C:\\Users\\kjnas\\OneDrive\\Desktop\\Files\\report.csv";
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
				
				// If the field says CREDIT, then add the amount to the balance
				// If the field says DEBIT, then subtract the amount to the balance
				for (String[] account : data) {
					
					String state = account[1];
					double amt = Double.parseDouble(account[3]);
					
					for (String field : account) {
						System.out.print(field + " ");
					}
				
					
					if (state.equalsIgnoreCase("credit")) {
						balance += amt;
					}
					
					else if (state.equalsIgnoreCase("debit")) {
						balance -= amt;
					}
					
					System.out.print(" Curr balance: " + balance);
					
					System.out.println();
				}
				
				// If the final amount is greater than zero, charge a 10% fee and warn the user
				// If the final amount is zero, thank the user for their payments
				// If the final amount is less than zero, thank the user for their payment and display their overpayment.
				
				System.out.println();
				if (balance > 0) {
					double fee = balance * 0.10;
					balance += fee;
					System.out.println("Need to pay balance");
					System.out.println("BALANCE: " + balance);
				}
				
				else if (balance == 0) {
					System.out.println("BALANCE: " + balance);
					System.out.println("Thank you for your payment");
				}
				
				else {
					System.out.println("BALANCE: " + balance);
					System.out.println(-balance);
				}
				

	}

}

package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PasswordCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read file
		String filename = "C:\\Users\\kjnas\\OneDrive\\Desktop\\Files\\passwords.txt";
		File file = new File(filename);
		
		//Store passwords
		String[] passwords = new String[13];
		String password = null;
		
		//Read file and store passwords in array
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<passwords.length; i++) {
				passwords[i] = br.readLine();	
			} 
			br.close();
		} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR");
			}
		
		//Check each password
		for (int i=0; i <passwords.length; i++ ) {
			password = passwords[i];
			
			try {
				boolean containsnum = false;
				for (int j=0; j<password.length();j++) {
					if (password.substring(j,j+1).equals("0")|| password.substring(j,j+1).equals("1") || password.substring(j,j+1).equals("2") ||
							password.substring(j,j+1).equals("3") || password.substring(j,j+1).equals("4") || password.substring(j,j+1).equals("5") || password.substring(j,j+1).equals("6")
							|| password.substring(j,j+1).equals("7") || password.substring(j,j+1).equals("8") || password.substring(j,j+1).equals("9")) {
						containsnum = true;
					}
				}
				
				if (!containsnum) {
					throw new NoNumException(password);
				}
				
				boolean containsletter = false;
				if (password.matches(".*[a-z].*")) { 
				    containsletter = true;
				}
				if (!containsletter) {
					throw new NoLetterException(password);
				}
				
				boolean containsspecial = false;
				for (int j=0; j<password.length();j++) {
					if (password.substring(j,j+1).equals("!")|| password.substring(j,j+1).equals("@") || password.substring(j,j+1).equals("#")) {
						containsspecial = true;
					}
				}
				if (!containsspecial) {
					throw new NoSpecialException(password);
				}
				
			} catch (NoNumException e) {
				System.out.println(e.toString());
			} catch (NoLetterException e) {
				System.out.println(e.toString());	
		} catch (NoSpecialException e) {
			System.out.println(e.toString());	
		} 
	}

}
}


 class NoNumException extends Exception {
	String password;
	NoNumException(String password) {
		this.password = password;
	}
	public String toString() {
		return ("No Num Exception -" + this.password);
	}
	
	
}
 
 class NoLetterException extends Exception {
	 String password;
		NoLetterException(String password) {
			this.password = password;
		}
		public String toString() {
			return ("No Letter Exception -" + this.password);
		}
 
 
 }
 
 class NoSpecialException extends Exception {
	 String password;
		NoSpecialException(String password) {
			this.password = password;
		}
		public String toString() {
			return ("No Special Exception -" + this.password);
		}
	 
	 
 }
 


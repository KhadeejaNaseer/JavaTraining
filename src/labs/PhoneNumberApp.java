package labs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PhoneNumberApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "C:\\Users\\kjnas\\OneDrive\\Desktop\\Files\\phonenum.txt";
		File file = new File(filename);
		String[] phonenums = new String[5];
		String phonenum = null;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			for (int i=0; i<phonenums.length; i++) {
				phonenums[i] = br.readLine();
				
			} 
			
			br.close();
		}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR");
			}
		
		for (int i =0; i<phonenums.length; i++) {
			phonenum = phonenums[i];
		
			try {
				if (phonenum.length() != 9) {
					throw new TenDigitsException(phonenum);
				}
				
				
			if (phonenum.substring(0,  1).equals("0") || phonenum.substring(0, 1).equals("9")) {
				throw new AreaCodeException(phonenum);
			}
			
			for	(int n=0; n<phonenum.length()-2; n++) {
				if (phonenum.substring(n,n+1).equals("9")) {
					if (phonenum.substring(n+1, n+3).equals("11")) {
						throw new EmergencyException(phonenum);
					}
				}
			}
			
				System.out.println(phonenum);
				
			} catch (TenDigitsException e) {
				System.out.println("ERROR");
				System.out.println(e.toString());
			} catch (AreaCodeException e) {
				System.out.println("ERROR");
				System.out.println(e.toString());
			} catch (EmergencyException e) {
				// TODO Auto-generated catch block
				System.out.println("ERROR");
				System.out.println(e.toString());
			}
			
		}
	}

}

 class TenDigitsException extends Exception {
	 String num;
	 
	 TenDigitsException(String num) {
		 this.num = num;
	 }
	 
	 public String toString() {
		 return "TenDigitException";
	 }
}


class AreaCodeException extends Exception{
	String num;
	 
	AreaCodeException(String num) {
		 this.num = num;
	 }
	 
	 public String toString() {
		 return "AreaCodeException";
	 }
}

class EmergencyException extends Exception{
	String num;
	 
	 EmergencyException(String num) {
		 this.num = num;
	 }
	 
	 public String toString() {
		 return "EmergencyException";
	 }
	
}


package Exceptions;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double payment = 0;
		boolean positivepayment = true;
		
		do {
		
			System.out.print("Enter the payment amt: ");
			
			Scanner in = new Scanner(System.in);
			
			try {
				payment = in.nextDouble();
				
				if (payment < 0) {
					throw new NegativePaymentException(payment);	
				}
				else {
					positivepayment = true;
				}
			} catch (NegativePaymentException e) {
				System.out.println("ERROR " + e.toString());
				positivepayment = false;
			}
		} while(!positivepayment);
		
		System.out.println("Thankyou");

	}

}

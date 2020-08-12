package Exceptions;

import java.util.Scanner;

public class PaymentsApp {

	public static void main(String[] args) {
		// PaymentApp which keeps asking the user to enter a payment until it is a non-negative number
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

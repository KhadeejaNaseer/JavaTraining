package Exceptions;

public class NegativePaymentException extends Exception{
	
	double payment;
	public NegativePaymentException(double payment) {
		this.payment = payment;
	}
	
	public String toString() {
		return "Negative payment = " + this.payment;
	}

}

package OOP;



public class BankAccount implements IRate {
	// Bank Account class 
	
	// Define variables
	private String AN;
	private static String RN = "0";
	String name;
	private String SIN;
	
	public String getSIN() {
		return SIN;
	}

	public void setSIN(String sIN) {
		SIN = sIN;
	}

	String AT;
	double balance;
	
	// Constructor
	BankAccount() {
		System.out.println("New account created");
	}
	
	// Overloading: call method name with different arguments
	BankAccount(String AT) {
		System.out.println(AT);
	}
	
	void deposit(double amount) {
		balance = balance + amount;
		showActivity("D");
		
	}
	
	private void showActivity(String activity) {
		System.out.println(activity);
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("W");
		
	}
	
	void checkbalance() {
		
	}
	
	void checkstatus() {
		
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setRate() {
		
	}
	
	public void increaseRate() {
		
	}
	
	}
//default: available only in project
//public: available anywhere
//private: available only in class



	



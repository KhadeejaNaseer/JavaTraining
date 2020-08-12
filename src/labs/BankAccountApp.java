package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// Create a bank account
		BankAccount a1 = new BankAccount("777", 100);
		a1.setName("Jim");
		a1.MakeDeposit(100);
		a1.payBill(30);
		a1.accrue();
		System.out.println(a1.toString());
		System.out.println(a1.getName());
		BankAccount a2 = new BankAccount("775", 900);
		BankAccount a3 = new BankAccount("776", 0);

	}

}

class BankAccount implements IInterest{
	//Properties
	
	private String bankaccountnum; //id + random 2 digit num + first two of sin
	private static final String routingnum = "0";
	private String SIN;
	private double balance;
	private static int id = 1000;
	private String name;
	
	
	//Constructor
	public BankAccount(String SIN, double initdeposit) {
		id ++;
		this.SIN = SIN;
		setbankaccountnum();
		balance = initdeposit;
	}
	
	private void setbankaccountnum() {
		int random = (int) (Math.random() * 100);
		this.bankaccountnum = id + "" + random + SIN.substring(0,2);
		System.out.println(bankaccountnum);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		showBalance();
	}
	
	public void MakeDeposit(double amount) {
		balance = balance + amount;
		showBalance();
	}
	
	public void showBalance() {
		System.out.println(balance);
	}
	

	@Override
	public void accrue() {
		
		balance = balance * (1+rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[All the details]";
	}

}

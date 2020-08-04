package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount num1 = new BankAccount();
		num1.deposit(100);
		num1.deposit(200);
		num1.withdraw(80);
		num1.setName("HO");
		System.out.println(num1.getName());
		num1.setSIN("0");
		System.out.println(num1.getSIN());
		
		BankAccount num2 = new BankAccount("1");
		
		
		
		CDAccount num3 = new CDAccount();

	}

}

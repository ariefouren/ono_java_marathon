
public class BankAccount {
	
	private double balance;
	private int accountNumber;
	private String customerName;
	
	public BankAccount(double balance, int accountNumber, String customerName) {
		this.balance = balance;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public BankAccount(int accountNumber, String customerName) {
		this.balance = 0;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
	}

	public void deposit(double amount)
	{
		balance = balance + amount;
	}
	
	@Override
	public String toString() {
		return String.format("BankAccount [balance=%s, accountNumber=%s, customerName=%s]", 
				balance, 
				accountNumber,
				customerName);
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	

}


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
	
	public void withdraw(double amount)
	{
		balance = balance - amount;
	}
	
	
	public double getBalance() {
		return balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	@Override
	public String toString() {
		return String.format("BankAccount [balance=%s, accountNumber=%s, customerName=%s]", 
				balance, 
				accountNumber,
				customerName);
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	

}

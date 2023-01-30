import java.util.ArrayList;

public class BankBranch {
	
	private String branchName;
	private ArrayList<BankAccount> accounts;
	
	public BankBranch(String branchName) {
		this.branchName = branchName;
		this.accounts = new ArrayList<BankAccount>();
	}
	
	public void addAccount(BankAccount account)
	{
		accounts.add(account);
	}
	
	public double totalBalance()
	{
		double totalBalance = 0;
		for(BankAccount x: accounts)
		{
			totalBalance += x.getBalance();
		}
		return totalBalance;
	}
	
	public String toString()
	{
		String str = "-----------------------------------------------------\n";
		str += String.format("Branchg name: %s\n" , branchName);
		str += "-----------------------------------------------------\n";
		str += "Accounts details: \n";
		
		for(BankAccount x: accounts)
		{
			str += x.toString();
		}
		str += "-----------------------------------------------------\n";
		str += String.format("Number of accounts:         %d\n", accounts.size());
		str += String.format("Total balance:              %.2f\n", this.totalBalance());
		
		
		return str;
		
	}
	
	
	
	
	
	

}

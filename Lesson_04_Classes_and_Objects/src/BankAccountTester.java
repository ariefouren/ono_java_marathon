
public class BankAccountTester {

	public static void main(String[] args) {
		
		BankAccount aliceAccount = new BankAccount(20000, 10024, "Alice Green");
		BankAccount bobAccount = new BankAccount(10075, "Bob Black");
		
		System.out.printf("%s\n", aliceAccount.toString());
		System.out.printf("%s\n", bobAccount.toString());
		
		// נעביר מאליס לבוב חצי מהיתרה של אליס
		System.out.printf("Alice transfers half of her savings to Bob:\n");
		double aliceBalance = aliceAccount.getBalance();
		aliceAccount.withdraw(aliceBalance/2);
		bobAccount.deposit(aliceBalance/2);
		
		System.out.printf("%s\n", aliceAccount.toString());
		System.out.printf("%s\n", bobAccount.toString());

	}

}


public class BankAccountTester {

	public static void main(String[] args) {
		
		BankAccount aliceAccount = new BankAccount(20000, 10024, "Alice Green");
		BankAccount bobAccount = new BankAccount(10075, "Bob Black");
		
		System.out.printf("Alice's account toString() : %s\n", aliceAccount.toString());
		System.out.printf("Bob's account toString() : %s\n", bobAccount.toString());
		

	}

}

/**
 * BankBranchTester.java
 */

public class BankBranchTester {
	
   public static void main(String[] args) {
   	
   		BankBranch branch = new BankBranch("987 - Havazelet 10 TA");
   		
   		BankAccount aliceAccount = new BankAccount(10000.0, 1003, "Alice");
   		BankAccount bobAccount = new BankAccount(1005, "Bob");
   		BankAccount cyndiAccount = new BankAccount(1500.0, 1007, "Cyndi");
   		BankAccount davidAccount = new BankAccount(1009, "David");
    	
   		
   		branch.addAccount(aliceAccount);
   		branch.addAccount(bobAccount);
   		branch.addAccount(cyndiAccount);
   		branch.addAccount(davidAccount);
   		
   		
   		System.out.println(branch.toString());
    		  		  
    }
}

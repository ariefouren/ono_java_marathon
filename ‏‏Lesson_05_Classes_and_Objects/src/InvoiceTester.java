/*
 * InvoiceTester.java
 */
import java.util.Scanner;

public class InvoiceTester {

	public static void main(String[] args) {
		
		Scanner inScanner = new Scanner(System.in);
		System.out.print("Please enter invoice number: ");
		int invoiceNumber = inScanner.nextInt();
		
		Invoice invoice = new Invoice(invoiceNumber);
		
		System.out.print("Please enter names and prices of the items, -1 to quit : ");
		// Each line of the input is in the form
		// name   price
		// -1 marks the end of the input
		while(! inScanner.hasNextDouble()) 
		{
			String name = inScanner.next();
			double price = inScanner.nextDouble();
			Item newItem = new Item(name, price);
			invoice.addItem(newItem);
		}
		inScanner.nextDouble(); // clear -1 from the input
		
		System.out.println("Invoice details before discount: ");
		System.out.println(invoice.toString());
		
		System.out.print("\n\nPlease enter the name of the item for discount  : ");
		String itemName = inScanner.next();
		
		System.out.printf("Please enter discount rate for %s (in %%): ", itemName);
		double itemDiscountRate = inScanner.nextDouble()/100;
		
		invoice.giveDiscount(itemName, itemDiscountRate);
		System.out.printf("\nInvoice details after discount for %s: ", itemName);
		System.out.println(invoice.toString());
		
		
		System.out.print("\n\nPlease enter discount rate (in %): ");
		double discountRate = inScanner.nextDouble()/100;
		
		System.out.print("Please enter minimal price eligible for discount : ");
		double minPrice = inScanner.nextDouble();
		
		invoice.giveDiscount(minPrice, discountRate);
		
		System.out.println("\nInvoice details after discount: ");
		System.out.println(invoice.toString());
		
		

	}

}

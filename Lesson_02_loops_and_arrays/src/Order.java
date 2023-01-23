import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		
		final int MAX_NUM_ITEMS = 10;
		double[] prices = new double[MAX_NUM_ITEMS];
		int numItems = 0;
		
		// Users's input
		System.out.printf("Please enter the prices of the items, Q to quit:");
		while(inScanner.hasNextDouble() && numItems < MAX_NUM_ITEMS)
		{
			prices[numItems] = inScanner.nextDouble();
			numItems++;
		}
		
		// output
		for(int i = 0; i < numItems; i++)
		{
			System.out.printf("prices[%d] = %.2f \n" , i, prices[i]);
		}
		
		// computation
		/*
		 * Number of items:      5 V
Total price:        258.64
Min price:           10.99
Max price:           10.99
Average price:       51.73

		 */
		double totalPrice = 0;
		for(int i = 0; i < numItems; i++)
		{
			totalPrice += prices[i];
		}
		
		System.out.printf("Number of items :   %d\n", numItems);
		System.out.printf("Total price     :   %.2f\n", totalPrice);
		
		

	}

}

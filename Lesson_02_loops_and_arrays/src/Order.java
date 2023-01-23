/*
 * Order.java
 */
import java.util.Scanner;

public class Order{
   public static void main(String[] args)
   {  
	  final int MAX_ITEMS = 10; // maximal number of items in the order
      double[] prices = new double[MAX_ITEMS];
      int numItems = 0; 	// the number of the items in the array 
							// and the index of the first empty entry
      Scanner inScanner = new Scanner(System.in);
      
      // input: get the list of the prices      
      System.out.println("Please enter the prices of the items, Q to quit:");
      while (inScanner.hasNextDouble() && numItems < MAX_ITEMS)
      {  
         prices[numItems] = inScanner.nextDouble();
         numItems ++;
      }
      inScanner.next(); // clear the last 'Q' character from the Scanner
     
      // calculate the statistics
      double sum = prices[0];
      double min = prices[0];
      double max = prices[0];
      for(int i = 1; i < numItems; i++) 
      {
         sum = sum + prices[i];
         if(prices[i] < min) {min = prices[i];}
         if(prices[i] > max) {max = prices[i];}
      }
      double average = sum/numItems;
      
      // output: print the list of the prices 
      System.out.println("List of the prices : ");
      for(int i = 0; i < numItems; i++) 
      {
    	  System.out.printf("%7.2f \n", prices[i]);
      }
      // print the statistics
      System.out.printf("Number of items:   %4d\n",  numItems);
      System.out.printf("Total price:       %7.2f\n", sum);     
      System.out.printf("Min price:         %7.2f\n", min); // the first element in the sorted list
      System.out.printf("Max price:         %7.2f\n", max);
      System.out.printf("Average price:     %7.2f\n", average);

   }
}

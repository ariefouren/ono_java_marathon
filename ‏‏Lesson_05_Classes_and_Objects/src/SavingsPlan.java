import java.util.Scanner;

public class SavingsPlan {

	public static void main(String[] args) {
	
		final int MAX_NUMBER_MONTHS = 100; 
		Scanner inScanner = new Scanner(System.in);
		
		// users' input
		System.out.printf("Please enter deposit amount: ");
		double pv = inScanner.nextDouble();
		
		double[] monthlyRates = new double[MAX_NUMBER_MONTHS];
		System.out.printf("Please enter sequence of monthly interest rates (in %%), Q to quit:");
		int nper = 1;
		while(nper < MAX_NUMBER_MONTHS && inScanner.hasNextDouble())
		{
			monthlyRates[nper] = inScanner.nextDouble()/100;
			nper++;
		}
		nper --;  // nper = num of months
		
		// compute the array of future values
		double[] futureValues = new double[MAX_NUMBER_MONTHS];
		futureValues[0] = pv;
		
		for(int i = 1; i <= nper; i++)
		{
					// FV_i=FV_(i-1) (1+R_i)
			futureValues[i] = futureValues[i-1] * ( 1 + monthlyRates[i]);
		}
		
		// output
		System.out.printf("Future value of the savings plan at the end of each month:\n");
		System.out.printf("--------------------------------------------\n");
		System.out.printf("%15s | %15s | %16s\n", "month", "monthly rate", "future value");
		System.out.printf("--------------------------------------------\n");
		
		for(int i = 1; i <= nper; i++)
		{
			System.out.printf("%15d | %15.2f%% | %15.2f\n", 
					i, 
					monthlyRates[i]*100, 
					futureValues[i] );
		}
		System.out.printf("--------------------------------------------\n");
		
		// calculate the total rate
		// totalRate=(1+R_1 )⋅(1+R_2 )⋅…⋅(1+R_nper )-1
		double totalRate = 1;
		for(int i = 1; i <= nper; i++)
		{
			totalRate = totalRate * (1 + monthlyRates[i]);
		}
		totalRate = totalRate - 1;
		// averageRate=(1+totalRate)^((1.0⁄(nper)))-1
		double averageRate = Math.pow(1 + totalRate, 1.0/nper) - 1;
		
		System.out.printf("Total rate   : %15.2f%%\n", totalRate * 100);
		System.out.printf("Average rate : %15.2f%%\n", averageRate * 100);
		
		
		
	}

}

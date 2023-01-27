import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		/*
		 * Please enter the mortgage amount : 10000
Please enter the annual interest rate (in %) : 5
Please enter the number of years : 2

		 */

		// users' input
		System.out.printf("Please enter the mortgage amount :");
		double pv = inScanner.nextDouble();
		
		System.out.printf("Please enter the annual interest rate (in percent) :");
		double annualRate = inScanner.nextDouble();  
		double rate = annualRate/12/100;
		
		System.out.printf("Please enter the number of years :");
		int numYears = inScanner.nextInt();
		int nper = numYears * 12;
				
		// computations
		/*
		 * PMT=(PV⋅RATE)/((1-(1+RATE)^(-NPER) ) )
		 */
		double pmt = (pv * rate)/((1-Math.pow(1+rate,-nper) ) );
		
		// output
		System.out.printf("Monthly payment : %.2f\n", pmt);
		double balance = pv;
		System.out.printf("%10d | %10.2f \n", 0, balance);
		
		for(int i = 1; i <= nper; i++)
		{
			balance = balance * (1 + rate) - pmt;
			System.out.printf("%10d | %10.2f \n", i, balance);
		}
		
		System.out.printf("Total amount paid    : %.2f\n", pmt*nper);
		System.out.printf("Total interest paid  : %.2f\n", pmt*nper - pv);
		

	}

}

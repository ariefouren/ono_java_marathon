import java.util.Scanner;

public class Mortgage {

	public static void main(String[] args) {
		Scanner inScanner = new Scanner(System.in);
		/*
		* Enter the annual interest rate in percent : 6
Enter the number of months : 240
Enter the monthly payment amount : 1500
The mortgage amount is : 209,371.16

		 */
		// User's input
		System.out.printf("Enter the annual interest rate in percent :");
		double rate = inScanner.nextDouble()/12/100;  // 5% -> 0.005
		
		System.out.printf("Enter the number of months :");
		int nper = inScanner.nextInt();
		
		System.out.printf("Enter the monthly payment amount :");
		double pmt  = inScanner.nextDouble();
		
		// Computation
		// PV=PMT(1-(1+R)^(-n) )/R
		double pv = pmt*(1 - Math.pow((1 + rate),(-nper))) / rate;
		
		// Output
		System.out.printf("The mortgage amount is : %.2f\n", pv); 
		
		
		
		
		
		
		
		
		

	}

}

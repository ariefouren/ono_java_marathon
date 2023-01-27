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
		
		// נחשב את היתרות של המשכנתא ונשמור אותן במערך
		double[] balance =  new double[nper + 1];
		// מערך ששומר את התשלום על חשבון הריבית בכל חודש
		double[] interestPayment = new double[nper + 1];
		// מערך ששומר את התשלום החחודשי על חשבון הקרן
		double[] principialPayment = new double[nper + 1];
				
		// כל כניסה של המערך משקפת את היתרה בסוף החודש
		balance[0] = pv;
		
		// נחשב את היתרות בכל החודשים של המשכנתא ונשמור את התוצאות במערך
		for(int i = 1; i <= nper; i++)
		{
			balance[i] = balance[i-1] * (1 + rate) - pmt;	
			interestPayment[i] = balance[i-1] * rate;
			principialPayment[i] = pmt - interestPayment[i];
		}
		
		// נחשב את הסכום של התשלומיםפ על חשבון ריבית ועל חשבון קרן
		double totalInterestPaid = 0;
		double totalPrincipialPaid = 0;
		for(int i = 1; i <= nper; i++)
		{
			totalInterestPaid += interestPayment[i]; 
			totalPrincipialPaid += principialPayment[i];
		}
		
		// output
		System.out.printf("Monthly payment : %.2f\n", pmt);
		
		System.out.printf("Mortgage repayments schedule :\n", pmt);
		for(int i = 0; i <= nper; i++)
		{
			System.out.printf("%10d | %10.2f | %10.2f | %10.2f\n", 
					i, 
					balance[i], 
					interestPayment[i],
					principialPayment[i]);
		}
		
		System.out.printf("Total amount paid      : %.2f\n", pmt*nper);
		System.out.printf("Total interest paid    : %.2f\n", totalInterestPaid);
		System.out.printf("Total principial paid  : %.2f\n", totalPrincipialPaid);
		

	}

}

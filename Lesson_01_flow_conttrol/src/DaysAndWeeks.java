
public class DaysAndWeeks {

	public static void main(String[] args) {
		
		final int DAYS_IN_WEEK = 7;
		
		int days = 49; 
		
		int weeks = days / DAYS_IN_WEEK;
		int remainder = days % DAYS_IN_WEEK;
		
		// output
		System.out.printf("%d days are %d and %d days", days, weeks, remainder); 

	}

}

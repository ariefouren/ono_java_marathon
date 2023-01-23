
public class WhileLoop {

	public static void main(String[] args) {
		
		double pv = 1000.0;
		double rate = 0.05;
		int nper = 0;
		
		double fv = pv; 
		
		while(fv < 2000)
		{
			fv = fv * (1 + rate); 
			nper++;
			System.out.printf("nper = %d, fv = %.2f\n", nper, fv);
		}

	}

}

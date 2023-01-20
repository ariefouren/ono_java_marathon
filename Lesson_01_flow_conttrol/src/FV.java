
public class FV {

	public static void main(String[] args) {
		
		double pv = 1000.0;
		double rate = 0.05;
		int nper = 25;
		
		double fv = pv * Math.pow((1+rate), nper); // fv = pv(1+r)^n
		
		// user output
		System.out.printf("pv   = %.2f\n", pv);
		System.out.printf("rate = %.2f\n", rate);
		System.out.printf("nper = %d\n", nper);
		
		System.out.printf("after %d year(s) fv = %.2f", nper, fv);
		
		
		

	}

}

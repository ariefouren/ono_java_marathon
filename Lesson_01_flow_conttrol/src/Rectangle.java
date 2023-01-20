import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		// user's input
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Please, enter width: ");
		double width = in.nextDouble();
		
		System.out.printf("Please, enter height: ");
		double height = in.nextDouble();
		
		// computation
		double diagonal = Math.sqrt(width*width + height*height); // sqrt(w^2 + h^2)
		System.out.printf("Length of diagonal: %.2f", diagonal);
		
		
		

	}

}

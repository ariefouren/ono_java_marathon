/*
 * Rectangle.java
 */

import java.util.Scanner;

public class Rectangle
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
	
		System.out.print("Please enter width of rectangle: ");
		double width = in.nextDouble();
		
		System.out.print("Please enter height of rectangle: ");
		double height = in.nextDouble();
		
		System.out.printf("Width : %.2f\n", width);
		System.out.printf("Height: %.2f\n", height);
		
		double diagonal = Math.sqrt(width*width + height*height);
		System.out.printf("Length of diagonal: %.2f\n", diagonal);
	}
}

package week1;

import java.util.Scanner;

public class ComputeAreaIn {

	public static void main(String[] args) {
		
		/* Create a Scanner object */
		Scanner input = new Scanner(System.in);
		/* Prompt the user to enter a radius */
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		/* Compute area */
		final double PI = 3.14169; /* a named constant for  */
		double area = PI * radius * radius; /* area = r 2 */
		/* Display result */
		System.out.println(
		"Area for circle of radius " + radius + " is " + area);
	}

}

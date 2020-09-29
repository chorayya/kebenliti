package ¿Î±¾ÀıÌâ;
import java.util.Scanner;//Scanner is in the java .util package
public class ComputerAreaWithConstant {
	public static void main(String[] args) {
		final double PI = 3.14159;//Declare a constant
		
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Promote the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Computer area
		double area = radius*radius*PI;
		
		//display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}




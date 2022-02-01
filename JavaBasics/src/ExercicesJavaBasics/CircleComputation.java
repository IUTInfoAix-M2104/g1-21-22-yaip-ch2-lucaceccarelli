package ExercicesJavaBasics;

import java.util.Scanner;   // For keyboard input

public class CircleComputation {

	public static void main(String[] args) {
		SphereComputation();
		CylinderComputation();
	}

	public static void SphereComputation() {
	      // Declare variables
	      double radius, diameter, circumference, area, surfaceArea, volume;  // inputs and results - all in double

	      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
	      // Prompt and read inputs as "double"
	      System.out.print("Enter the radius: ");
	      radius = in.nextDouble();  // read input as double
	      in.close();

	      // Compute in "double"
	      diameter = radius * 2;
	      circumference = 2 * Math.PI * radius;
	      area = radius * radius * Math.PI;
	      surfaceArea = 4 * Math.PI * radius * radius;
	      volume = 4 /3 * Math.PI * radius * radius * radius; 
	      
	      // Print results using printf() with the following format specifiers:
	      //   %.2f for a double with 2 decimal digits
	      //   %n for a newline
	      System.out.printf("Diameter is: %.2f%n", diameter);
	      System.out.printf("circumference is: %.2f%n", circumference);
	      System.out.printf("area is: %.2f%n", area);
	      System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
	      System.out.printf("volume is: %.2f%n", volume);
	}
	
	public static void CylinderComputation() {
	      // Declare variables
	      double radius, height, baseArea, surfaceArea, volume;  // inputs and results - all in double

	      Scanner in = new Scanner(System.in);  // Scan the keyboard for input
	      // Prompt and read inputs as "double"
	      System.out.print("Enter the radius: ");
	      radius = in.nextDouble();  // read input as double
	      height = in.nextDouble();  // read input as double
	      in.close();

	      // Compute in "double"
	      baseArea = Math.PI * radius * radius;
	      surfaceArea = 2.0 * Math.PI * radius + 2.0 * baseArea;
	      volume = baseArea * height;
	      
	      // Print results using printf() with the following format specifiers:
	      //   %.2f for a double with 2 decimal digits
	      //   %n for a newline
	      System.out.printf("baseArea is: %.2f%n", baseArea);
	      System.out.printf("surfaceArea is: %.2f%n", surfaceArea);
	      System.out.printf("volume is: %.2f%n", volume);
	}
}

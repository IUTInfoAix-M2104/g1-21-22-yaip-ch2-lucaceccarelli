package ExercicesJavaBasics;

import java.util.Scanner;

public class SumProductMinMax3 {
	// Declare variables
	public static void main(String[] args) {
		int number1, number2, number3;  // The 3 input integers
		int sum, product, min, max;     // To compute these

		// Prompt and read inputs as "int"
		Scanner in = new Scanner(System.in);  // Scan the keyboard

		number1 = in.nextInt();
		number2 = in.nextInt();
		number3 = in.nextInt();

		in.close();

		// Compute sum and product
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;

		// Compute min
		// The "coding pattern" for computing min is:
		// 1. Set min to the first item
		// 2. Compare current min with the second item and update min if second item is smaller
		// 3. Repeat for the next item
		min = number1;        // Assume min is the 1st item
		if (number2 < min) {  // Check if the 2nd item is smaller than current min
			min = number2;     // Update min if so
		}
		if (number3 < min) {  // Continue for the next item
			min = number3;
		}

		// Compute max - similar to min
		max = number1;        // Assume max is the 1st item
		if (number2 > max) {  // Check if the 2nd item is smaller than current min
			max = number2;     // Update max if so
		}
		if (number3 > max) {  // Continue for the next item
			max = number3;
		}

		// Print results
		System.out.println("the sum is :"+sum+" the product is : "+product+" min :"+min+" max: "+max);
		
		SumProductMinMax5();
	}
	
	public static void SumProductMinMax5() {
		int number1, number2, number3,number4,number5;  // The 3 input integers
		int sum, product, min, max;     // To compute these

		// Prompt and read inputs as "int"
		Scanner in = new Scanner(System.in);  // Scan the keyboard

		number1 = in.nextInt();
		number2 = in.nextInt();
		number3 = in.nextInt();
		number4 = in.nextInt();
		number5 = in.nextInt();

		in.close();

		// Compute sum and product
		sum = number1 + number2 + number3 + number4 + number5;
		product = number1 * number2 * number3 * number4 * number5;

		// Compute min
		// The "coding pattern" for computing min is:
		// 1. Set min to the first item
		// 2. Compare current min with the second item and update min if second item is smaller
		// 3. Repeat for the next item
		min = number1;        // Assume min is the 1st item
		if (number2 < min) {  // Check if the 2nd item is smaller than current min
			min = number2;     // Update min if so
		}
		if (number3 < min) {  // Continue for the next item
			min = number3;
		}
		if (number4 < min) {  // Continue for the next item
			min = number4;
		}
		if (number5 < min) {  // Continue for the next item
			min = number5;
		}

		// Compute max - similar to min
		max = number1;        // Assume max is the 1st item
		if (number2 > max) {  // Check if the 2nd item is smaller than current min
			max = number2;     // Update max if so
		}
		if (number3 > max) {  // Continue for the next item
			max = number3;
		}
		if (number4 > max) {  // Continue for the next item
			max = number4;
		}
		if (number5 > max) {  // Continue for the next item
			max = number5;
		}

		// Print results
		System.out.println("the sum is :"+sum+" the product is : "+product+" min :"+min+" max: "+max);
	}
}

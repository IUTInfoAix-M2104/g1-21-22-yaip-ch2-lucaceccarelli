package ExercicesJavaBasics;

/**
 * Compute the sum and average of running integers from a lowerbound to an upperbound using loop.
 */
public class SumAverageRunningInt {   // Save as "SumAverageRunningInt.java"
	public static void main (String[] args) {
		//Call the functions
		forLoopSumAverageRunningInt();
		whileDoLoopSumAverageRunningInt();
		doWhileLoopSumAverageRunningInt();
		Exercice4LoopSumAverageRunningInt();
		SumOfSquaresAverageRunningInt();
		SumOddEvenAndDifference();
	}

	public static void forLoopSumAverageRunningInt() {
		// Define variables
		int sum = 0;          // The accumulated sum, init to 0
		double average;       // average in double
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			// The loop index variable number = 1, 2, 3, ..., 99, 100
			sum += number;     // same as "sum = sum + number"
		}
		// Compute average in double. Beware that int / int produces int!
		average = (double) sum/(UPPERBOUND-LOWERBOUND+1);
		// Print sum and average
		System.out.println("The sum is : "+sum+" , and the average is :"+average); 
	}

	public static void whileDoLoopSumAverageRunningInt() {
		// Define variables
		int sum = 0;          // The accumulated sum, init to 0
		double average;       // average in double
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;

		int number = LOWERBOUND;
		while (number <= UPPERBOUND) { 
			sum += number;
			++number; 
		}
		// Compute average in double. Beware that int / int produces int!
		average = (double) sum/(UPPERBOUND-LOWERBOUND+1);
		// Print sum and average
		System.out.println("The sum is : "+sum+" , and the average is :"+average); 
	}

	public static void doWhileLoopSumAverageRunningInt() {
		// Define variables
		int sum = 0;          // The accumulated sum, init to 0
		double average;       // average in double
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;

		int number = LOWERBOUND;         // declare and init loop index variable
		do {
			sum += number;
			++number;                     // update
		} while (number <= UPPERBOUND);  // test
		// Compute average in double. Beware that int / int produces int!
		average = (double) sum/(UPPERBOUND-LOWERBOUND+1);
		// Print sum and average
		System.out.println("The sum is : "+sum+" , and the average is :"+average); 
	}

	public static void Exercice4LoopSumAverageRunningInt() {
		// Define variables
		int sum = 0;          // The accumulated sum, init to 0
		double average;       // average in double
		final int LOWERBOUND = 111;
		final int UPPERBOUND = 8899;
		int count = 0;

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			// The loop index variable number = 1, 2, 3, ..., 99, 100
			sum += number;     // same as "sum = sum + number"
					++count;
		}
		// Compute average in double. Beware that int / int produces int!
		average = (double) sum/(UPPERBOUND-LOWERBOUND+1);
		// Print sum and average
		System.out.println("The sum is : "+sum+" , and the average is :"+average+" , and the counted numbers are :"+count); 
	}

	public static void SumOfSquaresAverageRunningInt() {
		// Define variables
		int sum = 0;          // The accumulated sum, init to 0
		double average;       // average in double
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;
		int count = 0;

		// Use a for-loop to sum from lowerbound to upperbound
		for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			// The loop index variable number = 1, 2, 3, ..., 99, 100
			sum *= number;     // same as "sum = sum + number"
					++count;
		}
		// Compute average in double. Beware that int / int produces int!
		average = (double) sum/(UPPERBOUND-LOWERBOUND+1);
		// Print sum and average
		System.out.println("The product is : "+sum+" , and the average is :"+average+" , and the counted numbers are :"+count); 
	}

	public static void SumOddEvenAndDifference() {
		// Define variables
		int sumOdd  = 0;   // Accumulating sum of odd numbers
		int sumEven = 0;   // Accumulating sum of even numbers
		int absDiff;       // Absolute difference between the two sums
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 100;

		// Compute sums
		for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			if (number % 2 == 0) {
				sumOdd += number;
			} else {
				sumEven += number;
			}
		}
		// Compute Absolute Difference
		if (sumOdd > sumEven) {
			absDiff = sumOdd - sumEven;
		} else {
			absDiff = sumEven - sumOdd;
		}
		// OR use one liner conditional expression
		absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;
		System.out.println("sum of odd numbers :"+sumOdd+" , summ of even numbers :"+sumEven+" , and absolute difference : "+absDiff);
	}
}
package IntroductionToJavaProgramming;

public class OddEvenSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void OddEvenSum1() {
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 1000;
		int sumOdd  = 0;    // For accumulating odd numbers, init to 0
		int sumEven = 0;    // For accumulating even numbers, init to 0
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			// number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
			if (number % 2 == 0) {  // Even
				sumEven += number;   // Same as sumEven = sumEven + number
			} else {                // Odd
				sumOdd += number;    // Same as sumOdd = sumOdd + number
			}
			++number;  // Next number
		} 
		// Print the result
		System.out.println("The sum of odd numbers from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sumOdd);
		System.out.println("The sum of even numbers from " + LOWERBOUND + " to " + UPPERBOUND + "  is " + sumEven);
		System.out.println("The difference between the two sums is " + (sumOdd - sumEven));
		
		//Other functions
		ThreeFiveSevenSum();
		PrintLeapYears();
		
	}
	
	public static void ThreeFiveSevenSum() {
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 1000;
		int sumEven = 0;    // For accumulating even numbers, init to 0
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			// number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
			if ((number % 3 == 0 || number % 5 == 0 || number % 7 == 0) && (number % 15 != 0 && number % 21 != 0 && number % 35 != 0 && number % 105 != 0)) {
				sumEven += number;   // Same as sumEven = sumEven + number
			}
			++number;  // Next number
		} 
		// Print the result
		System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + "  is " + sumEven);

	}
	
	public static void PrintLeapYears() {
		final int LOWERBOUND = 999;
		final int UPPERBOUND = 2010;
		int count = 0;    // For accumulating even numbers, init to 0
		int number = LOWERBOUND;
		while (number <= UPPERBOUND) {
			// number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
			if (number % 4 == 0) {  // Even
				count += 1;   // Same as sumEven = sumEven + number
			}
			++number;  // Next number
		} 
		// Print the result
		System.out.println("The sum of the leap years is from " + LOWERBOUND + " to " + UPPERBOUND + "  is " + count);

	}
	
	
}

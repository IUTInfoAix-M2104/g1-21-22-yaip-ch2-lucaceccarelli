package IntroductionToJavaProgramming;

public class RunningNumberSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunningNumberSum1();

	}
	
	public static void RunningNumberSum1() {
		final int LOWERBOUND = 1;      // Store the lowerbound
	      final int UPPERBOUND = 1000;   // Store the upperbound
	      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
	                     // Set the initial sum to 0
	      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
	      int number = LOWERBOUND;
	      while (number <= UPPERBOUND) {
	            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
	         sum = sum + number;  // Accumulate number into sum
	         ++number;            // increment number
	      }
	      // Print the result
	      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
	
	public static void RunningNumberSum2() {
		final int LOWERBOUND = 9;      // Store the lowerbound
	      final int UPPERBOUND = 899;   // Store the upperbound
	      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
	                     // Set the initial sum to 0
	      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
	      int number = LOWERBOUND;
	      while (number <= UPPERBOUND) {
	            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
	         sum = sum + number;  // Accumulate number into sum
	         ++number;            // increment number
	      }
	      // Print the result
	      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}

	public static void RunningNumberOddSum() {
		final int LOWERBOUND = 1;      // Store the lowerbound
	      final int UPPERBOUND = 1000;   // Store the upperbound
	      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
	                     // Set the initial sum to 0
	      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
	      int number = LOWERBOUND;
	      while (number <= UPPERBOUND) {
	            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
	    	 if(number %2 == 0) {
	         sum = sum + number;  // Accumulate number into sum
	    	 }
	         ++number;            // increment number
	      }
	      // Print the result
	      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
	
	public static void RunningNumberMod7Sum() {
		final int LOWERBOUND = 1;      // Store the lowerbound
	      final int UPPERBOUND = 1000;   // Store the upperbound
	      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
	                     // Set the initial sum to 0
	      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
	      int number = LOWERBOUND;
	      while (number <= UPPERBOUND) {
	            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
	    	 if(number %7 == 0) {
	         sum = sum + number;  // Accumulate number into sum
	    	 }
	         ++number;            // increment number
	      }
	      // Print the result
	      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
	
	public static void RunningNumberSquareSum() {
		final int LOWERBOUND = 1;      // Store the lowerbound
	      final int UPPERBOUND = 1000;   // Store the upperbound
	      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
	                     // Set the initial sum to 0
	      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
	      int number = LOWERBOUND;
	      while (number <= UPPERBOUND) {
	            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
	         sum = sum + number*number;  // Accumulate number into sum
	         ++number;            // increment number
	      }
	      // Print the result
	      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
	
	public static void RunningNumberProduct() {
		final int LOWERBOUND = 1;      // Store the lowerbound
	      final int UPPERBOUND = 1000;   // Store the upperbound
	      int sum = 0;   // Declare an int variable "sum" to accumulate the numbers
	                     // Set the initial sum to 0
	      // Use a while-loop to repeatedly sum from the lowerbound to the upperbound
	      int number = LOWERBOUND;
	      while (number <= UPPERBOUND) {
	            // number = LOWERBOUND, LOWERBOUND+1, LOWERBOUND+2, ..., UPPERBOUND for each iteration
	         sum = sum * number;  // Accumulate number into sum
	         ++number;            // increment number
	      }
	      // Print the result
	      System.out.println("The sum from " + LOWERBOUND + " to " + UPPERBOUND + " is " + sum);
	}
}

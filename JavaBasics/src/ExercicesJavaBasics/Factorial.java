package ExercicesJavaBasics;

public class Factorial {

	// Print factorial of n
	public static void main(String[] args) {

		int n = 20;
		long factorial = 1;

		// n! = 1*2*3...*n
		for (int i = 1; i <= n; i++) {  // i = 1, 2, 3, ..., n
			factorial = factorial * i;   // *
		}
		System.out.println("The Factorial of " + n + " is " + factorial);
	}

}



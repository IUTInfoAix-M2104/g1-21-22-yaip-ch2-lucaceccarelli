package ExercicesJavaBasics;

public class ComputePI {

	public static void main(String[] args) {
		double sum = 0.0;
		int MAX_DENOMINATOR = 1000;   // Try 10000, 100000, 1000000
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
			// denominator = 1, 3, 5, 7, ..., MAX_DENOMINATOR
			if (denominator % 4 == 1) {
				sum += (double) 1/denominator;
			} else if (denominator % 4 == 3) {
				sum -= (double) 1/denominator;
			} else {   // remainder of 0 or 2
				System.out.println("Impossible!!!");
			}
		}
		System.out.println("We calculated pi as : "+sum);
		System.out.println("precise as : "+(sum/Math.PI)/100);
	}

	public static void secondMethodComputePi() {

		int MAX_TERM = 10000;  // number of terms used in computation
		double sum = 0.0;
		for (int term = 1; term <= MAX_TERM; term++) {  // term = 1, 2, 3, ..., MAX_TERM
			// term = 1, 2, 3, 4, ..., MAX_TERM
			if (term % 2 == 1) {  // odd term number: add
				sum += (double) 1.0 / (term * 2 - 1);
			} else {              // even term number: subtract
				sum -= (double) 1.0 / (term * 2 - 1);
			}
		}
		System.out.println("We calculated pi as : "+sum);
		System.out.println("precise as : "+(sum/Math.PI)/100);
	}

}

package ExercicesJavaBasics;

import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		int number;
		
		Scanner in = new Scanner(System.in);  // Scan the keyboard
		System.out.println("Enter a number:");
		number=in.nextInt();
		in.close();
		
		if(isOdd(number)) {
			System.out.printf("%d is an odd number", number);
		}else {
			System.out.printf("%d is an even number", number);
		}
	}

	public static boolean isOdd(int number) {
		return number%2 == 1;
	}
}

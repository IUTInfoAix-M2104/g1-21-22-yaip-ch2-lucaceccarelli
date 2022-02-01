package ExercicesJavaBasics;

import java.util.Scanner;

public class Swap2Integers {

	public static void main(String[] args) {

		int number1, number2, swap;
		
		Scanner in = new Scanner(System.in);  // Scan the keyboard
		System.out.println("Enter first integer : ");
		number1 = in.nextInt();
		System.out.println("Enter second integer : ");
		number2 = in.nextInt();
		in.close();
		
		swap = number1;
		number1 = number2;
		number2 = swap;
		
		System.out.println("After the swap, first integer is: "+number1+", second integer is:"+number2);
		
	}

}

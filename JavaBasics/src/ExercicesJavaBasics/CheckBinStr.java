package ExercicesJavaBasics;

import java.util.Scanner;

public class CheckBinStr {
	public static void main(String[] args) {
		// Declare variables
		String inStr;     // The input string
		int inStrLen;     // The length of the input string
		char inChar;      // Each char of the input string
		boolean isValid;  // "is" or "is not" a valid binary string?
		//......

		Scanner in = new Scanner(System.in);  // Scan the keyboard
		System.out.println("Enter a binary string:");
		inStr = in.next();
		in.close();
		
		inStrLen = inStr.length();
		
		isValid = true;  // Assume that the input is valid, unless our check fails
		for (int charIdx = 0; charIdx<inStrLen; ++charIdx) {
			inChar = inStr.charAt(charIdx);
			if (!(inChar == '0' || inChar == '1')) {
				isValid = false;
				break;  // break the loop upon first error, no need to continue for more errors
				// If this is not encountered, isValid remains true after the loop.
			}
		}
		if (isValid) {
			System.out.printf("'%s' is a binary string",inStr);
		} else {
			System.out.printf("'%s' is NOT a binary string",inStr);
		}
		// or using one liner
		//System.out.println(isValid ? inStr+" is a binary string" : inStr+" is NOT a binary string");
	}
}

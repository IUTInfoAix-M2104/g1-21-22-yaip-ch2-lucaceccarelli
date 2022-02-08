package ExercicesJavaBasics;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		// Define variables
		String inStr;        // input String
		int inStrLen;        // length of the input String
		String reverseInStr = "";
		
		// Prompt and read input as "String"
		Scanner in = new Scanner(System.in);  // Scan the keyboard
		System.out.println("Enter a String :");
		inStr= in.next();
		in.close();
		
		inStrLen = inStr.length();

		// Use inStr.charAt(index) in a loop to extract each character
		// The String's index begins at 0 from the left.
		// Process the String from the right
		for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {  
			// charIdx = inStrLen-1, inStrLen-2, ... ,0
			reverseInStr += inStr.charAt(charIdx);
		}
		
		System.out.printf("The reverse of the String '%s' is '%s'.",inStr,reverseInStr);
	}

}

package ExercicesJavaBasics;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
	      // Declare variables
		
		
	      final int NUM_ITEMS;
	      int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known

	      Scanner in = new Scanner(System.in);  // Scan the keyboard
	      // Prompt for for the number of items and read the input as "int"

			System.out.println("Enter the number of items:");
			NUM_ITEMS = in.nextInt();
			//in.close();

	      // Allocate the array
	      items = new int[NUM_ITEMS];

	      // Prompt and read the items into the "int" array, if array length > 0
	      System.out.println("Enter the value of all items (separated by space):");



	      if (items.length > 0) {
	         //......
	         for (int i = 0; i < items.length; ++i) {  // Read all items
	           // ......
	        	 items[i]=in.nextInt();
	         }
	      }
	      in.close();

	      // Print array contents, need to handle first item and subsequent items differently
	      System.out.print("The values are:");
	      for (int i = 0; i < items.length; ++i) {
	         if (i == 0) {
	            // Print the first item without a leading commas
	        	 System.out.print("["+items[i]);
	         } else {
	            // Print the subsequent items with a leading commas
	        	 System.out.print(", "+items[i]);
	         }
	         // or, using a one liner
	         //System.out.print((i == 0) ? "["+items[i] : ", "+items[i]);
	      }
	      System.out.print("]");
	}

}

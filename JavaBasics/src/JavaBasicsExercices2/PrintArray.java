package JavaBasicsExercices2;

public class PrintArray {

	public static void main(String[] args) {
		// Declare variables
		final int NUM_ITEMS;
		int[] items;  // Declare array name, to be allocated after NUM_ITEMS is known


		// Prompt for for the number of items and read the input as "int"

		NUM_ITEMS = 5;

		// Allocate the array
		items = new int[NUM_ITEMS];

		// Prompt and read the items into the "int" array, if array length > 0
		if (items.length > 0) {

			for (int i = 0; i < items.length; ++i) {  // Read all items
				items[i] = i;
			}
		}

		// Print array contents, need to handle first item and subsequent items differently

		for (int i = 0; i < items.length; ++i) {
			if (i == 0) {
				// Print the first item without a leading commas
				System.out.println(items[i] + ":");

			} else {
				// Print the subsequent items with a leading commas
				System.out.println(items[i]);
			}
			// or, using a one liner
			//System.out.print((i == 0) ? items[i] + ":" : items[i]);
		}
	}

	//Example taken from the lesson 
	public static void arraySythaxe() {
		int[] marks; // Declare an int array named "marks"
		// "marks" is assigned to a special value
		// called "null" before allocation
		int marks2 []; // Same as above , but the above syntax recommended
		marks2 = new int [5]; // Allocate 5 elements via the "new" operator
		// Declare and allocate a 20-element array in one statement
		// via "new" operator
		int[] factors = new int [20];
		// Declare , allocate a 6-element array thru initialization
		int[] numbers = {11, 22, 33, 44, 55, 66}; // size of array
		// deduced from the number of items
	}
}

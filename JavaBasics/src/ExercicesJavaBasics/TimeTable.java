package ExercicesJavaBasics;

import java.util.Scanner;

public class TimeTable {

	public static void main(String[] args) {
		int tableSize;
		
		Scanner in = new Scanner(System.in);  // Scan the keyboard
		System.out.println("Enter the table value :");
		tableSize = in.nextInt();
		in.close();
		
		System.out.print(" * |");
		for(int size = 1; size < tableSize+1; ++size) {
			System.out.printf("%4d",size);
		}
		System.out.printf("%n");
		System.out.println("----"+"----".repeat(tableSize));
		
		
		for(int row = 1; row < tableSize+1; ++row) {
			System.out.printf("%2d |",row);
			
			for(int col = 1; col < tableSize+1; ++col) {
				System.out.printf("%4d",col*row);
			}
			
			System.out.printf("%n");
		}
	}

}

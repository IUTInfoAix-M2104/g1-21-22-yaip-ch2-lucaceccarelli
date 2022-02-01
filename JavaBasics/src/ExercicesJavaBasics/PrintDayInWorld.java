package ExercicesJavaBasics;

public class PrintDayInWorld {

	public static void main(String[] args) {
		int number = 5;  // Set the value of "number" here!

		// Using nested-if
		if (number == 0) {   // Use == for comparison
			System.out.println( "MONDAY");
		} else if ( number == 1 ) {
			System.out.println( "TUESDAY");
		} else if ( number == 2 ) {
			System.out.println( "WEDNSDAY");
		} else if ( number == 3 ) {
			System.out.println( "THYRSDAY");
		} else if ( number == 4 ) {
			System.out.println( "FRIDAY");
		} else if ( number == 5 ) {
			System.out.println( "SATURDAY");
		} else if ( number == 6 ) {
			System.out.println( "SUNDAY");
		} else{
			System.out.println( "Not a valid day");
		}

		// Using switch-case-default
		switch(number) {
		case 0: 
			System.out.println( "MONDAY" ); break;  // Don't forget the "break" after each case!
		case 1: 
			System.out.println( "TUESDAY"); break;
		case 2: 
			System.out.println( "WEDNSDAY" ); break;
		case 3: 
			System.out.println( "THYRSDAY" ); break;
		case 4: 
			System.out.println( "FRIDAY" ); break;
		case 5: 
			System.out.println( "SATURDAY"); break;
		case 6: 
			System.out.println( "SUNDAY" ); break;
		default: System.out.println( "Not a valid day"); 
		}
	}

}

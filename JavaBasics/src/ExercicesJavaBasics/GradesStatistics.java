package ExercicesJavaBasics;

import java.util.Scanner;

public class GradesStatistics {

	public static void main(String[] args) {
		
		int numStudents, grade;
		int grades[];
		double average = 0;
		int minimum = 0; 
		int maximum = 0;
		
		 Scanner in = new Scanner(System.in);  // Scan the keyboard
		 System.out.println("Enter the number of students:");
		 numStudents = in.nextInt();
		 
		 
		 grades = new int[numStudents];
		 
		 if(!(numStudents == 0)) {
			 for(int i =0; i<numStudents;) {
				 System.out.printf("Enter the grade for student %d:", i+1);
				 grade = in.nextInt();
				 if(grade>=0 && grade<=100) {
					 grades[i]=grade;
					 ++i;
				 }
			 }
			 in.close();
			 
			 minimum = grades[0];
			 maximum = grades[0];
			 
			 for(int studentGrade : grades) {
				 average+=studentGrade;
				 if(studentGrade<minimum) {
					 minimum = studentGrade;
				 }
				 if(studentGrade>maximum) {
					 maximum = studentGrade;
				 }
			 }
			 average = average/numStudents;
		 }
		
		 System.out.printf("The average is: %.2f%n",average);
		 System.out.println("The minimum is: "+minimum);
		 System.out.println("The maximum is: "+maximum);
	}

}

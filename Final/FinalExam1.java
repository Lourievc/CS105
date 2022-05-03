/*
 * Program: Final Exam 1
 * Name: Lourie Valenzuela
 * Date: 12/14/2021
 * Instructor: Jeff Light
 * Description: Strings
 */
package Final;

import java.util.Scanner;

public class FinalExam1 {
	public static void main(String[] args) {
		//Declaring variables
		Scanner in = new Scanner(System.in);
		String answer = "", name = "", ward = "";
		int males = 0;
		int females = 0;
		boolean done = false;

		//Printing questions //start of program
		System.out.print("Please enter your name: ");
		name = in.nextLine();

		System.out.print("\n\nPlease enter the name of your Ward: ");
		ward = in.nextLine();
		
		//validation of question 3
		while (!done) {
			System.out.print("\n\nPlease enter the approximate number of adult males in the ward: ");
			answer = in.nextLine();

			try {
				males = Integer.parseInt(answer);
				done = true;

			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
			}

		}// end of 1st while
		
		//validation for question 4
		done = false;
		while (!done) {
			System.out.print("\n\nPlease enter the approximate number of adult females in the ward: ");
			answer = in.nextLine();

			try {
				females = Integer.parseInt(answer);
				done = true;

			} catch (Exception e) {
				System.out.println("Invalid response. Please enter a whole number.");
			}

		}// end of 2nd while
		
		//equation to get the total number of members
		int result = males + females;
		
		//printing out the total number of members using printf()
		System.out.printf("\n\nThere are %d adult members in %s's %s ward.", result, name, ward);

	}// end of main()

}// end of class FinalExam1
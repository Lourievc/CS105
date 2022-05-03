/*
 * Program: Final Exam 2
 * Name: Lourie Valenzuela
 * Date: 12/14/2021
 * Instructor: Jeff Light
 * Description: Arrays and Functions
 */
package Final;

import java.util.ArrayList;
import java.util.Scanner;

public class FinalExam2 {

	public static void main(String[] args) {
		//declaring variables
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		String input = "";
		int num = 0;
		boolean done = false;

		//initializing program
		System.out.println("In this program, you will ask the user to enter a list of numbers. "
				+ "\nThe program will then find the sum of the numbers and determine which of the numbers is the largest.\n\n");
		
		// while loop to add to the array
		while (!done) {
			System.out.print("Please enter a number (or just hit enter to finish): ");
			input = in.nextLine();
			
			if (input.equals("")) {
				done = true;
			} else
			try {
				num = Integer.parseInt(input);
				numbers.add(num);
			} catch (Exception e) {
				System.out.println("Invalid number. ");
			}
		} // end of while
		
		//printing the results
		System.out.println("\n\nThe sum of the list of numbers is: " + addNumbers(numbers));
		System.out.print("The largest number in the list is: " + largestNumber(numbers));
	}// end of main()

	//method to add all the values in the array
	public static int addNumbers(ArrayList<Integer> numbers) {
		int totalValue = 0;
		for (int i = 0; i < numbers.size(); i ++) {
			totalValue = totalValue + numbers.get(i);
		}

		return totalValue;
	}// end of addNumbers method

	//method to find the largest number
	public static int largestNumber(ArrayList<Integer> numbers) {
		int lNumber = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (i == 0) {
				lNumber = numbers.get(i);
			} else {
				if (numbers.get(i) > lNumber) {
					lNumber = numbers.get(i);
				}
			}
		}
		
		return lNumber;
	}// end of largestNumber method

}// end of class FinalExam2

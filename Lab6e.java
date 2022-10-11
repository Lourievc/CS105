package week6; // Lourie Valenzuela & Chalita

import java.util.Scanner;

public class Lab6e {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String input = "", answer1 = "";
		boolean playAgain = true;

		while (playAgain) {

			System.out.println("This program will ask the user to enter something and "
					+ "then print out a reversed version of the user's input.\n");

			System.out.print("Please enter something: ");
			input = in.nextLine();

			System.out.println("Using the for loop: The reverse of '" + input + "' is: " + reverseWithForLoop(input));

			System.out
					.println("Using the while loop: The reverse of '" + input + "' is: " + reverseWithWhileLoop(input));

			boolean valid = false;

			while (!valid) {

				System.out.print("Would you like to play again? ");
				answer1 = in.nextLine();

				if (answer1.equalsIgnoreCase("Y") || answer1.equalsIgnoreCase("N")) {
					valid = true;

				} else {

					System.out.println("Error: Please answer with a 'Y' or 'N'.");
					valid = false;
				}

				if (answer1.equalsIgnoreCase("n")) {
					playAgain = false;
				}
			}

		} // end of playAgain while loop
		
		System.out.println("Game Over");

	} // end of main

	public static String reverseWithForLoop(String answer) {
		String rev = "";
		for (int i = answer.length() - 1; i >= 0; i--) {
			rev = rev + answer.charAt(i);
		}
		return rev;
	} // end of reverseWithForLoop function

	public static String reverseWithWhileLoop(String answerII) {
		String rev = "";
		int i = answerII.length() - 1;

		while (i >= 0) {
			rev = rev + answerII.charAt(i);
			i--;
		}
		return rev;
	} // end of reverseWithWhileLoop function

}

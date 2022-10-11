//Lourie Valenzuela and Moroni Chalita
package Week6;

import java.util.Scanner;

public class lab6b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String answer1 = "", answer2 = "";
		boolean valid = false, playAgain = true;
		int num1 = 0, num2 = 0;
		
		System.out.println("This program will ask the user for 2 numbers and raise the "
				+ "first number to the power of the second.\n");

		while (playAgain) {

			valid = false;
			while (!valid) {
				System.out.print("Please enter the first number: ");
				answer1 = in.nextLine();

				try {
					num1 = Integer.parseInt(answer1);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			}
			valid = false;
			while (!valid) {
				System.out.print("Please enter the second number: ");
				answer2 = in.nextLine();

				try {

					num2 = Integer.parseInt(answer2);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");

				}
			}
			
			power(num1, num2);

			//System.out.printf("The largest of the three numbers is: %d.%n", result);
			System.out.println(num1 + " raised to the power of " + num2 + " is: " + power(num1, num2) + ".");

			valid = false;

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
		}
	}

	public static int power(int base, int exponent) {
		
		int result = 1;
		result = 1;
		for(int i = 1; i <= exponent; i++) {
		result = result * base;
		}
		return result;
	}
}





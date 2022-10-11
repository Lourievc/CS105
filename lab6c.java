//Moroni Chalita and Lourie Valenzuela
package Week6;

import java.util.Scanner;

public class lab6c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		String answer1 = "", answer2 = "", answer3 = "";
		boolean valid = false, playAgain = true;
		int num1 = 0, num2 = 0, num3 = 0;

		System.out.println("This program will ask the user for 3 numbers and determine if the "
				+ "second number lies between the first and the third.\n");

		while (playAgain) {

			valid = false;
			while (!valid) {
				System.out.println("Please enter the low number: ");
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
				System.out.println("Please enter the number to be tested (the between number): ");
				answer2 = in.nextLine();

				try {

					num2 = Integer.parseInt(answer2);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");

				}
			}
			valid = false;
			while (!valid) {
				System.out.println("Please enter the high number: ");
				answer3 = in.nextLine();

				try {
					num3 = Integer.parseInt(answer3);

					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				}
			}
			if (isBetween(num1, num2, num3) == true) {
				System.out.println(num2 + " lies between the numbers " + num1 + " and " + num3);
			}
			else {
				System.out.println(num2 + " DOES NOT lie between the numbers " + num1 + " and " + num3);
				
			}
			
			valid = false;

			while (!valid) {

				System.out.println("Would you like to play again? ");
				answer1 = in.nextLine();

				if (answer1.equalsIgnoreCase("Y") || answer1.equalsIgnoreCase("N")) {
					valid = true;

				} else {

					System.out.println("Error: Please answer with a 'Y' or 'N'. \n");
					valid = false;
				}

				if (answer1.equalsIgnoreCase("n")) {
					playAgain = false;
				}

			}

		}
	}

	public static boolean isBetween(int fNum, int sNum, int tNum) {
		if (fNum < sNum && fNum < tNum)
			return true;
			
		//else if (sNum >= fNum && sNum >= tNum)
			//return false;
			
		else
			
		return false;
		
	}
}
	

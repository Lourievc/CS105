package Week4;

import java.util.Scanner;

public class lab4d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String input = "";
		boolean win = false, valid = false, playAgain = true;
		int randNum, num = 0, cnt = 0;
		
		while (playAgain) {
			randNum = (int)(Math.random() * (100 - 1 + 1)) + 1;
			System.out.println("This program is a guessing game.");
			System.out.println("The computer will generate a random integer between 1 and 100. The user will try to guess the number.");
			System.out.println("Let's get started!\n");
			System.out.println("I'm thinking of a number between 1 and 100.");
			
			while (!win) {
				valid = false;
				while (!valid) {
					System.out.print("What is your guess?");
					input = in.nextLine();
					
					try {
						num = Integer.parseInt(input);
						valid = true;
					} catch (Exception e) {
						System.out.println("Error: Please enter a whole number.");
					}
				}
				
				if (randNum < num) {
					System.out.println("Your guess is too high. Try again.");
					cnt++;
				} else if (randNum > num) {
					System.out.println("Your guess is too low. Try again.");
					cnt++;
				} else {
					System.out.println("CORRECT! You guessed it in " + cnt + " tries!!");
					win = true;
				}
				valid = false;
			}
			
			valid = false;
			while (!valid) {
				System.out.print("Would you like to play again?");
				input = in.nextLine();
				if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.println("Error: Please answer with a 'Y' or 'N'.");
				}
			}//end of while
			
			if (input.equalsIgnoreCase("n")) {
				playAgain = false;
			}
		}
		
	}

}

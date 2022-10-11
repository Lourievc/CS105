//Lourie Valenzuela
package Week5;

import java.util.Scanner;

public class lab5i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String answer1 = "", answer2 = "", answer3 = "";
		boolean valid = false, playAgain = true;
		int num1 = 0, num2 =0, num3 = 0;
		
		
		while (playAgain) {
		
		valid = false;
		while (!valid) {
			System.out.println("Please enter the starting number: ");
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
			System.out.println("Please enter the ending number: ");
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
			System.out.println("Please enter the multiplier: ");
			answer3 = in.nextLine();
			
			try {
			num3 = Integer.parseInt(answer3);
			
			valid = true;
			} catch (Exception e) { 
				System.out.println("Invalid response: Please enter a whole number.");
			}
			
		} 
		valid = false;
		for (int i = num1; i <= num2; i++) {
			System.out.println("Multiplying " + i + " by " + num3 + " results in: " + i*num3 + "\n");
		} 
		valid = false;
		
		while(!valid) {
		
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
}
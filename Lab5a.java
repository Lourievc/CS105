//Moroni and Lourie
package Week5;

import java.util.Scanner;

public class Lab5a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String answer1 = "", answer2 = "", answer3 = "";
		boolean valid = false, playAgain = true;
		int num1 = 0, num2 =0, num3 = 0;
		
		
		while (playAgain) {
		
		valid = false;
		while (!valid) {
			System.out.println("Enter the starting number: ");
			answer1 = in.nextLine();
			
			try {
			num1 = Integer.parseInt(answer1);
			valid = true;
			} catch (Exception e) { 
				System.out.println("Error: Please enter a whole number.");
			}
		}
		valid = false;
		while (!valid) {
			System.out.println("Enter the ending number: ");
			answer2 = in.nextLine();
			
			try {
			
			num2 = Integer.parseInt(answer2);
			valid = true;
			} catch (Exception e) { 
				System.out.println("Error: Please enter a whole number.");
				
				}
			}
		valid = false;
		while (!valid) {
			System.out.println("Enter the test number: ");
			answer3 = in.nextLine();
			
			try {
			num3 = Integer.parseInt(answer3);
			
			valid = true;
			} catch (Exception e) { 
				System.out.println("Error: Please enter a whole number.");
			}
			
		} 
		while (!valid);
		
		valid = false;
		
		System.out.printf("Here are the numbers between %d and %d that are divisible by %d%n", num1, num2, num3); 
		
		for (int i = num1; i <= num2; i++) {
			
			if ((i % num3) == 0)
				System.out.println(i+ "\n");
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
	

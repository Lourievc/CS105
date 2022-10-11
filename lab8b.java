//Moroni Chalita and Lourie Valenzuela
package Week8;

import java.util.ArrayList;
import java.util.Scanner;

public class lab8b {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		boolean done = false, playAgain = true;
		String answer;
		int num = 0;

		System.out.println("This program will ask the user to enter a series of numbers.\n"
				+ "The user may enter as many numbers as they wish, hitting the enter key with no data when they wish to stop.\n"
				+ "The program will then display the array of numbers and the sum total of those numbers.\n" + "\n"
				+ "");

		while (playAgain) {

			done = false;
			while (!done) {
				System.out.println("Please enter a number (or just hit enter to finish): ");
				answer = in.nextLine();

				if (answer.equals("")) {
					done = true;
				} else {
					try {
						num = Integer.parseInt(answer);
						numbers.add(num);
					} catch (Exception e) {
						System.out.println("Error: Please enter a whole number.");

					} // end of try and catch
				} // end of if answer
			} // end of while

			System.out.println("Array index      Item");
			for (int i = 0; i < numbers.size(); i++) {
				System.out.println(i + "                " + numbers.get(i));
			} // end of for loop

			System.out.println("\n\nThere are " + numbers.size() + " items in the ArrayList.");
			System.out.println("The sum total of numbers in the ArrayList is " + sumValues(numbers) + ".");
			System.out.println("The following numbers were duplicated in the ArrayList: " + dups(numbers) + ".");

			done = false;

			while (!done) {

				System.out.println("Would you like to play again? ");
				answer = in.nextLine();

				if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
					done = true;

				} else {

					System.out.println("Error: Please answer with a 'Y' or 'N'. \n");
					done = false;
				}

				if (answer.equalsIgnoreCase("n")) {
					playAgain = false;
				}

			} // end of while

		} // end of play again
	}// end of main

	public static int sumValues(ArrayList<Integer> numbers) {
		int totalValue = 0;
		for (int i = 0; i < numbers.size(); i++) {
			totalValue = totalValue + numbers.get(i);

		} // end of for loop

		return totalValue;

	}// end of sum values
	
	public static ArrayList<Integer> dups(ArrayList<Integer> numbers){
		ArrayList<Integer> newList = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.subList(i + 1, numbers.size()).contains(numbers.get(i))) {
				newList.add(numbers.get(i));
				
			}
		}
		
		
			return newList;
	}//end of Dups

}//end of class

//Moroni Chalita and Lourie Valenzuela 
package Week7;

import java.util.Scanner;
import java.lang.Math;

public class lab7b {

	public static void main(String[] args) {
		Scanner iIn = new Scanner(System.in);

		boolean valid = false;
		boolean playAgain = true;
		String input = "";

		System.out.println(
				"This program will use the Pythagorean Theorem to calculate the length of one side of a right triangle given the other two sides.\r\n"
						+ "The program will ask the user which side they wish to calculate and the lengths of the other two sides.\r\n"
						+ "Assume that the three sides are called a, b, and c where c is the hypotenuse (the side opposite the right angle)");

		while (playAgain) {

			while (!valid) {

				System.out.println("Which side of the triangle do you wish to calculate? (a/b/c): ");
				input = iIn.next();
				if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("b") || input.equalsIgnoreCase("c")) {
					valid = true;
				} else {
					System.out.println("Invalid response: please answer with 'a', 'b', or 'c'.");
				}
			} // end of while
			valid = false;
			if (input.equalsIgnoreCase("a")) {
				calculateSideA();
			}
			if (input.equalsIgnoreCase("b")) {
				calculateSideB();
			}
			if (input.equalsIgnoreCase("c")) {
				calculateSideC();
			}
			while (!valid) {
				System.out.println("Would you like to play again? ");
				input = iIn.next();
				if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					valid = true;
				} else {
					System.out.println("Invalid response: Please answer with 'Y' or 'N'");
					iIn.next();
					
				}
			}//end while
			valid = false;
			if (input.equalsIgnoreCase("n")) {
				playAgain = false;
			}
		}// end of play again 
	} // end of main

	public static void calculateSideA() {
		double numA, numB, numC;
		numB = getSideLength("b");
		numC = getSideLength("c");
		// numA =Math.sqrt((numC*numC)-(numB*numB));
		numA = Math.sqrt(Math.pow(numC, 2) - Math.pow(numB, 2));
		System.out.println("A right triangle with side 'b' = ");
		System.out.printf("%, .0f", numB);
		System.out.println(" and 'c' (hypotenuse) = ");
		System.out.printf("%, .0f", numC);
		System.out.println(", has a side 'a' which has a length of: ");
		System.out.printf("%, .1f \n", numA);

	}//end of calculate side a

	public static void calculateSideB() {
		double numA, numB, numC;
		numA = getSideLength("a");
		numC = getSideLength("c");
		// numA =Math.sqrt((numC*numC)-(numB*numB));
		numB = Math.sqrt(Math.pow(numC, 2) - Math.pow(numA, 2));
		System.out.println("A right triangle with side 'a' = ");
		System.out.printf("%, .0f", numA);
		System.out.println(" and 'c' (hypotenuse) = ");
		System.out.printf("%, .0f", numC);
		System.out.println(", has a side 'b' which has a length of: ");
		System.out.printf("%, .1f \n", numB);
	}//end of calculate side b

	public static void calculateSideC() {
		double numA, numB, numC;
		numA = getSideLength("a");
		numB = getSideLength("b");
		numC = Math.sqrt(Math.pow(numA, 2) + Math.pow(numB, 2));
		System.out.println("A right triangle with side 'a' = ");
		System.out.printf("%, .0f", numA);
		System.out.println(" and side 'b' = ");
		System.out.printf("%, .0f", numB);
		System.out.println(", has a side 'c' (hypotenuse) which has a length of: ");
		System.out.printf("%, .1f \n", numC);
	}//end of calculate side c

	public static double getSideLength(String letter) {
		boolean valid = false;
		Scanner nIn = new Scanner(System.in); // for number
		double number = 0;

		while (!valid) {
			System.out.println("Please enter the length of side " + letter + ": ");
			// if block to check if initial input is valid
			try {
				number = nIn.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.println("Invalid response: please enter a whole number.");
				nIn.next();

			}
		}//end of while validation

		return number;
	}//end of get side length
}//end of class

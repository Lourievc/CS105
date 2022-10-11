//Moroni Chalita & Lourie Valenzuela
package Week7;

import java.time.LocalDate;
import java.util.Scanner;

public class lab7a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = "";
		String answer1 = "";
		String yearAnswer = "";
		int year = 0;
		boolean playAgain = true, valid = false, isQuestion = false;

		System.out.println("This program will ask the user to enter a name and a birth year for a potential student.\n"
				+ "The program will then determine what type of school, if any, the potential student is eligible to attend.");

		while (playAgain) {

			valid = false;
			System.out.println("Please enter the name of a potential student: ");
			name = in.nextLine();

			System.out.println("Please enter the year the potential student was born: ");
			while (!valid) {
				yearAnswer = in.nextLine();
				try {
					year = Integer.parseInt(yearAnswer);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response. Please enter a whole number for the birth year. ");
				}
			}

			checkEligibility(name, year);
			isQuestion = false;

			while (!isQuestion) {
				System.out.println("Would you like to play again? ");
				answer1 = in.nextLine();
				if (answer1.equalsIgnoreCase("Y") || answer1.equalsIgnoreCase("N")) {
					isQuestion = true;
					if (answer1.equalsIgnoreCase("n")) {
						playAgain = false;
					}
				} else {
					System.out.println("Error: Please enter 'Y' or 'N'");
				}

			} // end of Y/N question

		} // end of play again

	}// end of main

	public static void checkEligibility(String name, int year) {
		int age = calculateAge(year);
		if (age <= 4) {
			System.out.println(name + " is " + age + " years old. " + name + " is too young to attend school.");
		} else if (age > 4 && age <= 11) {
			System.out.println(name + " is " + age + " years old. " + name + " may attend Elementary School.");
		} else if (age > 11 && age <= 14) {
			System.out.println(name + " is " + age + " years old. " + name + " may attend Jr. High School.");
		} else if (age > 14 && age <= 17) {
			System.out.println(name + " is " + age + " years old. " + name + " may attend High School.");
		} else {
			System.out.println(name + " is " + age + " years old. " + name + " may attend College.");
		}

	}// end of Check eligibility

	public static int calculateAge(int year) {
		int age = 0;
		LocalDate now = LocalDate.now();
		int thisYear = now.getYear();
		age = thisYear - year;
		return age;

	}// end of calculate age
}// end of class
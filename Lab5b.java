package week5; //Lourie Valenzuela, Moroni Chalita

import java.util.Scanner;

public class Lab5b {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		boolean newCalculation = false;

		while (!newCalculation) {

			boolean valid = false;
			double amountDeposited = 0;
			double interestRate = 0;
			int monthsToSave = 0;
			String input = "", input1, input2;

			while (!valid) {

				System.out.print("Please enter the amount to be deposited each month: ");
				input = in.nextLine();

				try {
					amountDeposited = Double.parseDouble(input);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				} // end of try and catch

			} // end of first input validation

			valid = false;

			while (!valid) {

				System.out.print("Please enter the annual interest rate: ");
				input1 = in.nextLine();

				try {
					interestRate = Double.parseDouble(input1);
					interestRate = interestRate / 100 / 12;
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				} // end of try and catch
			} // end of second input validation

			valid = false;

			while (!valid) {
				
				System.out.print("Please enter the number of months you plan to save: ");
				input2 = in.nextLine();

				try {
					monthsToSave = Integer.parseInt(input2);
					valid = true;
				} catch (Exception e) {
					System.out.println("Invalid response: Please enter a whole number.");
				} // end of try and catch
			} // end of third input validation

			System.out.println("The following table shows the balance of the account for each "
					+ "month of the designated savings period.");
			
			System.out.println("Month		Balance");
			
			double newBalance = 0;
			
			for (int i = 1; i <= monthsToSave; i++) {
				newBalance = (amountDeposited + newBalance) * (1 + interestRate);
				String part1 = String.format("Mpnth %d:", i);
				System.out.printf("%-12s%,.2f\n" , part1, newBalance);
			}
		
			boolean calculateAgain = false;
			
			while (!calculateAgain) {
				System.out.println("Would you like to make another calculation? ");
				input = in.nextLine();
				
				if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("N")) {
					calculateAgain = true;
				} else {
					System.out.println("Please enter a 'Y' or 'N'.");
				}
			} // end of calculateAgain loop
			
			if (input.equalsIgnoreCase("N")) {
				newCalculation = true;
			}
			
		} //end of newCalculation
		
		System.out.println("Good Bye!!!");
		
	}

}

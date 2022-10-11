//Lourie Valenzuela 
package Week7;

import java.util.Scanner;

public class lab7i {

	public static void main(String[] args) {
		String playAgain = "Y";
		while (playAgain.equalsIgnoreCase("Y")) {

			// Get an integer from the user
			int intNum = getValidInt("Please enter a whole number: ",
					"Invalid response. Only whole numbers are acceptable.");
			System.out.printf("The whole number your entered was: %d.\n", intNum);
			System.out.println("Now we will test your whole number in a math equation...");
			System.out.printf("Adding 10 to your whole number would be: 10 + %d = %d.\n", intNum, intNum + 10);
			System.out.println();

			// Get a floating-point from the user
			double doubleNum = getValidDouble("Please enter a decimal-point number: ",
					"Invalid response. Only decimal-point numbers are acceptable.");
			System.out.printf("The float your entered was: %f.\n", doubleNum);
			System.out.println("Now we will test your floating-point number in a math equation...");
			System.out.printf("Adding 10 to your float would be: 10 + %f = %f.\n", doubleNum, doubleNum + 10);
			System.out.println();

			// Get a 'Y' or 'N' from the user
			playAgain = getValidYN("Would you like to play again? (Y/N): ",
					"Invalid response. Please answer with a 'Y' or 'N'");
			System.out.println();
		} // end of while (playAgain.equalsIgnoreCase("y"))
	}// end of Main()
	public static int getValidInt(String question, String warning) {
		Scanner in = new Scanner(System.in);
		int num = 0;
		boolean valid = false;
		
		while (!valid) {
			System.out.println(question);
			try {
				num = in.nextInt();
				valid = true;
			} catch (Exception e) {
				System.out.println(warning);
				in.next();
			}	
		}// end of while
		
		return num;
	}// end of Get valid int
	public static double getValidDouble(String question, String warning) {
		Scanner in = new Scanner(System.in);
		double num = 0.0;
		boolean valid = false;
		
		while (!valid) {
			System.out.println(question);
			try {
				num = in.nextDouble();
				valid = true;
			} catch (Exception e) {
				System.out.println(warning);
				in.next();
			}	
		}// end of while
		
		return num;
	}// end of Get valid double
	public static String getValidYN(String question, String warning) {
		Scanner in = new Scanner(System.in);
		String answer = "";
		boolean valid = false;
		while(!valid) {
			System.out.println(question);
			answer = in.nextLine();
			if(answer.equalsIgnoreCase("Y")|| answer.equalsIgnoreCase("N")) {
				valid = true;
			} else {
				System.out.println(warning);
			}
		}
		return answer;

	}

}

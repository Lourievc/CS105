//Jinook and Lourie  
package Week4;

import java.util.Scanner;

public class Lab4c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		boolean valid = false;
		String answer = "";
		
		while (!valid) {
			System.out.print("Do you like to code in Java?: ");
			answer = in.nextLine();
			if (answer.equals("Y") || answer.equals("N")) {
				valid = true;
		
			} else {
				System.out.println("Error: Please answer with a 'Y' or 'N'.");
			}
		}//end of while
		
		
		if (answer.equals("Y")) {
			System.out.print("That's great! I do too!");
		} else {
			System.out.print("That's ok. There are many other wonderful things in life to learn.");
		}
		

	}

}
